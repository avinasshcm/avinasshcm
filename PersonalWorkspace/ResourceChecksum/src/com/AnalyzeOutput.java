package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import com.pojo.CodeResource;

public class AnalyzeOutput {

    private static final String PATH = "C:/Users/amanjuna/Desktop/Result_Latest/";

    private static final String BankCodeResourceFile = PATH + "CodeResource_fullDBload.txt";

    private static final String LocalCodeResourceFile = PATH + "CodeResource_QADB.txt";

    private static final String BankResourceFile = PATH + "Resource_fullDBLoad.txt";

    private static final String LocalResourceFile = PATH + "Resource_QADB.txt";

    private static final String RESOURCE_LOCAL_UNIQ_TXT = "Option3ResourceLocalUniq.txt";

    private static final String RESOURCE_PROD_UNIQ_TXT = "Option3ResourceProdUniq.txt";

    private static final String RESOURCE_DIFF_TXT = "Option3ResourceDiff.txt";

    private static final String CODE_RESOURCE_LOCAL_UNIQ_TXT = "Option3CodeResourceLocalUniq.txt";

    private static final String CODE_RESOURCE_PROD_UNIQ_TXT = "Option3CodeResourceProdUniq.txt";

    private static final String CODE_RESOURCE_DIFF_TXT = "Option3CodeResourceDiff.txt";

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        analyzeResource(true, LocalResourceFile, BankResourceFile, RESOURCE_DIFF_TXT, RESOURCE_PROD_UNIQ_TXT, RESOURCE_LOCAL_UNIQ_TXT);
        analyzeResource(false, LocalCodeResourceFile, BankCodeResourceFile, CODE_RESOURCE_DIFF_TXT, CODE_RESOURCE_PROD_UNIQ_TXT,
            CODE_RESOURCE_LOCAL_UNIQ_TXT

        );

    }

    private static void analyzeResource(boolean isResource, String localFileName, String prodFileName, String diffFileName,
        String prodUniqFileName, String QAUniqFileName) throws FileNotFoundException {
        System.out.println("Start");

        File f1 = new File(diffFileName);
        FileOutputStream fos1 = new FileOutputStream(f1);
        PrintWriter resourceDiffPw = new PrintWriter(fos1);

        File f2 = new File(prodUniqFileName);
        FileOutputStream fos2 = new FileOutputStream(f2);
        PrintWriter resourceProdUniqPw = new PrintWriter(fos2);

        File f3 = new File(QAUniqFileName);
        FileOutputStream fos3 = new FileOutputStream(f3);
        PrintWriter resourceQAUniqPw = new PrintWriter(fos3);

        HashMap<String, CodeResource> local = new HashMap<String, CodeResource>();
        if (isResource) {
            local = readResourceFile(local, localFileName);
        } else {
            local = readCodeResourceFile(local, localFileName);
        }

        HashMap<String, CodeResource> vm = new HashMap<String, CodeResource>();
        if (isResource) {
            vm = readResourceFile(vm, prodFileName);
        } else {
            vm = readCodeResourceFile(vm, prodFileName);
        }

        Set<String> localSet = getKeys(local);
        Set<String> vmSet = getKeys(vm);

        Set<String> diffSet = new HashSet<String>();

        Set<String> allSet = new HashSet<String>();
        allSet.addAll(localSet);
        allSet.addAll(vmSet);

        // System.out.println("AllSet Size " + allSet.size());

        // System.out.println("Local " + local.size());
        // System.out.println("VM " + vm.size());

        for (String item : allSet) {
            // System.out.println(item);
            CodeResource localHashCode = local.get(item);
            CodeResource vmHashCode = vm.get(item);
            if (localHashCode != null && vmHashCode != null && !localHashCode.getCheckSum().equals(vmHashCode.getCheckSum())) {

                if (local.get(item) != null) {
                    item = local.get(item).getArtefactID();
                } else {
                    item = vm.get(item).getArtefactID();
                }

                diffSet.add(item);
                // System.out.println(/* "*********************" + */item);
            }

            if (localHashCode == null && vmHashCode != null) {
                resourceProdUniqPw.write(vmHashCode.getArtefactID());
                resourceProdUniqPw.write("\n");
            }

            if (vmHashCode == null && localHashCode != null) {
                resourceQAUniqPw.write(localHashCode.getArtefactID());
                resourceQAUniqPw.write("\n");
            }
        }

        for (String item : diffSet) {
            resourceDiffPw.write(item);
            resourceDiffPw.write("\n");
        }

        resourceDiffPw.close();
        resourceProdUniqPw.close();
        resourceQAUniqPw.close();

        System.out.println("Completed");
    }

    public static HashMap<String, CodeResource> readResourceFile(HashMap<String, CodeResource> map, String fileName)
        throws FileNotFoundException {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();

            // for (String line : allLines) {
            while (line != null) {
                // writer.write(line.substring(line.lastIndexOf("/") + 1)+"\n");

                line = reader.readLine();
                if (line != null && !line.isEmpty()) {
                    String[] arr = line.split(Pattern.quote("|"));
                    CodeResource cr = new CodeResource();
                    cr.setCheckSum(arr[3]);
                    cr.setArtefactID(arr[0]);
                    Double versionNum = null;
                    try {
                        versionNum = arr[2].equals("null") ? Double.parseDouble("1.0") : Double.parseDouble(arr[2]);
                    } catch (NumberFormatException nfe) {
                        System.out.println("*****************" + arr[2]);
                        System.exit(0);
                    }
                    cr.setVersionNumber(versionNum);

                    if (map.containsKey(arr[0] + "_" + arr[1]) && map.get(arr[0] + "_" + arr[1]).getVersionNumber() > versionNum) {
                        // System.out.println("MultiVersion : " + arr[0]);
                    } else {
                        map.put(arr[0] + "_" + arr[1], cr);
                    }

                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static HashMap<String, CodeResource> readCodeResourceFile(HashMap<String, CodeResource> map, String fileName) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();

            // for (String line : allLines) {
            while (line != null) {
                // writer.write(line.substring(line.lastIndexOf("/") + 1)+"\n");

                line = reader.readLine();
                if (line != null && !line.isEmpty()) {
                    String[] arr = line.split(Pattern.quote("|"));

                    CodeResource cr = new CodeResource();
                    cr.setArtefactID(arr[0]);
                    cr.setCheckSum(arr[4]);

                    Double versionNum = null;
                    try {
                        versionNum = arr[3].equals("null") ? Double.parseDouble("1.0") : Double.parseDouble(arr[2]);
                    } catch (NumberFormatException nfe) {
                        System.out.println("*****************" + arr[2]);
                        System.exit(0);
                    }
                    cr.setVersionNumber(versionNum);

                    if (map.containsKey(arr[1]) && map.get(arr[1]).getVersionNumber() > versionNum) {
                        // System.out.println("MultiVersion : " + arr[0]);
                    } else {
                        map.put(arr[1], cr);
                    }

                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static Set<String> getKeys(HashMap<String, CodeResource> map) {
        Set<String> set = map.keySet();
        return set;
    }

}
