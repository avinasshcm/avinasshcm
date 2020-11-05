package mqutils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.logging.Logger;

import com.ibm.mq.MQC;
import com.ibm.mq.MQEnvironment;
import com.ibm.mq.MQException;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;

public class MQUtils {

    private static final Logger LOGGER = Logger.getLogger(MQUtils.class.getName());

    private MQQueueManager _queueManager = null;

    private String queueName;

    private String template;

    private int count;

    public MQUtils() {
    }

    protected MQQueue init(String hostname, String qManager, int port, String channel, String user, String password, String queueName)
        throws IllegalArgumentException, MQException {
        MQEnvironment.hostname = hostname;
        MQEnvironment.channel = channel;
        MQEnvironment.port = port;
        MQEnvironment.userID = user;
        MQEnvironment.password = password;
        MQEnvironment.CCSID = Integer.parseInt("1098");
        _queueManager = new MQQueueManager(qManager);
        int openOptions = MQC.MQOO_OUTPUT + MQC.MQOO_FAIL_IF_QUIESCING;
        MQQueue queue = _queueManager.accessQueue(queueName, openOptions, null, null, null);
        return queue;
    }

    protected MQQueue write(MQQueue queue, String msg) throws MQException {
        try {
            MQMessage sendmsg = new MQMessage();
            sendmsg.format = MQC.MQFMT_STRING;
            sendmsg.feedback = MQC.MQFB_NONE;
            sendmsg.messageType = MQC.MQMT_DATAGRAM;
            MQPutMessageOptions pmo = new MQPutMessageOptions();
            sendmsg.clearMessage();
            sendmsg.messageId = MQC.MQMI_NONE;
            sendmsg.correlationId = MQC.MQCI_NONE;
            sendmsg.writeString(msg);
            queue.put(sendmsg, pmo);
        } catch (com.ibm.mq.MQException mqex) {
            System.out.println(mqex);
        } catch (java.io.IOException ioex) {
            System.out.println("An MQ IO error occurred : " + ioex);
        }
        return queue;
    }

    protected void close(MQQueue queue) throws MQException {
        queue.close();
        _queueManager.disconnect();
    }

    protected String getCurrentTimeStamp(Calendar cal) {
        Timestamp ts = new Timestamp(cal.getTimeInMillis());
        Instant instant = ts.toInstant();
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zoneId);
        String output = zdt.toString().substring(0, 29);
        return output;
    }

    protected String getCurrentTimeStampForPayments(Calendar cal) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(cal.getInstance().getTimeInMillis());
        String time = new SimpleDateFormat("HH:mm:ss").format(cal.getInstance().getTimeInMillis());
        return date + "T" + time;
    }

    protected String getDate(Calendar cal, String format) {
        String date = new SimpleDateFormat(format).format(cal.getInstance().getTimeInMillis());
        return date;
    }
}