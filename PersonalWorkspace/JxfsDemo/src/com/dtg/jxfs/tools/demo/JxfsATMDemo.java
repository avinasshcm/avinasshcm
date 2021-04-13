package com.dtg.jxfs.tools.demo;

import java.io.Serializable;
import java.util.Vector;

import com.dtg.jxfs.misc.DtgJxfsObjectToStringResolver;
import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.cdr.IJxfsCDRConst;
import com.jxfs.control.cdr.JxfsATM;
import com.jxfs.control.cdr.JxfsArt6CashInOrder;
import com.jxfs.control.cdr.JxfsCashInOrder;
import com.jxfs.control.cdr.JxfsCashUnit;
import com.jxfs.control.cdr.JxfsCurrency;
import com.jxfs.control.cdr.JxfsDenomination;
import com.jxfs.control.cdr.JxfsDenominationItem;
import com.jxfs.control.cdr.JxfsDispenseOrder;
import com.jxfs.control.cdr.JxfsDispenseRequest;
import com.jxfs.control.cdr.JxfsLogicalCashUnit;
import com.jxfs.control.cdr.JxfsMixTable;
import com.jxfs.events.IJxfsIntermediateListener;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.general.IJxfsConst;

/**
 * DEMO CLASS FOR ATM 1. Open Device 2. Get Currencies 3. Get Mix Tables 4. Query Units 5. Dispense (20 Euros) 6. Query Cash Units after
 * dispense 7. CashInStart 8. CashIn 9. CashIn End 10. Query Cash Units after CashIn 11. Close Device 12. Deregister Device
 */
public class JxfsATMDemo extends JxfsBasicDemo implements IJxfsConst, IJxfsCDRConst, IJxfsOperationCompleteListener, IJxfsStatusListener,
    IJxfsIntermediateListener {

    private final static String DEMO_NAME = "ATM Demo";

    private final static String DEMO_DESCRIPTION = "Executes the following commands on the Dynasty ATM Simulator:\n" 
        + "\t1. Open Device\n"
        + "\t2. Get Currencies\n" 
        + "\t3. Get Mix Tables\n" 
        + "\t4. Query Units\n" 
        + "\t5. Dispense (20 Euros)\n"
        + "\t6. Query Cash Units after dispense\n" 
        + "\t7. CashInStart\n" 
        + "\t8. CashIn\n" 
        + "\t9. CashInEnd\n"
        + "\t10. QueryCashUnits after CashIn\n" 
        + "\t11. Close Device\n" 
        + "\t12. Deregister Device\n";

    // These constants are used to indicate the next command to execute
    // see runCommands method
    private final static int CMD_OPEN = 1;

    private final static int CMD_GET_CURRENCIES = 2;

    private final static int CMD_GET_MIXTABLES = 3;

    private final static int CMD_QUERY_UNITS = 4;

    private final static int CMD_DISPENSE = 5;

    private final static int CMD_QUERY_UNITS_DISP = 6;

    private final static int CMD_CASHIN_START = 7;

    private final static int CMD_CASHIN = 8;

    private final static int CMD_CASHIN_END = 9;

    private final static int CMD_QUERY_UNITS_CASHIN = 10;

    private final static int CMD_CLOSE = 11;

    private final static int CMD_DEREGISTER = 12;

    // In case of an error, we will execute a close and the
    // demo will end
    private final static int CMD_ERROR = CMD_CLOSE;

    private final static int CMD_END = -1;

    // This vector will be filled with the getCurrencies command
    // of the J/XFS control. We need tthe currencies for the
    // dispense and cashin commands.
    private Vector jxfsCurrencies_ = null;

    // This vector will be filled with the getMixTables command
    // of the J/XFS control. We need the mixTables for the
    // dispense command.
    private Vector jxfsMixTables_ = null;

    // The ATM Control
    private JxfsATM atm_;

    public static void main(String[] args) {
        new JxfsATMDemo(getInitString()).startDemo();
        System.out.println("<<<<< JXFS shutdown >>>>>");
        shutdown();
        System.exit(0);
    }

    /**
     * This default constructor will use the default initialization string for the J/XFS Manager (JxfsDemoService.INIT_STRING). If you want
     * to use the Dynasty Device Manager, you just have to change the constructor of JxfsDemoService to this: protected JxfsDemoService(){
     * initString_ = INIT_STRING_DDM; }
     */
    public JxfsATMDemo() {
    }

    /**
     * Used only for the main method of this class, where you can specify the initialization string for the J/XFS Manager or Dynasty Device
     * Manager.
     * 
     * @param initString
     */
    private JxfsATMDemo(String initString) {
        super(initString);
    }

    //
    public String getDemoName() {
        return DEMO_NAME;
    }

    //
    public String getDemoDescription() {
        return DEMO_DESCRIPTION;
    }

    /**
     * As first step, we have to check, if we have already obtained an instance of the J/XFS Device Manager. If not so, we have to
     * initialize it and then we can ask for the device control of the simulator. If you haven't configured a simulator, the first ATM found
     * will be used instead. This procedure is all done in the getDeviceControl method. Once we have got the deviceControl, we have to map
     * it to JxfsATM to finally run the commands.
     */
    public void startDemo() {
        IJxfsBaseControl deviceControl = getDeviceControl("CDRDynastySimulator", JxfsATM.class);
        if (deviceControl != null) {
            deviceControl.addOperationCompleteListener(this);
            deviceControl.addIntermediateListener(this);
            deviceControl.addStatusListener(this);
            if (deviceControl instanceof JxfsATM) {
                atm_ = (JxfsATM) deviceControl;
                runCommands();
            }
        }
    }

    /**
     * It's just a method to print the event data on console.
     */
    protected void printEventData(Serializable eventData) {

        if (eventData instanceof JxfsCashUnit) {
            JxfsCashUnit cashUnit = (JxfsCashUnit) eventData;
            printUnits(cashUnit.getLogicalUnits());

        } else if (eventData instanceof JxfsDispenseOrder) {
            JxfsDispenseOrder order = (JxfsDispenseOrder) eventData;
            JxfsDenomination denom = order.getDenomination();
            printDispensed(denom);

        } else if (eventData instanceof JxfsArt6CashInOrder) {
            JxfsArt6CashInOrder ciorder = (JxfsArt6CashInOrder) eventData;
            printCashInOrder(ciorder);

        } else {
            System.out.println("event.getData(): " + eventData.toString());
        }

    }

    /**
     * In case that any error occurs, the next step will be closing the device and end the demo.
     */
    protected void setError() {
        try {
            if (atm_.getStatus().isOpen()) {
                nextCommand_ = CMD_ERROR;
            } else {
                atm_.deregisterDevice();
                nextCommand_ = CMD_END;
            }
        } catch (JxfsException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is running step by step some of the methods of the device control. getCurrencies(), getMixTables() and deregisterDevice()
     * are synchronous and we haven't to wait for the operation complete event. After the switch we are calling the method to wait for the
     * operation complete, so for all synchronous methods, we have to use "continue" to avoid that application hangs, waiting for a
     * operation complete event, that doesn't exist.
     */
    private void runCommands() {
        nextCommand_ = CMD_OPEN;
        while (nextCommand_ != CMD_END) {
            try {
                switch (nextCommand_) {
                case CMD_OPEN:
                    System.out.println("*** CMD_OPEN");
                    identificationID_ = atm_.open();
                    break;
                case CMD_GET_CURRENCIES:
                    // Synchronous: getCurrencies
                    System.out.println("*** CMD_GET_CURRENCIES");
                    jxfsCurrencies_ = atm_.getCurrencies();
                    nextCommand_ = CMD_GET_MIXTABLES;
                    printCurrencies();
                    continue;

                case CMD_GET_MIXTABLES:
                    // Synchronous: getMixTables
                    System.out.println("*** CMD_GET_MIXTABLES");
                    jxfsMixTables_ = atm_.getMixTables();
                    nextCommand_ = CMD_QUERY_UNITS;
                    printMixTables();
                    continue;

                case CMD_QUERY_UNITS:
                    System.out.println("*** CMD_QUERY_UNITS");
                    identificationID_ = atm_.queryCashUnit();
                    break;

                case CMD_DISPENSE:
                    // We want to dispense (20 Euros) (Algorithm: MIN_BILLS)
                    // Create a JxfsDispenseRequest
                    JxfsDispenseRequest request =
                        new JxfsDispenseRequest(((JxfsMixTable) jxfsMixTables_.get(0)).getMixInfo().getNumber() /* Min bills algorithm */,
                            new JxfsDenomination(new Vector(), 20, 0) /* No denomination used */,
                            (JxfsCurrency) jxfsCurrencies_.get(0)/* EUR */, JXFS_C_CDR_POS_DEFAULT);

                    System.out.println("*** CMD_DISPENSE");
                    identificationID_ = atm_.dispense(request);
                    break;

                case CMD_QUERY_UNITS_DISP:
                    System.out.println("*** CMD_QUERY_UNITS_DISP");
                    identificationID_ = atm_.queryCashUnit();
                    break;

                case CMD_CASHIN_START:
                    System.out.println("*** CMD_CASHIN_START");
                    identificationID_ = atm_.cashInStart(JXFS_C_CDR_POS_DEFAULT, false);
                    break;

                case CMD_CASHIN:
                    System.out.println("*** CMD_CASHIN");
                    identificationID_ =
                        atm_.cashIn(new JxfsCashInOrder(new JxfsDenomination(new Vector(), 0, 0), (JxfsCurrency) jxfsCurrencies_.get(0) /* EUR */
                        ));
                    break;

                case CMD_CASHIN_END:
                    System.out.println("*** CMD_CASHIN_END");
                    identificationID_ = atm_.cashInEnd();
                    break;

                case CMD_QUERY_UNITS_CASHIN:
                    System.out.println("*** CMD_QUERY_UNITS_CASHIN");
                    identificationID_ = atm_.queryCashUnit();
                    break;

                case CMD_CLOSE:
                    System.out.println("*** CMD_CLOSE");
                    identificationID_ = atm_.close();
                    break;
                case CMD_DEREGISTER:
                    System.out.println("*** CMD_DEREGISTER");
                    atm_.deregisterDevice();
                    nextCommand_ = CMD_END;
                    continue;
                }
                waitForOce();
            } catch (JxfsException e) {
                int errorCode = e.getErrorCode();

                System.out.println("JxfsException: " + errorCode + " = "
                    + DtgJxfsObjectToStringResolver.getOperationCompleteIdStringFromObject(atm_, errorCode));

                setError();
            }
        }
    }

    /**
     * Prints the Currencies on console
     */
    private void printCurrencies() {
        System.out.println("\t---- CURRENCIES ----");
        for (int i = 0; i < jxfsCurrencies_.size(); i++) {
            JxfsCurrency cur = (JxfsCurrency) jxfsCurrencies_.get(i);
            System.out.println("\tCURRENCY[" + i + "]: " + cur.getCurrencyCode().getCurrencyCode() + " (exp: " + cur.getExponent() + ")");
        }
    }

    /**
     * Prints the Cash Units info on console
     */
    private void printUnits(Vector jxfsUnits) {
        System.out.println("\t---- UNITS ----");
        for (int i = 0; i < jxfsUnits.size(); i++) {
            JxfsLogicalCashUnit unit = (JxfsLogicalCashUnit) jxfsUnits.get(i);
            System.out.println("\tUNIT[" + unit.getNumber() + "]: " + unit.getUnitID() + " - " + unit.getCashType().getValue() + " "
                + unit.getCashType().getCurrencyCode().getCurrencyCode() + " (count: " + unit.getCount() + ")");
        }
    }

    /**
     * Prints the cashInOrder on console
     * 
     * @param order
     */
    private void printCashInOrder(JxfsArt6CashInOrder order) {
        System.out.println("\t---- CASHIN ORDER DETAILS ----");
        System.out.println("\tCurrency: " + order.getCurrency().getCurrencyCode().getCurrencyCode());
        JxfsDenomination denom = order.getDenomination();
        Vector items = denom.getItems();
        for (int i = 0; i < items.size(); i++) {
            JxfsDenominationItem item = (JxfsDenominationItem) items.get(i);
            System.out.println("\tUNIT[" + item.getUnit() + "]: CashedIn: " + item.getCount() + " items");
        }
    }

    /**
     * Prints the dispensed items on console
     * 
     * @param denom
     */
    private void printDispensed(JxfsDenomination denom) {
        System.out.println("\t---- DISPENSED ----");
        Vector items = denom.getItems();
        for (int i = 0; i < items.size(); i++) {
            JxfsDenominationItem item = (JxfsDenominationItem) items.get(i);
            System.out.println("\tUNIT[" + item.getUnit() + "]: Dispensed: " + item.getCount() + " items");
        }
    }

    /**
     * Prints the mix tables on console
     */
    private void printMixTables() {
        System.out.println("\t---- MIX TABLES ----");
        for (int i = 0; i < jxfsMixTables_.size(); i++) {
            JxfsMixTable tbl = (JxfsMixTable) jxfsMixTables_.get(i);
            System.out.println("\tTABLE[" + tbl.getMixInfo().getNumber() + "]: " + tbl.getMixInfo().getName());
        }
    }
}
