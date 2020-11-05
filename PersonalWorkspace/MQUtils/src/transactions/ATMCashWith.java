package transactions;

import java.util.Calendar;
import java.util.logging.Logger;

import mqutils.MQUtilsForATM;
import utils.ReadTemplate;
import fileutils.ReadQueueManagerDetails;
import fileutils.ReadThreadDetails;

public class ATMCashWith {

    private static final Logger LOGGER = Logger.getLogger(ATMCashWith.class.getName());

    public static void main(String args[]) {
        int count = Integer.parseInt(args[0]);
        int threadSize = ReadThreadDetails.Number_Of_Threads;
        long start = Calendar.getInstance().getTimeInMillis();
        String template = ReadTemplate.readFileAsString("CASHWITH.xml");
        String queueName = ReadQueueManagerDetails.CASHWITH_QUEUE_NAME;
        for (int i = 0; i < threadSize; i++) {
            Thread object = new Thread(new MQUtilsForATM(queueName, template, count));
            object.start();
        }
        long end = Calendar.getInstance().getTimeInMillis();
        LOGGER.info("Time Taken to put " + count * threadSize + " Messages is " + (end - start) + " milliSeconds");
    }
}
