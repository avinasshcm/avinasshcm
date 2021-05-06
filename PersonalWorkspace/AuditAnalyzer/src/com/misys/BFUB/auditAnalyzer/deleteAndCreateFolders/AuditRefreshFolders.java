 package com.misys.BFUB.auditAnalyzer.deleteAndCreateFolders;
 
 import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
 import com.misys.BFUB.auditAnalyzer.util.AuditAnalyzerUtils;
 import java.io.File;
 import java.io.IOException;
 import java.util.HashMap;
 import java.util.logging.Logger;
 
 public class AuditRefreshFolders extends AnalyzeAudit
 {
   public static void deleteAndCreateFolders()
   {
     File directory = new File(configDetails.get("locationForAuditAnalysis") + "/");
     if (!directory.exists()) {
       directory = new File(configDetails.get("locationForSplittedFiles") + "/");
       if (directory.exists())
         try
         {
           delete(directory);
         }
         catch (IOException exception) {
           logger.info(AuditAnalyzerUtils.logException(exception));
           System.exit(0);
         }
     }
     else
     {
       try {
         delete(directory);
         directory = new File(configDetails.get("locationForSplittedFiles") + 
           "/");
         if (directory.exists()) {
           try
           {
             delete(directory);
           }
           catch (IOException exception) {
             logger.info(AuditAnalyzerUtils.logException(exception));
             System.exit(0);
           }
         }
       }
       catch (IOException exception)
       {
         logger.info(AuditAnalyzerUtils.logException(exception));
         System.exit(0);
       }
     }
 
     File file = new File(configDetails.get("locationForAuditAnalysis") + "/");
     if (!file.exists()) {
       file.mkdir();
     }
     file = new File(configDetails.get("locationForSplittedFiles") + "/");
     if (!file.exists())
       file.mkdir();
   }
 
   private static void delete(File file)
     throws IOException
   {
     if (file.isDirectory()) {
       if (file.list().length == 0) {
         file.delete();
       }
       else {
         String[] files = file.list();
         for (String temp : files) {
           File fileDelete = new File(file, temp);
           delete(fileDelete);
         }
         if (file.list().length == 0) {
           file.delete();
         }
       }
     }
     else
       file.delete();
   }
 }
