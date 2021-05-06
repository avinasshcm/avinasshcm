 package com.misys.BFUB.auditAnalyzer.util;
 
 import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.misys.BFUB.auditAnalyzer.splitter.AuditSplitter;
 
 public class AuditAnalyzerUtils extends AuditSplitter
 {
   public static synchronized void updateAuditRecords(HashMap<String, String> values, Boolean isClear)
   {
     if (pageCount >= ((Integer)configDetails.get("split.ThreadPool")).intValue()) {
       while (auditRecordsToBeFlushed.size() > 0) {
         try {
           Thread.sleep(1000L);
         }
         catch (InterruptedException e) {
           System.out.println("Sleeping");
         }
       }
       auditRecordsToBeFlushed = new HashMap();
       auditRecordsToBeFlushed.putAll(auditRecords);
       auditRecords = new HashMap();
       pageCount = 0;
     }
     for (Map.Entry entry : values.entrySet()) {
       if (auditRecords.containsKey(entry.getKey())) {
         auditRecords.put((String)entry.getKey(), ((String)auditRecords.get(entry.getKey())).concat((String)entry.getValue()));
       }
       else {
         auditRecords.put((String)entry.getKey(), (String)entry.getValue());
       }
     }
     pageCount += 1;
   }
 
   public static synchronized void updateNonAnalyzedRecords(String key, String value, Boolean isClear) {
     if (isClear.booleanValue()) {
       nonAnalyzedRecordsToBeFlushed = new HashMap();
       nonAnalyzedRecordsToBeFlushed.putAll(nonAnalyzedRecords);
       nonAnalyzedRecords = new HashMap();
     }
     else if (nonAnalyzedRecords.containsKey(key)) {
       nonAnalyzedRecords.put(key, ((String)nonAnalyzedRecords.get(key)).concat(value));
     }
     else {
       nonAnalyzedRecords.put(key, value);
     }
   }
 
   public static synchronized void updatePersistenceRecords(String key, String value, Boolean isClear)
   {
     if (isClear.booleanValue()) {
       persistenceRecordsToBeFlushed = new HashMap();
       persistenceRecordsToBeFlushed.putAll(persistenceRecords);
       persistenceRecords = new HashMap();
     }
     else if (persistenceRecords.containsKey(key)) {
       persistenceRecords.put(key, ((String)persistenceRecords.get(key)).concat(value));
     }
     else {
       persistenceRecords.put(key, value);
     }
   }
 
   public static String logException(Throwable ex)
   {
     StringWriter exWriter = new StringWriter();
     ex.printStackTrace(new PrintWriter(exWriter));
     return exWriter.toString();
   }
 
   public static Timestamp convertStringTimeStampToTimeStamp(String dateTime)
     throws ParseException
   {
     DateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS");
     dateTime = dateTime.replaceAll("/", " ");
     return new Timestamp(formatter.parse(dateTime).getTime());
   }
 }
