import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class FindDuplicates {

    private static final String FOLDER_PATH = "D:\\Essence\\Workspace\\Essence_L3";

    private static final Logger LOGGER = Logger.getLogger(FindDuplicates.class.getName());

    private static MessageDigest messageDigest;
    static {
        try {
            messageDigest = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("cannot initialize SHA-512 hash function", e);
        }
    }

    public static void findDuplicateFiles(Map<String, List<String>> filesList, File directory) {
        for (File dirChild : directory.listFiles()) {
            // Iterate all file sub directories recursively
            if (dirChild.isDirectory()) {
                System.out.println("Scanning Directory : " + dirChild);
                findDuplicateFiles(filesList, dirChild);
            } else {
                try {
                    // Read file as bytes
                    FileInputStream fileInput = new FileInputStream(dirChild);
                    byte fileData[] = new byte[(int) dirChild.length()];
                    fileInput.read(fileData);
                    fileInput.close();
                    // Create unique hash for current file
                    String uniqueFileHash = new BigInteger(1, messageDigest.digest(fileData)).toString(16);
                    List<String> identicalList = filesList.get(uniqueFileHash);
                    if (identicalList == null) {
                        identicalList = new LinkedList<String>();
                    }
                    // Add path to list
                    identicalList.add(dirChild.getAbsolutePath());
                    // push updated list to Hash table
                    filesList.put(uniqueFileHash, identicalList);
                } catch (IOException e) {
                    throw new RuntimeException("cannot read file " + dirChild.getAbsolutePath(), e);
                }
            }
        }
    }

    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            File duplicateFiles =
                new File(FOLDER_PATH + "\\duplicateFiles_" + getCurrentTimeStampForPayments(Calendar.getInstance()) + ".txt");
            writer = new BufferedWriter(new FileWriter(duplicateFiles));
            LOGGER.info("Started");
            System.out.println("-----------------------------------------------------------------");
            File dir = new File(FOLDER_PATH);
            if (!dir.isDirectory()) {
                System.out.println("Supplied directory does not exist.");
                return;
            }
            Map<String, List<String>> lists = new HashMap<String, List<String>>();
            FindDuplicates.findDuplicateFiles(lists, dir);
            writer.write("Found " + lists.size() + " Duplicate files");
            for (List<String> list : lists.values()) {
                if (list.size() > 1) {
                    writer.write("\n");
                    for (String file : list) {
                        if (file.contains(".jar")) {
                            writer.write(file);
                            writer.write("\n");
                        }
                    }
                }
            }
            if (lists.size() <= 0) {
                System.out.println("No Duplicated Found");
            } else {
                System.out.println("Found " + lists.size() + " Files");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Exception in Close");
                e.printStackTrace();
            }
        }
        System.out.println("-----------------------------------------------------------------");
        LOGGER.info("Finished");
    }

    protected static String getCurrentTimeStampForPayments(Calendar cal) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(cal.getInstance().getTimeInMillis());
        String time = new SimpleDateFormat("HH.mm.ss").format(cal.getInstance().getTimeInMillis());
        return date + "_" + time;
    }

}