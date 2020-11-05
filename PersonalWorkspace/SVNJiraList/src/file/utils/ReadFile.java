package file.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import pojo.JiraSVNMap;

public class ReadFile {

    private static final String FilePath = "C:/Users/amanjuna/Desktop/Jira-details/Original/";

    private static final String InFileName = "teller.txt";

    private static final String OutFileName = "teller_Out.txt";

    public static void main(String[] args) {
        BufferedReader reader;

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FilePath + OutFileName));

            reader = new BufferedReader(new FileReader(FilePath + InFileName));
            String line = reader.readLine();

            // List<String> allLines = Files.readAllLines(Paths.get("C:/Users/amanjuna/Desktop/Jira-details/CBS_4.txt"));
            String fileName = "";
            // List<String> jiraID = new ArrayList<String>();
            String jiraID = "";
            HashMap<String, JiraSVNMap> map = new HashMap<String, JiraSVNMap>();

            // for (String line : allLines) {
            while (line != null) {
                if (line.contains("Start of")) {
                    String currentLine = line.replace("----Start of ", "");
                    // System.out.println("Last Index : " + currentLine.lastIndexOf("/"));
                    currentLine = currentLine.substring(currentLine.lastIndexOf("/") + 1);

                    fileName = currentLine;
                    // System.out.println(fileName);
                }

                if (fileName != "" && line.contains("]")) {

                    // jiraID.add(line.substring(line.indexOf("[") + 1, line.indexOf("]")));
                    jiraID = line.substring(line.indexOf("[") + 1, line.indexOf("]"));

                    writer.write(jiraID + "\t" + fileName.trim() + "\n");
                    // System.out.println(jiraID);
                    // System.out.println(line);
                }

                if (line.contains("ENd of")) {

                    JiraSVNMap jiraSVNMap = new JiraSVNMap();
                    if (map.containsKey(jiraID)) {
                        jiraSVNMap = map.get(jiraID);
                    } else {
                        jiraSVNMap = new JiraSVNMap();
                    }

                    List<String> filesList = jiraSVNMap.getFilesList();

                    if (filesList == null || filesList.size() <= 0) {
                        filesList = new ArrayList<String>();
                    }

                    filesList.add(fileName);

                    jiraSVNMap.setFilesList(filesList);

                    map.put(jiraID, jiraSVNMap);
                    /*
                     * for (String jiraItem : jiraID) { map.put(jiraItem, jiraSVNMap); }
                     */
                    fileName = "";
                    // jiraID.clear();
                }

                processLine(line);
                // System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
            writer.close();

            Set<String> keySet = map.keySet();

            for (String item : keySet) {
                JiraSVNMap jiraSVNMap = new JiraSVNMap();
                jiraSVNMap = map.get(item);

                for (String fileNames : jiraSVNMap.getFilesList()) {
                    // System.out.println(item + "\t" + fileNames);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String line) {

    }

}