package com.finastra.payment;

import java.io.Console;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MessagePusher {

    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("\nEnter one of the below option");
        System.out.print("\n1.Inward DD ");
        System.out.print("\n2.Inward CT ");
        System.out.print("\n3.POS Message ");
        System.out.print("\n3.ATM Cash Withdrawal \n");
        String option = "3";
        if ((!option.equals("1")) && (!option.equals("2")) && (!option.equals("3"))) {
            System.out.println("Enter valid option");
        }
        String numberOfTxns = "1";
        if ((numberOfTxns == null) || (numberOfTxns.trim().length() <= 0)) {
            System.out.println("Invalid number of txns.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(25);
        Runnable worker = null;
        if (option.equals("1")) {
            System.out.println("DD");
            worker = new DDMessage(numberOfTxns);
        } else if (option.equals("2")) {
            System.out.println("CT");
            worker = new CTMessage(numberOfTxns);
        } else if (option.equals("3")) {
            System.out.println("POS");
            worker = new POSMessage(numberOfTxns);
        }else if (option.equals("4")) {
            System.out.println("ATM Cash Withdrawal");
            worker = new POSMessage(numberOfTxns);
        }
        executor.execute(worker);
        executor.shutdown();
        try {
            while (!executor.awaitTermination(30L, TimeUnit.SECONDS))
                ;
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}