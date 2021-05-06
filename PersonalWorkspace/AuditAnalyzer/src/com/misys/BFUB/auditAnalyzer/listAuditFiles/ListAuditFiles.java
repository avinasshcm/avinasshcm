 package com.misys.BFUB.auditAnalyzer.listAuditFiles;
 
 import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.logging.Logger;
 
 public class ListAuditFiles extends AnalyzeAudit
 {
   public static void listFilesAndFilesSubDirectories(String directoryName)
   {
     File directory = new File(directoryName);
     File[] fList = directory.listFiles();
     for (File file : fList)
       if (file.isFile()) {
         if (file.getName().toString().toUpperCase().contains("AUDIT")) {
           logger.info(file.getAbsolutePath() + " is marked to be processed");
           auditFileList.add(file.getAbsolutePath());
         }
       }
       else if (file.isDirectory())
         listFilesAndFilesSubDirectories(file.getAbsolutePath());
   }
 }
