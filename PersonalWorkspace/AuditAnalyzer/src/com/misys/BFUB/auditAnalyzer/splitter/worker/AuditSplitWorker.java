 package com.misys.BFUB.auditAnalyzer.splitter.worker;
 
 import com.misys.BFUB.auditAnalyzer.splitter.AuditSplitter;
 import com.misys.BFUB.auditAnalyzer.util.AuditAnalyzerUtils;
 import java.io.BufferedReader;
 import java.io.DataInputStream;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.io.PrintStream;
 import java.nio.channels.FileChannel;
 import java.nio.channels.FileLock;
 import java.nio.channels.OverlappingFileLockException;
 import java.sql.Timestamp;
 import java.text.ParseException;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.StringTokenizer;
 import java.util.logging.Logger;
 
 public class AuditSplitWorker extends AuditSplitter
   implements Runnable
 {
   private Logger logger = null;
   int auditTimeLocation = 0;
   int businessTimeLocation = 0;
   int runTimeMFIDLocation = 0;
   int microflowIDLocation = 0;
   int userIDLocation = 0;
   int channelIDLocation = 0;
   int sourceBranchLocation = 0;
   int transactionIDLocation = 0;
   int categoryNameLocation = 0;
   int eventTypeLocation = 0;
   int operationLocation = 0;
   int primaryDataLocation = 0;
   int secondaryDataLocation = 0;
   int numberOfArrayToKeepSessions = 0;
   String auditTime = "";
   String businessTime = "";
   String runTimeMFID = "";
   String microflowID = "";
   String userID = "";
   String channelID = "";
   String sourceBranch = "";
   String transactionID = "";
   String categoryName = "";
   String eventType = "";
   String operation = "";
   String primaryData = "";
   String secondaryData = "";
 
   int SPLIT_PAGESIZE = 0;
   int SPLIT_NONANA_PAGESIZE = 0;
   int SPLIT_PERS_PAGESIZE = 0;
 
   String fileName = "";
 
   Boolean otherPersistenceRecordRequired = Boolean.valueOf(false);
   Boolean splitAuditBasedonTimeRange = Boolean.valueOf(false);
   Boolean splitAuditBasedOnChannels = Boolean.valueOf(false);
   Boolean splitAuditBasedOnUser = Boolean.valueOf(false);
   Boolean splitAuditBasedOnMicroflow = Boolean.valueOf(false);
   ArrayList<String> keyList = new ArrayList();
 
   Timestamp auditStartTime = new Timestamp(new Date(0L).getTime());
   Timestamp auditEndTime = new Timestamp(new Date(0L).getTime());
 
   String nonAnalyzed = "";
   String persistenceLayer = "";
   int nonAnaLyzedCount = 0;
   int persistenceCount = 0;
 
   public AuditSplitWorker(Logger logger, HashMap<String, Object> configDetails, String fileName) {
     this.logger = logger;
     this.auditTimeLocation = ((Integer)configDetails.get("auditTime")).intValue();
     this.businessTimeLocation = ((Integer)configDetails.get("businessTime")).intValue();
     this.runTimeMFIDLocation = ((Integer)configDetails.get("runTimeMFID")).intValue();
     this.microflowIDLocation = ((Integer)configDetails.get("microflowID")).intValue();
     this.userIDLocation = ((Integer)configDetails.get("userID")).intValue();
     this.channelIDLocation = ((Integer)configDetails.get("channelID")).intValue();
     this.sourceBranchLocation = ((Integer)configDetails.get("sourceBranch")).intValue();
     this.transactionIDLocation = ((Integer)configDetails.get("transactionID")).intValue();
     this.categoryNameLocation = ((Integer)configDetails.get("categoryName")).intValue();
     this.eventTypeLocation = ((Integer)configDetails.get("eventType")).intValue();
     this.operationLocation = ((Integer)configDetails.get("operation")).intValue();
     this.primaryDataLocation = ((Integer)configDetails.get("primaryData")).intValue();
     this.secondaryDataLocation = ((Integer)configDetails.get("secondaryData")).intValue();
     this.SPLIT_PAGESIZE = ((Integer)configDetails.get("split.pageSize")).intValue();
     this.SPLIT_NONANA_PAGESIZE = ((Integer)configDetails.get("split.nonAnalyzedPageSize")).intValue();
     this.SPLIT_PERS_PAGESIZE = ((Integer)configDetails.get("split.persistencePageSize")).intValue();
     this.fileName = fileName;
     this.otherPersistenceRecordRequired = ((Boolean)configDetails.get("otherPersistenceRecordRequired"));
     this.splitAuditBasedOnChannels = ((Boolean)configDetails.get("splitAuditBasedOnChannels"));
     this.splitAuditBasedOnMicroflow = ((Boolean)configDetails.get("splitAuditBasedOnMicroflow"));
     this.splitAuditBasedonTimeRange = ((Boolean)configDetails.get("splitAuditBasedonTimeRange"));
     this.splitAuditBasedOnUser = ((Boolean)configDetails.get("splitAuditBasedOnUser"));
     this.keyList = ((ArrayList)configDetails.get("KeyList"));
     this.auditStartTime = ((Timestamp)configDetails.get("startTime"));
     this.auditEndTime = ((Timestamp)configDetails.get("endTime"));
   }
 
   public void run()
   {
     this.numberOfArrayToKeepSessions = ((Integer)configDetails.get("timeRangeInterval")).intValue();
     splitAudit();
   }
 
   private void splitAudit() {
     this.logger.info(this.fileName + " started for processing");
     HashMap auditFiles = new HashMap();
     int counter = 0;
     ArrayList tempSessions = new ArrayList();
     try {
       FileInputStream fstream = new FileInputStream(this.fileName);
       DataInputStream in = new DataInputStream(fstream);
       BufferedReader br = new BufferedReader(new InputStreamReader(in));
 
       String strLine = br.readLine();
       String sessionId = "";
       while (strLine != null)
         if ((strLine == null) || (strLine.trim().length() <= 0)) {
           strLine = br.readLine();
         }
         else {
           try {
             splitAuditRecord(strLine);
           }
           catch (Exception exception) {
             this.logger.info(strLine + " got " + exception.getLocalizedMessage() + " and bypassed from analysis.");
             writeNonAnalyzedRecord(strLine);
             strLine = br.readLine();
             sessionId = "";
             continue;
           }
           if (!strLine.contains("MessageGUID")) {
             if (this.runTimeMFID.indexOf("%") < 0) {
               if (this.categoryName.equals("Persistence")) {
                 writePersistenceRecord(strLine);
               }
               else {
                 writeNonAnalyzedRecord(strLine);
               }
               strLine = br.readLine();
               sessionId = "";
               continue;
             }
             sessionId = this.runTimeMFID.trim().substring(0, this.runTimeMFID.indexOf("%"));
           }
           else {
             try {
               sessionId = strLine.trim().substring(strLine.indexOf("MessageGUID") + 15, 
                 strLine.trim().length());
             }
             catch (Exception e) {
               this.logger.info("exception" + strLine);
             }
             sessionId = sessionId.trim().substring(0, sessionId.indexOf("||") - 1);
             sessionId = sessionId.replaceAll(":", "");
           }
 
           if (isSessionAvailable(sessionId)) {
             if (this.categoryName.equals("Persistence"))
               writePersistenceRecord(strLine);
             if (counter >= this.SPLIT_PAGESIZE) {
               AuditAnalyzerUtils.updateAuditRecords(auditFiles, Boolean.valueOf(false));
               counter = 1;
               auditFiles = new HashMap();
               tempSessions.clear();
               System.gc();
               String audit = "";
               audit = audit.concat(strLine.concat("\n"));
               auditFiles.put(sessionId, audit);
             }
             else {
               counter++;
               String audit = "";
               if (!tempSessions.contains(sessionId)) {
                 audit = audit.concat(strLine.concat("\n"));
                 auditFiles.put(sessionId, audit);
                 tempSessions.add(sessionId);
               }
               else {
                 audit = (String)auditFiles.get(sessionId);
                 audit = audit.concat(strLine.concat("\n"));
                 auditFiles.put(sessionId, audit);
               }
             }
           }
           strLine = br.readLine();
           sessionId = "";
         }
       AuditAnalyzerUtils.updateAuditRecords(auditFiles, Boolean.valueOf(false));
 
       auditFiles.clear();
       tempSessions.clear();
       in.close();
     }
     catch (Exception exception) {
       System.err.println("Error in spliting " + exception.getMessage());
       this.logger.info(AuditAnalyzerUtils.logException(exception));
     }
     this.logger.info(this.fileName + " is processed.");
   }
 
   private boolean isSessionAvailable(String sessionId) {
     boolean isValid = false;
     int hashCode = sessionId.hashCode();
     hashCode = hashCode < 0 ? -1 * hashCode : hashCode;
     int listId = hashCode % this.numberOfArrayToKeepSessions;
     if (((HashSet)sessionSet.get(Integer.valueOf(listId))).contains(sessionId))
       return true;
     try {
       isValid = isValidForAnalysis().booleanValue();
     }
     catch (ParseException e) {
       return false;
     }
     if (isValid) {
       HashSet tempSet = (HashSet)sessionSet.get(Integer.valueOf(listId));
       tempSet.add(sessionId);
       sessionSet.put(Integer.valueOf(listId), tempSet);
     }
     return isValid;
   }
 
   private void writeNonAnalyzedRecord(String strLine) throws IOException {
     if (this.nonAnaLyzedCount < this.SPLIT_NONANA_PAGESIZE) {
       this.nonAnalyzed = this.nonAnalyzed.concat(strLine.concat("\n"));
       this.nonAnaLyzedCount += 1;
     }
     else
     {
       AuditAnalyzerUtils.updateNonAnalyzedRecords(Thread.currentThread().getName(), this.nonAnalyzed, Boolean.valueOf(false));
       this.nonAnaLyzedCount = 1;
       this.nonAnalyzed = "";
       this.nonAnalyzed = this.nonAnalyzed.concat(strLine.concat("\n"));
     }
   }
 
   private void writePersistenceRecord(String strLine) throws IOException
   {
     if (this.otherPersistenceRecordRequired.booleanValue())
       if (this.persistenceCount < this.SPLIT_PERS_PAGESIZE) {
         this.persistenceLayer = this.persistenceLayer.concat(strLine.concat("\n"));
         this.persistenceCount += 1;
       }
       else
       {
         AuditAnalyzerUtils.updatePersistenceRecords(Thread.currentThread().getName(), this.persistenceLayer, Boolean.valueOf(false));
         this.persistenceCount = 1;
         this.persistenceLayer = "";
         this.persistenceLayer = this.persistenceLayer.concat(strLine.concat("\n"));
       }
   }
 
   private void splitAuditRecord(String audit)
     throws ParseException
   {
     StringTokenizer tokens = new StringTokenizer(audit, "||");
     for (int token = 0; token < this.secondaryDataLocation + 1; token++) {
       if (token == this.auditTimeLocation)
         this.auditTime = tokens.nextToken().replaceAll("'", "");
       if (token == this.businessTimeLocation)
         this.businessTime = tokens.nextToken().replaceAll("'", "");
       if (token == this.runTimeMFIDLocation)
         this.runTimeMFID = tokens.nextToken().replaceAll("'", "");
       if (token == this.microflowIDLocation)
         this.microflowID = 
           tokens.nextToken().replaceAll("'", "").toUpperCase();
       if (token == this.userIDLocation)
         this.userID = 
           tokens.nextToken().replaceAll("'", "").toUpperCase();
       if (token == this.channelIDLocation)
         this.channelID = 
           tokens.nextToken().replaceAll("'", "").toUpperCase();
       if (token == this.sourceBranchLocation)
         this.sourceBranch = tokens.nextToken().replaceAll("'", "");
       if (token == this.transactionIDLocation)
         this.transactionID = tokens.nextToken().replaceAll("'", "");
       if (token == this.categoryNameLocation)
         this.categoryName = tokens.nextToken().replaceAll("'", "");
       if (token == this.eventTypeLocation)
         this.eventType = tokens.nextToken().replaceAll("'", "");
       if (token == this.operationLocation)
         this.operation = tokens.nextToken().replaceAll("'", "");
       if (token == this.primaryDataLocation)
         this.primaryData = tokens.nextToken().replaceAll("'", "");
       if (token == this.secondaryDataLocation)
         this.secondaryData = tokens.nextToken().replaceAll("'", "");
     }
   }
 
   private Boolean isValidForAnalysis() throws ParseException {
     Boolean isValid = Boolean.valueOf(false);
     if (this.splitAuditBasedonTimeRange.booleanValue()) {
       Timestamp auditTimings = AuditAnalyzerUtils.convertStringTimeStampToTimeStamp(this.auditTime);
       if ((this.auditStartTime.compareTo(auditTimings) <= 0) && (this.auditEndTime.compareTo(auditTimings) >= 0)) {
         if (this.keyList.size() == 0) {
           isValid = Boolean.valueOf(true);
         }
         else {
           String key = "$";
           if (this.splitAuditBasedOnChannels.booleanValue()) {
             key = key.concat(this.channelID).concat("$");
           }
           if (this.splitAuditBasedOnUser.booleanValue()) {
             key = key.concat(this.userID).concat("$");
           }
           if (this.splitAuditBasedOnMicroflow.booleanValue()) {
             key = key.concat(this.microflowID).concat("$");
           }
           if (this.keyList.contains(key)) {
             isValid = Boolean.valueOf(true);
           }
         }
       }
 
     }
     else if (this.keyList.size() == 0) {
       isValid = Boolean.valueOf(true);
     }
     else {
       String key = "$";
       if (this.splitAuditBasedOnChannels.booleanValue()) {
         key = key.concat(this.channelID).concat("$");
       }
       if (this.splitAuditBasedOnUser.booleanValue()) {
         key = key.concat(this.userID).concat("$");
       }
       if (this.splitAuditBasedOnMicroflow.booleanValue()) {
         key = key.concat(this.microflowID).concat("$");
       }
       if (this.keyList.contains(key)) {
         isValid = Boolean.valueOf(true);
       }
 
     }
 
     return isValid;
   }
 
   private void writeNonAnalysed(byte[] nonAnalyzed)
     throws IOException
   {
     String responseFile = "";
     FileOutputStream fop = null;
     try
     {
       responseFile = configDetails.get("locationForSplittedFiles") + "/" + 
         "NonAnalyzed" + ".txt";
       File file = new File(responseFile);
       if (!file.exists()) {
         file.createNewFile();
       }
       fop = new FileOutputStream(file, true);
     }
     catch (Exception e) {
       File newResponseFile = new File(responseFile);
       newResponseFile.createNewFile();
     }
     boolean written = false;
     do
       try {
         FileLock lock = fop.getChannel().lock();
         try {
           fop.write(nonAnalyzed);
           fop.flush();
           written = true;
         }
         finally {
           lock.release();
           fop.close();
         }
       }
       catch (OverlappingFileLockException ofle) {
         try {
           Thread.sleep(50L);
         }
         catch (InterruptedException localInterruptedException1)
         {
         }
       }
     while (!
       written);
   }
 
   private void writePersistence(byte[] persistenceRecords)
     throws IOException
   {
     String responseFile = "";
     FileOutputStream fop = null;
     try
     {
       responseFile = configDetails.get("locationForSplittedFiles") + "/" + 
         "PersistenceRecords" + ".txt";
       File file = new File(responseFile);
       if (!file.exists()) {
         file.createNewFile();
       }
       fop = new FileOutputStream(file, true);
     }
     catch (Exception e) {
       File newResponseFile = new File(responseFile);
       newResponseFile.createNewFile();
     }
     boolean written = false;
     do
       try {
         FileLock lock = fop.getChannel().lock();
         try {
           fop.write(persistenceRecords);
           fop.flush();
           written = true;
         }
         finally {
           lock.release();
         }
       }
       catch (OverlappingFileLockException ofle) {
         try {
           Thread.sleep(500L);
           fop.close();
         }
         catch (InterruptedException localInterruptedException1)
         {
         }
       }
     while (!
       written);
   }
 }
