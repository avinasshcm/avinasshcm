 package com.misys.BFUB.auditAnalyzer.writer.worker;
 
 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.util.logging.Logger;
 
 public class AuditWriterWorker
   implements Runnable
 {
   private Logger logger = null;
   private String details = null;
   private String fileName = null;
 
   public AuditWriterWorker(Logger logger, String details, String fileName) {
     this.logger = logger;
     this.details = details;
     this.fileName = fileName;
   }
 
   public void run()
   {
     writeFile();
   }
 
   private void writeFile() {
     FileOutputStream fop = null;
     File file = null;
     try {
       file = new File(this.fileName);
       if (!file.exists()) {
         file.createNewFile();
       }
       fop = new FileOutputStream(file, true);
     }
     catch (Exception e) {
       File newResponseFile = new File(this.fileName);
       try {
         newResponseFile.createNewFile();
       }
       catch (IOException exception) {
         this.logger.info(exception.getLocalizedMessage());
       }
     }
     try {
       fop.write(this.details.getBytes());
       fop.flush();
       fop.close();
     }
     catch (IOException exception) {
       this.logger.info(exception.getLocalizedMessage());
     }
   }
 }
