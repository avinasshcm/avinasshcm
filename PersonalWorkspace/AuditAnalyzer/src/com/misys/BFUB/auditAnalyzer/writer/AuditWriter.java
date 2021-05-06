 package com.misys.BFUB.auditAnalyzer.writer;
 
 import com.misys.BFUB.auditAnalyzer.splitter.AuditSplitter;
 import com.misys.BFUB.auditAnalyzer.writer.worker.AuditWriterWorker;
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.HashMap;
 import java.util.List;
 import java.util.concurrent.ExecutorService;
 import java.util.concurrent.Executors;
 import java.util.concurrent.TimeUnit;
 import java.util.logging.Logger;
 
 public class AuditWriter extends AuditSplitter
   implements Runnable
 {
   private Logger logger = null;
 
   public AuditWriter(Logger logger) {
     this.logger = logger;
   }
 
   public void run()
   {
     writeFile();
   }
 
   private void writeFile() {
     while ((!isAnalysisCompleted.booleanValue()) || ((isAnalysisCompleted.booleanValue()) && (auditRecordsToBeFlushed.size() > 0))) {
       String responseFile = "";
       if (auditRecordsToBeFlushed.size() > 0)
       {
         List sessionSet = new ArrayList((Collection)auditRecordsToBeFlushed.keySet());
         for (int i = 0; i < sessionSet.size(); i++) {
           responseFile = configDetails.get("locationForSplittedFiles") + 
             "/" + (String)sessionSet.get(i) + ".txt";
           int noOfPages = sessionSet.size();
           int threadPoolSize = ((Integer)configDetails.get("writer.ThreadPool")).intValue();
 
           if (noOfPages < threadPoolSize) {
             threadPoolSize = noOfPages;
           }
           ExecutorService writerExecutor = Executors.newFixedThreadPool(threadPoolSize);
           Runnable writerWorker = new AuditWriterWorker(this.logger, (String)auditRecordsToBeFlushed.get(sessionSet.get(i)), 
             responseFile);
           writerExecutor.execute(writerWorker);
           writerExecutor.shutdown();
           try {
             while (!writerExecutor.awaitTermination(30L, TimeUnit.SECONDS))
               this.logger.info("Awaiting completion of writer threads.");
           }
           catch (InterruptedException exception)
           {
             this.logger.info("Failed to wait for thread pool to finish");
             this.logger.info(logException(exception));
           }
         }
 
         auditRecordsToBeFlushed = new HashMap();
       }
       try {
         Thread.sleep(1000L);
       }
       catch (InterruptedException localInterruptedException1)
       {
       }
     }
   }
 }

