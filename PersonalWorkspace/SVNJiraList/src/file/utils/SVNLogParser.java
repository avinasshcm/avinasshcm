package file.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import pojo.SVNPojo;

public class SVNLogParser {
	private static final String FolderPath = "D:/SVNLog/Release";

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		HashMap<String, SVNPojo> svnMap = new HashMap<>();
		System.out.println("Start");
		File f = new File(FolderPath);
		for (String pathname : f.list()) {
			String fullPath = FolderPath + "/" + pathname;
			//System.out.println(fullPath);
			svnMap = parseFile(svnMap, fullPath);
		}
		processMap(svnMap);
		System.out.println("End");
	}

	private static HashMap<String, SVNPojo> parseFile(HashMap<String, SVNPojo> svnMap, String fileName) throws ParserConfigurationException, SAXException, IOException {
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		//Build Document
		Document document = builder.parse(new File(fileName));
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		//Here comes the root node
		Element root = document.getDocumentElement();
		//System.out.println(root.getNodeName());
		NodeList nList = document.getElementsByTagName("logentry");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				String jiraID = getJIRAID(eElement);
				String author = getAuthor(eElement);
				List<String> newList = getPaths(eElement);
				if (svnMap.containsKey(jiraID)) {
					SVNPojo svn = svnMap.get(jiraID);
					List<String> existingList = svn.getPaths();
					newList.stream().forEachOrdered(existingList::add);
					svn.setPaths(existingList);
					List<String> authorList = svn.getAuthors();
					authorList.add(author);
					svn.setAuthors(authorList);
					svnMap.put(jiraID, svn);
				}
				else {
					SVNPojo svn = new SVNPojo();
					List<String> authorList = new ArrayList<String>();
					authorList.add(author);
					svn.setAuthors(authorList);
					svn.setPaths(newList);
					svn.setJiraID(jiraID);
					svnMap.put(jiraID, svn);
				}
			}
		}
		return svnMap;
	}

	private static void processMap(HashMap<String, SVNPojo> svnMap) {
		for (Map.Entry<String, SVNPojo> entry : svnMap.entrySet()) {
			printResults(entry, entry.getValue());
		}
	}

	private static void printResults(Map.Entry<String, SVNPojo> entry, SVNPojo ap) {
		System.out.println("");
		//JIRA ID
		System.out.print(ap.getJiraID() + "\t");
		//Authors
		List<String> distinctAuthor = ap.getAuthors().stream().distinct().sorted().collect(Collectors.toList());
		Stream<String> stream = Stream.of(distinctAuthor.toString());
		System.out.println(stream.collect(Collectors.toList()));
		//Paths
		List<String> distinctPathList = ap.getPaths().stream().distinct().sorted().collect(Collectors.toList());
		for (String path : distinctPathList) {
			System.out.println("\t\t" + path.trim());
		}
	}

	private static List<String> getPaths(Element eElement) {
		String paths = eElement.getElementsByTagName("paths").item(0).getTextContent();
		String list[] = paths.trim().split("\n");
		List<String> pathList = new ArrayList<String>();
		for (int i = 0; i < list.length; i++) {
			pathList.add(list[i]);
		}
		return pathList;
	}

	private static String getJIRAID(Element eElement) {
		String commitMessage = eElement.getElementsByTagName("msg").item(0).getTextContent();
		/*
		Pattern pat = Pattern.compile("\\[[A-Z]*\\-[0-9]*\\]"); //"\\[[A-Z0-9\\-\\,]*\\]"
		Matcher mat = pat.matcher(commitMessage);
		while (mat.find()) {
			System.out.println("Match: " + mat.group());
		}
		*/
		//System.out.println(commitMessage);
		if (commitMessage.contains("[") && commitMessage.contains("]")) {
			commitMessage = commitMessage.substring(commitMessage.indexOf("[") + 1);
			commitMessage = commitMessage.substring(0, commitMessage.indexOf("]"));
		}
		else {
			commitMessage = "";
		}
		return commitMessage;
	}

	private static String getAuthor(Element eElement) {
		String author = eElement.getElementsByTagName("author").item(0).getTextContent();
		return author;
	}
}
