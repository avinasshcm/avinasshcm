import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import pojo.BundleAttributes;

@SuppressWarnings("deprecation")
public class CheckBuild {
	private static final String FBESSENCE = "FBEssence";
	private static final String FBETELLER = "FBETeller";
	private static final String CBS = "CBS";
	private static final String FBEPARTY = "FBEParty";
	private static final String FBP = "FBP";
	private static final String KEY_EXTN = ".key";
	private static final String BFJ_EXTN = ".bfj";
	private static final String TRUE = "true";
	private static final String WIF = "WIF";
	private static final String FBAO = "FBAO";
	private static final String FBPM = "FBPM";
	private static final String FBCBS = "FBCBS";
	private static final String FBAM = "FBAM";
	private static final String TELLER = "Teller";
	private static final String PARTY = "Party";
	private static final String FBE = "FBE";
	private static final String DOT = ".";
	private static final String UNDERSCORE = "_";
	private static final String FOLDER_SEPERATOR = "/";
	//
	private static final HashMap<String, String> parentFolderMap = getParentFolderMap();

	private static HashMap<String, String> getParentFolderMap() {
		HashMap<String, String> parentFolderMap = new HashMap<>();
		parentFolderMap.put(FBCBS, CBS);
		parentFolderMap.put(FBAO, CBS);
		parentFolderMap.put(FBAM, CBS);
		parentFolderMap.put(FBPM, CBS);
		parentFolderMap.put(PARTY, PARTY);
		parentFolderMap.put(TELLER, TELLER);
		parentFolderMap.put(FBE, FBE);
		parentFolderMap.put(FBP, FBP);
		return parentFolderMap;
	}

	//
	private static final HashMap<String, String> targetLocationMap = getTargetLocationMap();

	private static HashMap<String, String> getTargetLocationMap() {
		HashMap<String, String> targetLocationMap = new HashMap<>();
		targetLocationMap.put(FBCBS, FBCBS);
		targetLocationMap.put(FBAO, FBAO);
		targetLocationMap.put(FBAM, FBAM);
		targetLocationMap.put(FBPM, FBPM);
		targetLocationMap.put(PARTY, FBEPARTY);
		targetLocationMap.put(TELLER, FBETELLER);
		targetLocationMap.put(FBE, FBESSENCE);
		targetLocationMap.put(FBP, FBP);
		return targetLocationMap;
	}
	//

	//
	private static final HashMap<String, String> sourceLocationMap = getSourceLocationMap();

	private static HashMap<String, String> getSourceLocationMap() {
		HashMap<String, String> sourceLocationMap = new HashMap<>();
		sourceLocationMap.put(FBCBS, FBCBS);
		sourceLocationMap.put(FBAO, FBAO);
		sourceLocationMap.put(FBAM, FBAM);
		sourceLocationMap.put(FBPM, FBPM);
		sourceLocationMap.put(PARTY, FBEPARTY);
		sourceLocationMap.put(TELLER, "BranchTeller");
		sourceLocationMap.put(FBE, "UBCore");
		sourceLocationMap.put(FBP, "BFComplete");
		return sourceLocationMap;
	}

	//
	private static final HashMap<String, String> rootLocationMap = getRootLocationMap();

	private static HashMap<String, String> getRootLocationMap() {
		HashMap<String, String> rootLocationMap = new HashMap<>();
		rootLocationMap.put(FBCBS, ReadPropertyFile.CBS_Path);
		rootLocationMap.put(FBAO, ReadPropertyFile.CBS_Path);
		rootLocationMap.put(FBAM, ReadPropertyFile.CBS_Path);
		rootLocationMap.put(FBPM, ReadPropertyFile.CBS_Path);
		rootLocationMap.put(PARTY, ReadPropertyFile.PTY_Path);
		rootLocationMap.put(TELLER, ReadPropertyFile.BFT_Path);
		rootLocationMap.put(FBE, ReadPropertyFile.UB_Path);
		rootLocationMap.put(FBP, ReadPropertyFile.BFP_Path);
		return rootLocationMap;
	}
	//

	//
	private static final HashMap<String, String> specificLocationMap = getSpecificLocationMap();

	private static HashMap<String, String> getSpecificLocationMap() {
		HashMap<String, String> specificLocationMap = new HashMap<>();
		specificLocationMap.put(FBCBS, "");
		specificLocationMap.put(FBAO, "");
		specificLocationMap.put(FBAM, "");
		specificLocationMap.put(FBPM, "");
		specificLocationMap.put(PARTY, "");
		specificLocationMap.put(TELLER, "");
		specificLocationMap.put(FBE, "");
		specificLocationMap.put(FBP, "/BankFusion");
		return specificLocationMap;
	}
	//

	private static final Logger LOGGER = Logger.getLogger(CheckBuild.class.getName());
	//
	public static final String DESTINATION_FOLDER = ReadPropertyFile.Destination_Folder;
	public static final String GOOD_BUILD_FILE = ReadPropertyFile.Good_Build_File;
	//
	public static final String LAST_RELEASED_BUILD_NUMBER_TXT = "LastDeliveredBuildNumber.txt";
	public static final String FBP_PATH = ReadPropertyFile.BFP_Path + FOLDER_SEPERATOR + LAST_RELEASED_BUILD_NUMBER_TXT;
	//
	public static final String CBS_PATH = ReadPropertyFile.CBS_Path + FOLDER_SEPERATOR + GOOD_BUILD_FILE;
	public static final boolean AM_PM_REQUIRED = ReadPropertyFile.AM_PM_Required;
	public static final boolean WIF_REQUIRED = ReadPropertyFile.WIF_Required;
	public static final boolean AO_REQUIRED = ReadPropertyFile.AO_Required;
	//
	public static final String UB_PATH = ReadPropertyFile.UB_Path + FOLDER_SEPERATOR + GOOD_BUILD_FILE;
	public static final boolean UBOF_REQUIRED = ReadPropertyFile.UBOF_Required;
	public static final String PTY_PATH = ReadPropertyFile.PTY_Path + FOLDER_SEPERATOR + GOOD_BUILD_FILE;
	public static final String BFT_PATH = ReadPropertyFile.BFT_Path + FOLDER_SEPERATOR + GOOD_BUILD_FILE;
	//
	public static final String BT_SPECIFIC = ReadPropertyFile.BT_Specific;
	public static final boolean BT_SPECIFIC_REQUIRED = ReadPropertyFile.BT_Specific_Required;
	// Latest Build Numbers
	int latestFBP;
	int latestCBS;
	int latestBFAM;
	int latestBFPM;
	int latestBFAO;
	int latestWIF;
	int latestFBE;
	int latestParty;
	int latestTeller;
	// Current Build Numbers
	int currentFBP;
	int currentCBS;
	int currentBFAM;
	int currentBFPM;
	int currentBFAO;
	int currentWIF;
	int currentFBE;
	int currentParty;
	int currentTeller;
	XmlBeanFactory factory = CurrentBuildProviderBeanFactory.getFactory();
	CurrentBuildProvider currentBuildProvider = (CurrentBuildProvider) factory.getBean("CURRENT_BUILD_PROVIDER");

	public CheckBuild(String[] module) throws IOException {
		int counter = 0;
		File file = new File("LatestBuild.properties");
		file.delete();
		// Read Current Build from Respective Locations and Write it to LatestBuild.properties
		readFile(FBP_PATH, "BFP");
		readFile(CBS_PATH, CBS);
		readFile(CBS_PATH, FBAM);
		readFile(CBS_PATH, FBPM);
		readFile(CBS_PATH, FBAO);
		readFile(CBS_PATH, WIF);
		readFile(UB_PATH, "UB");
		readFile(PTY_PATH, PARTY);
		readFile(BFT_PATH, "BFT");
		// Read Latest Build Details from LatestBuild.properties
		latestFBP = ReadLatestBuild.BFP_Latest_Build;
		latestCBS = ReadLatestBuild.CBS_Latest_Build;
		latestBFAM = ReadLatestBuild.BFAM_Latest_Build;
		latestBFPM = ReadLatestBuild.BFPM_Latest_Build;
		latestBFAO = ReadLatestBuild.BFAO_Latest_Build;
		latestWIF = ReadLatestBuild.WIF_Latest_Build;
		latestFBE = ReadLatestBuild.UB_Latest_Build;
		latestParty = ReadLatestBuild.PTY_Latest_Build;
		latestTeller = ReadLatestBuild.BFT_Latest_Build;
		// Read Current Build Details from BFTB_INSTALL_HISTORY CurrentBuild.properties
		currentFBP = currentBuildProvider.getBFP_Curr_Build();
		currentCBS = currentBuildProvider.getCBS_Curr_Build();
		currentBFAM = currentBuildProvider.getBFAM_Curr_Build();
		currentBFPM = currentBuildProvider.getBFPM_Curr_Build();
		currentBFAO = currentBuildProvider.getBFAO_Curr_Build();
		currentWIF = currentBuildProvider.getWIF_Curr_Build();
		currentFBE = currentBuildProvider.getUB_Curr_Build();
		currentParty = currentBuildProvider.getPTY_Curr_Build();
		currentTeller = currentBuildProvider.getBFT_Curr_Build();
		// For BundleSequence.properties
		Map<String, String> map = new HashMap<>();
		int j = 0;
		while (j < module.length) {
			switch (Integer.parseInt(module[j])) {
			case 1:
				LOGGER.info("\n\nCopying BankFusion Patch Bundles...");
				for (int i = currentFBP + 1; i <= latestFBP; i++) {
					copyPatch(FBP, i, map, counter);
				}
				break;
			case 2:
				LOGGER.info("\nCopying CBS Patch Bundles...");
				for (int i = currentCBS + 1; i <= latestCBS; i++) {
					copyPatch(FBCBS, i, map, counter);
				}
				for (int i = currentBFAM + 1; i <= latestBFAM; i++) {
					if (AM_PM_REQUIRED) {
						copyPatch(FBAM, i, map, counter);
					}
				}
				for (int i = currentBFPM + 1; i <= latestBFPM; i++) {
					if (AM_PM_REQUIRED) {
						copyPatch(FBPM, i, map, counter);
					}
				}
				for (int i = currentBFAO + 1; i <= latestBFAO; i++) {
					if (AO_REQUIRED) {
						copyPatch(FBAO, i, map, counter);
					}
				}
				for (int i = currentWIF + 1; i <= latestWIF; i++) {
					if (WIF_REQUIRED) {
						copyPatch(WIF, i, map, counter);
					}
				}
				break;
			case 3:
				LOGGER.info("\nCopying Party Patch Bundles...");
				for (int i = currentParty + 1; i <= latestParty; i++) {
					copyPatch(PARTY, i, map, counter);
				}
				break;
			case 4:
				LOGGER.info("\nCopying UB Patch Bundles...");
				for (int i = currentFBE + 1; i <= latestFBE; i++) {
					copyPatch("FBE", i, map, counter);
					if (UBOF_REQUIRED)
						copyPatch("UBOF", i, map, counter);
				}
				break;
			case 5:
				LOGGER.info("\nCopying Teller Patch Bundles...");
				for (int i = currentTeller + 1; i <= latestTeller; i++) {
					copyPatch(TELLER, i, map, counter);
					if (BT_SPECIFIC_REQUIRED) {
						copyPatch(BT_SPECIFIC, i, map, counter);
					}
				}
				break;
			case 6:
				CreateSymbolicLinks csl = new CreateSymbolicLinks();
				csl.execute();
				break;
			case 0:
				exit(0);
			default:
				LOGGER.severe("Invalid Option...!!!!");
			}
			j++;
		}
		File sequenceFile = new File(DESTINATION_FOLDER + "/BundleSequence.properties");
		if (sequenceFile.exists()) {
			sequenceFile.delete();
		}
		PrintWriter out1 = new PrintWriter(new FileWriter(DESTINATION_FOLDER + "/BundleSequence.properties", true));
		List<String> listOfKeys = new ArrayList<>(map.keySet());
		Collections.sort(listOfKeys);
		for (int i = 0; i < listOfKeys.size(); i++) {
			map.get(listOfKeys.get(i));
			out1.println(map.get(listOfKeys.get(i)));
		}
		out1.close();
		LOGGER.info("\n\nCompleted...!!!");
	}

	private void exit(int i) {
		LOGGER.info(String.valueOf(i));
	}

	public static void main(String[] args) throws IOException {
		System.out.println("\n\nYou are about to Copy Patch Bundles.");
		System.out.println("Select your option from the list below.");
		System.out.println("For multiple options provide the input comma separated");
		System.out.println("Example : ");
		System.out.println("          (i)   For a Complete UB Copying input options as 1,2,3,4,5");
		System.out.println("...............................................");
		System.out.println("1 - BF      (Copy Patch Bundles of BF)");
		System.out.println("2 - CBS     (Copy Patch Bundles of CBS)");
		System.out.println("3 - Party   (Copy Patch Bundles of Party)");
		System.out.println("4 - UB      (Copy Patch Bundles of UB)");
		System.out.println("5 - BFT     (Copy Patch Bundles of BFT + (BTDC or BTBS))");
		System.out.println("6 - Create Symbolic Link");
		System.out.println("0 - EXIT");
		System.out.print("\nEnter Your Option : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String option = null;
		try {
			option = br.readLine();
		}
		catch (IOException ioe) {
			LOGGER.severe("IO error trying to read Input!");
			// System.exit(1);
		}
		String[] modules = option.split(",");
		CheckBuild cB = new CheckBuild(modules);
		cB.toString();
	}

	public void readFile(String fName, String module) {
		String moduleName = module;
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(fName));
			while ((sCurrentLine = br.readLine()) != null) {
				int index = sCurrentLine.lastIndexOf(DOT);
				if (index > 0) {
					String truncate = sCurrentLine.substring(index + 1);
					sCurrentLine = truncate;
				}
				PrintWriter out = new PrintWriter(new FileWriter("LatestBuild.properties", true));
				out.println(moduleName + "=" + sCurrentLine.trim());
				out.close();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null)
					br.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	private static void copyPatch(String moduleName, int buildNumber, Map<String, String> module, int counter) throws IOException {
		BundleAttributes bundleAttributes = new BundleAttributes();
		//
		//String folderName1 = rootLocationMap.get(moduleName) + FOLDER_SEPERATOR + parentFolderMap.get(moduleName) + UNDERSCORE + getPatchVersion() + buildNumber + "/PatchBundle/" + sourceLocationMap.get(moduleName) + "/Bundles" + specificLocationMap.get(moduleName) + "/PatchBundle";
		StringBuilder folderName = new StringBuilder();
		// \\misys.global.ad\bangalore\Dev\CMRE\BF\DailyBuilds\2021.9\
		folderName.append(rootLocationMap.get(moduleName)).append(FOLDER_SEPERATOR);
		// FBP_2021.9.1\
		folderName.append(parentFolderMap.get(moduleName)).append(UNDERSCORE).append(getPatchVersion()).append(buildNumber).append(FOLDER_SEPERATOR);
		// PatchBundle\
		folderName.append("PatchBundle").append(FOLDER_SEPERATOR);
		// BFComplete\
		folderName.append(sourceLocationMap.get(moduleName)).append(FOLDER_SEPERATOR);
		// Bundles\BankFusion\PatchBundle
		folderName.append("Bundles").append(specificLocationMap.get(moduleName)).append("/PatchBundle");
		// \\misys.global.ad\bangalore\Dev\CMRE\BF\DailyBuilds\2021.9\FBP_2021.9.1\PatchBundle\BFComplete\Bundles\BankFusion\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\CBS\DailyBuilds\2021.9\CBS_2021.9.1\PatchBundle\FBCBS\Bundles\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\CBS\DailyBuilds\2021.9\CBS_2021.9.1\PatchBundle\FBAM\Bundles\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\CBS\DailyBuilds\2021.9\CBS_2021.9.1\PatchBundle\FBAO\Bundles\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\CBS\DailyBuilds\2021.9\CBS_2021.9.1\PatchBundle\FBPM\Bundles\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\UB\DailyBuilds\2021.9\FBE_2021.9.1\PatchBundle\UBCore\Bundles\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\Party\DailyBuilds\2021.9\Party_2021.9.1\PatchBundle\FBEParty\Bundles\PatchBundle
		// \\misys.global.ad\bangalore\Dev\CMRE\BFBT\DailyBuilds\2021.9\Teller_2021.9.1\PatchBundle\BranchTeller\Bundles\PatchBundle
		//
		getBundleNames(module, counter, bundleAttributes, folderName.toString());
		//
		String destPatchFileName = DESTINATION_FOLDER + FOLDER_SEPERATOR + targetLocationMap.get(moduleName) + "/Bundles/PatchBundle" + FOLDER_SEPERATOR + bundleAttributes.getSourcePatch().getName();
		String destKeyFileName = DESTINATION_FOLDER + FOLDER_SEPERATOR + targetLocationMap.get(moduleName) + "/Bundles/PatchBundle" + FOLDER_SEPERATOR + bundleAttributes.getSourceKey().getName();
		//
		File destPatch = new File(destPatchFileName);
		File destKey = new File(destKeyFileName);
		//
		copyFile(bundleAttributes.getSourcePatch(), destPatch);
		copyFile(bundleAttributes.getSourceKey(), destKey);
	}

	private static void getBundleNames(Map<String, String> module, int counter, BundleAttributes bundleAttributes, String folderName) throws IOException {
		File folder = new File(folderName);
		File[] fList = folder.listFiles();
		if (folder.exists()) {
			for (File fn : fList) {
				if (fn.getName().endsWith(BFJ_EXTN)) {
					bundleAttributes.setSourcePatch(fn);
					counter = addToBundleSeqProps(module, counter, fn);
				}
				else if (fn.getName().endsWith(KEY_EXTN)) {
					bundleAttributes.setSourceKey(fn);
				}
			}
		}
	}

	private static int addToBundleSeqProps(Map<String, String> module, int counter, File fn) throws IOException {
		Path path = Paths.get(fn.getAbsolutePath());
		BasicFileAttributes fba = Files.getFileAttributeView(path, BasicFileAttributeView.class).readAttributes();
		if (module.containsKey(fba.creationTime())) {
			module.put(fba.creationTime().toString() + "_" + counter, fn.getName());
			counter++;
		}
		else
			module.put(fba.creationTime().toString(), fn.getName());
		return counter;
	}

	private static void copyFile(File sourceFileName, File destFileName) throws IOException {
		if (sourceFileName != null && sourceFileName.getAbsolutePath() != null && !sourceFileName.getAbsolutePath().contains(KEY_EXTN))
			LOGGER.info("Copying Bundle : " + sourceFileName);
		if (sourceFileName != null)
			FileUtils.copyFile(sourceFileName, destFileName);
	}

	private static String getPatchVersion() {
		return ReadPropertyFile.Version + DOT + ReadPropertyFile.ServicePack + DOT + (ReadPropertyFile.Patch == "0" ? ReadPropertyFile.Patch + DOT : "");
	}
}
