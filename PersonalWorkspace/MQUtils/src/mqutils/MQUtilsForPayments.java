package mqutils;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import pojo.AccountInfo;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import data.GatherData;
import fileutils.ReadQueueManagerDetails;
import fileutils.ReadTransactionDetails;

public class MQUtilsForPayments implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(MQUtilsForPayments.class.getName());

    private String queueName;

    private String template;

    private int count;

    public MQUtilsForPayments(String queueName, String template, int count) {
        this.queueName = queueName;
        this.template = template;
        this.count = count;
    }

    public synchronized void put(String queueName, String template, int count, long threadID) {
        MQUtils mqUtils = new MQUtils();
        try {
            QueueConnection connection = null;
            QueueSession session = null;
            Queue queue = null;
            QueueSender sender = null;
            try {
                String connectionFactory = "com.ibm.mq.jms.MQQueueConnectionFactory";
                Class.forName(connectionFactory);
                QueueConnectionFactory factory = new MQQueueConnectionFactory();
                ((MQQueueConnectionFactory) factory).setQueueManager(ReadQueueManagerDetails.PAYMENTS_QUEUE_MANAGER);
                ((MQQueueConnectionFactory) factory).setHostName(ReadQueueManagerDetails.PAYMENTS_QM_HOSTNAME);
                ((MQQueueConnectionFactory) factory).setPort(ReadQueueManagerDetails.PAYMENTS_QM_PORT);
                ((MQQueueConnectionFactory) factory).setTransportType(1);
                connection = factory.createQueueConnection("", "");
                connection.start();
                session = connection.createQueueSession(false, 1);
                queue = session.createQueue(queueName);
                sender = session.createSender(queue);
            } catch (Exception exception) {
                System.err.println(exception);
            }

            MessageFormat inwardDirectDebitTemplate = new MessageFormat(template);
            String txnDt = "";
            String txnTm = "";
            String sysArrivalDt = "";
            String valueDt = "";
            Object[] params = { txnDt, txnTm, sysArrivalDt, valueDt, "", "", "CdtrAcc", "DbrtAcc" };

            GatherData gd = new GatherData(ReadTransactionDetails.ACCOUNTS_FILE_NAME_FOR_DD);
            List<AccountInfo> accountList = gd.getAccountList(count);
            for (int i = 0; i < count; i++) {
                Calendar cal = Calendar.getInstance();
                params[0] = mqUtils.getDate(cal, "yyyy-MM-dd");
                params[1] = mqUtils.getDate(cal, "HH:mm:ss");
                params[2] = mqUtils.getDate(cal, "yyyy/MM/dd");
                params[3] = mqUtils.getDate(cal, "yyyyMMdd");
                params[4] = String.valueOf(cal.getTimeInMillis());
                System.out.println(String.valueOf(Thread.currentThread().getId() % 100) + "-" + String.valueOf(i));
                params[5] = String.valueOf(Thread.currentThread().getId() % 100) + "-" + String.valueOf(i);
                params[6] = accountList.get(i).getCdtrAcct();
                params[7] = accountList.get(i).getDbtrAcc();
                accountList.get(i);
                // "HH:mm:ss"
                // params[3] = String.valueOf(threadID % 100) + String.valueOf(cal.getTimeInMillis());

                String msg = inwardDirectDebitTemplate.format(params);
                // System.out.println(msg);
                try {
                    TextMessage outMessage = session.createTextMessage();
                    outMessage.setText(msg);
                    sender.send(outMessage);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            try {
                session.close();
            } catch (Exception localException1) {
            }
            try {
                connection.close();
            } catch (Exception localException2) {
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
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