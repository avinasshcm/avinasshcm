package transactions;

import java.util.Calendar;
import java.util.logging.Logger;

import mqutils.MQUtilsForPayments;
import utils.ReadTemplate;
import fileutils.ReadQueueManagerDetails;
import fileutils.ReadThreadDetails;

public class InwardCreditTransfer {

    private static final Logger LOGGER = Logger.getLogger(InwardCreditTransfer.class.getName());

    public static void main(String args[]) {
        int count = Integer.parseInt(args[0]);
        int threadSize = ReadThreadDetails.Number_Of_Threads;
        long start = Calendar.getInstance().getTimeInMillis();
        String template = ReadTemplate.readFileAsString("CREDIT_TRANSFER_RECEIVED.xml");
        String queueName = ReadQueueManagerDetails.INWARD_CREDIT_HOST_INPUT;
        for (int i = 0; i < threadSize; i++) {
            Thread object = new Thread(new MQUtilsForPayments(queueName, template, count));
            object.start();
        }
        long end = Calendar.getInstance().getTimeInMillis();
        LOGGER.info("Time Taken to put " + count * threadSize + " Messages is " + (end - start) + " milliSeconds");
    }
}
