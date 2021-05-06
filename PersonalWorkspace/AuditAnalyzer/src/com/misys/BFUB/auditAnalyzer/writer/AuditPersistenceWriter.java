 package com.misys.BFUB.auditAnalyzer.writer;
 
 import com.misys.BFUB.auditAnalyzer.splitter.AuditSplitter;
 import com.misys.BFUB.auditAnalyzer.util.AuditAnalyzerUtils;
 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.HashMap;
 import java.util.List;
 import java.util.logging.Logger;
 
 public class AuditPersistenceWriter extends AuditSplitter
   implements Runnable
 {
   private Logger logger = null;
 
   public AuditPersistenceWriter(Logger logger) {
     this.logger = logger;
   }
 
   public void run()
   {
     writeFile();
   }
 
   private void writeFile() {
     while ((!isAnalysisCompleted.booleanValue()) || ((isAnalysisCompleted.booleanValue()) && (persistenceRecords.size() > 0))) {
       String responseFile = "";
       if (nonAnalyzedRecords.size() > 0) {
         AuditAnalyzerUtils.updatePersistenceRecords("", 
           "", Boolean.valueOf(true));
         List sessionSet = new ArrayList((Collection)persistenceRecordsToBeFlushed.keySet());
         FileOutputStream fop = null;
         File file = null;
         for (int i = 0; i < sessionSet.size(); i++) {
           try {
             responseFile = configDetails.get("locationForSplittedFiles") + 
               "/" + "NonAnalyzed" + ".txt";
             file = new File(responseFile);
             if (!file.exists()) {
               file.createNewFile();
             }
             fop = new FileOutputStream(file, true);
           }
           catch (Exception e) {
             File newResponseFile = new File(responseFile);
             try {
               newResponseFile.createNewFile();
             }
             catch (IOException exception) {
               this.logger.info(exception.getLocalizedMessage());
             }
           }
           try {
             fop.write(((String)persistenceRecordsToBeFlushed.get(sessionSet.get(i))).getBytes());
             fop.flush();
             fop.close();
           }
           catch (IOException exception) {
             this.logger.info(exception.getLocalizedMessage());
           }
         }
       }
       try {
         Thread.sleep(1000L);
       }
       catch (InterruptedException localInterruptedException)
       {
       }
     }
   }
 }
