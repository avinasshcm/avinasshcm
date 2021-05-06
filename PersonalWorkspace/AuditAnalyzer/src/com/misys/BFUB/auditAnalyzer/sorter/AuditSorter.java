 package com.misys.BFUB.auditAnalyzer.sorter;
 
 import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
 import com.misys.BFUB.auditAnalyzer.sorter.worker.AuditSortWorker;
 import com.misys.BFUB.auditAnalyzer.util.AuditAnalyzerUtils;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.concurrent.ExecutorService;
 import java.util.concurrent.Executors;
 import java.util.concurrent.TimeUnit;
 import java.util.logging.Logger;
 
 public class AuditSorter extends AnalyzeAudit
 {
   public static void sortFiles()
   {
     logger.info("Sorting started.");
     int noOfPages = sessionsList.size();
     int threadPoolSize = ((Integer)configDetails.get("sort.ThreadPool")).intValue();
     if (noOfPages < threadPoolSize) {
       threadPoolSize = noOfPages;
     }
     ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);
     for (int fileNumber = 0; fileNumber < noOfPages; fileNumber++) {
       Runnable worker = new AuditSortWorker((String)sessionsList.get(fileNumber));
       executor.execute(worker);
     }
     executor.shutdown();
     try {
       while (!executor.awaitTermination(30L, TimeUnit.SECONDS));
     }
     catch (InterruptedException exception) {
       logger.info("Failed to wait for thread pool to finish");
       logger.info(AuditAnalyzerUtils.logException(exception));
     }
     logger.info("Sorting finished.");
   }
 }
