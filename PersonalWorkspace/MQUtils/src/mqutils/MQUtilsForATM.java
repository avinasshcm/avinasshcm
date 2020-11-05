package mqutils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import pojo.AccountInfo;

import com.ibm.mq.MQException;
import com.ibm.mq.MQQueue;

import data.GatherData;
import fileutils.ReadQueueManagerDetails;
import fileutils.ReadTransactionDetails;

public class MQUtilsForATM implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(MQUtilsForATM.class.getName());

    private String queueName;

    private String template;

    private int count;

    public MQUtilsForATM(String queueName, String template, int count) {
        this.queueName = queueName;
        this.template = template;
        this.count = count;
    }

    public void put(String queueName, String template, int count, long threadID) {

        MQUtils mqUtils = new MQUtils();
        try {
            MQQueue queue =
                mqUtils.init(ReadQueueManagerDetails.QM_HOSTNAME, ReadQueueManagerDetails.QUEUE_MANAGER, ReadQueueManagerDetails.QM_PORT,
                    ReadQueueManagerDetails.QM_CHANNEL, ReadQueueManagerDetails.QM_USER, ReadQueueManagerDetails.QM_PASSWORD, queueName);
            MessageFormat cashWithTemplate = new MessageFormat(template);
            String txnReference = "12345";
            String txnDtTm = "";
            Object[] params = { txnDtTm, txnReference, "", "", "" };

            GatherData gd = new GatherData(ReadTransactionDetails.ACCOUNTS_FILE_NAME_FOR_ATM);
            List<AccountInfo> accountList = gd.getAccountList(count);
            List<String> revMsgList = new ArrayList<String>();
            for (int i = 0; i < count; i++) {
                Calendar cal = Calendar.getInstance();
                params[0] = mqUtils.getCurrentTimeStamp(cal);
                params[1] = String.valueOf(threadID % 100) + String.valueOf(cal.getTimeInMillis());

                params[2] = "";
                System.out.println(params[0] +"\t" +accountList.get(i).getStdAcctNum() + "\t" + accountList.get(i).getAtmCardNumber());
                params[3] = accountList.get(i).getStdAcctNum();
                params[4] = accountList.get(i).getAtmCardNumber();
                String msg = cashWithTemplate.format(params);
                queue = mqUtils.write(queue, msg);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                params[2] = "Reversal";
                String revMsg = cashWithTemplate.format(params);

                revMsgList.add(revMsg);

                // queue = mqUtils.write(queue, revMsg);
            }

            for (String revItem : revMsgList) {
                //queue = mqUtils.write(queue, revItem);
            }
            mqUtils.close(queue);
        } catch (IllegalArgumentException e) {
            System.exit(1);
        } catch (MQException e) {
            System.exit(1);
        }
    }

    @Override
    public void run() {
        try {
            LOGGER.info("Thread " + Thread.currentThread().getId() + " is Running");
            put(queueName, template, count, Thread.currentThread().getId());
            LOGGER.info("Thread " + Thread.currentThread().getId() + " is Stopped");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}