 package com.misys.BFUB.auditAnalyzer.splitter;
 
 import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
import com.misys.BFUB.auditAnalyzer.splitter.worker.AuditSplitWorker;
import com.misys.BFUB.auditAnalyzer.writer.AuditNonAnalyzedWriter;
import com.misys.BFUB.auditAnalyzer.writer.AuditPersistenceWriter;
import com.misys.BFUB.auditAnalyzer.writer.AuditWriter;
 
 @SuppressWarnings({ "unchecked", "rawtypes" })
 public class AuditSplitter extends AnalyzeAudit
 {
   public static volatile ArrayList<String> sessions = new ArrayList();
   public static volatile HashMap<Integer, HashSet<String>> sessionSet = new HashMap();
   public static volatile HashMap<String, String> auditRecords = new HashMap();
   public static volatile HashMap<String, String> nonAnalyzedRecords = new HashMap();
   public static volatile HashMap<String, String> persistenceRecords = new HashMap();
   public static volatile Boolean isAnalysisCompleted = Boolean.valueOf(false);
   public static HashMap<String, String> auditRecordsToBeFlushed = new HashMap();
   public static volatile HashMap<String, String> nonAnalyzedRecordsToBeFlushed = new HashMap();
   public static volatile HashMap<String, String> persistenceRecordsToBeFlushed = new HashMap();
   public static int pageCount = 0;
 
   public static void process(String[] args)
   {
     for (int set = 0; set < ((Integer)configDetails.get("timeRangeInterval")).intValue(); set++) {
       HashSet tempSessionSet = new HashSet();
       sessionSet.put(Integer.valueOf(set), tempSessionSet);
     }
     startSplitting();
   }
 
   private static void startSplitting()
   {
     int noOfPages = auditFileList.size();
     int threadPoolSize = ((Integer)configDetails.get("split.ThreadPool")).intValue();
     if (noOfPages < threadPoolSize) {
       threadPoolSize = noOfPages;
     }
     ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);
     for (int fileNumber = 0; fileNumber < noOfPages; fileNumber++) {
       Runnable worker = new AuditSplitWorker(logger, configDetails, (String)auditFileList.get(fileNumber));
       executor.execute(worker);
     }
     executor.shutdown();
 
     ExecutorService writerExecutor = Executors.newFixedThreadPool(1);
     Runnable writerWorker = new AuditWriter(logger);
     writerExecutor.execute(writerWorker);
     writerExecutor.shutdown();
 
     ExecutorService nAWriterExecutor = Executors.newFixedThreadPool(1);
     Runnable nAWriterWorker = new AuditNonAnalyzedWriter(logger);
     nAWriterExecutor.execute(nAWriterWorker);
     nAWriterExecutor.shutdown();
 
     ExecutorService persWriterExecutor = Executors.newFixedThreadPool(1);
     Runnable persWriterWorker = new AuditPersistenceWriter(logger);
     persWriterExecutor.execute(persWriterWorker);
     persWriterExecutor.shutdown();
     try
     {
       while (!executor.awaitTermination(30L, TimeUnit.SECONDS));
     }
     catch (InterruptedException exception)
     {
       logger.info("Failed to wait for thread pool to finish");
       logger.info(logException(exception));
     }
     do
       try {
         Thread.sleep(1000L);
       }
       catch (InterruptedException localInterruptedException1)
       {
       }
     while (auditRecordsToBeFlushed.size() > 0);
 
     auditRecordsToBeFlushed = new HashMap();
     auditRecordsToBeFlushed.putAll(auditRecords);
     auditRecords = new HashMap();
     isAnalysisCompleted = Boolean.valueOf(true);
     try
     {
       while (!writerExecutor.awaitTermination(30L, TimeUnit.SECONDS))
         logger.info("Awaiting completion of writer threads.");
     }
     catch (InterruptedException exception)
     {
       logger.info("Failed to wait for thread pool to finish");
       logger.info(logException(exception));
     }
     try
     {
       while (!nAWriterExecutor.awaitTermination(30L, TimeUnit.SECONDS))
         logger.info("Awaiting completion of writer threads.");
     }
     catch (InterruptedException exception)
     {
       logger.info("Failed to wait for thread pool to finish");
       logger.info(logException(exception));
     }
     try
     {
       while (!persWriterExecutor.awaitTermination(30L, TimeUnit.SECONDS))
         logger.info("Awaiting completion of writer threads.");
     }
     catch (InterruptedException exception)
     {
       logger.info("Failed to wait for thread pool to finish");
       logger.info(logException(exception));
     }
   }
 
   public static String logException(Throwable ex)
   {
     StringWriter exWriter = new StringWriter();
     ex.printStackTrace(new PrintWriter(exWriter));
     return exWriter.toString();
   }
 }
