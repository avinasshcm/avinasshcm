package launcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import transactions.ATMCashWith;
import transactions.InwardCreditTransfer;
import transactions.InwardDirectDebits;
import transactions.POSPurchase;

public class MessageGeneratorLauncher {

    public static void main(String[] args) {
        System.out.print("\n 1.  ATM Cash Withdrawal");
        System.out.print("\n 2.  POS Purchase");
        System.out.print("\n 3.  Inward DD Triggers");
        System.out.print("\n 4.  Inward CT Triggers");
        System.out.print("\nEnter Your Selection : ");
        String option = readLine();
        String txnCount = "1";
        String pmtInfoCount = "1";
        if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4")) {
            System.out.print("\nEnter Number of Transactions : ");
            txnCount = readLine();
        }

        String argument[] = { txnCount };
        switch (Integer.parseInt(option)) {
        case 1:
            ATMCashWith atmCashWith = new ATMCashWith();
            atmCashWith.main(argument);
            break;
        case 2:
            POSPurchase posPurchase = new POSPurchase();
            posPurchase.main(argument);
            break;
        case 3:
            InwardDirectDebits inwardDirectDebits = new InwardDirectDebits();
            inwardDirectDebits.main(argument);
            break;

        case 4:
            InwardCreditTransfer inwardCreditTransfer = new InwardCreditTransfer();
            inwardCreditTransfer.main(argument);
            break;
        default:
            System.out.println("Invalid Option");
            break;
        }

    }

    public static String readLine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String option = null;
        try {
            option = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read Input!");
        }
        return option;
    }

}
