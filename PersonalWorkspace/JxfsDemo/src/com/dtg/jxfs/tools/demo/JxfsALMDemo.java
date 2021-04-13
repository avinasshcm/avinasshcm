package com.dtg.jxfs.tools.demo;

import java.io.Serializable;

import com.dtg.jxfs.misc.DtgJxfsObjectToStringResolver;
import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.alm.JxfsAlarm;
import com.jxfs.control.msd.IJxfsMSDConst;
import com.jxfs.control.msd.JxfsMSDTracks;
import com.jxfs.events.IJxfsIntermediateListener;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.general.IJxfsConst;

/**
 * DEMO CLASS FOR MSD 1. Open Device 2. Write Data 3. Read Data 4. Close Device 5. Deregister Device
 */
public class JxfsALMDemo extends JxfsBasicDemo implements IJxfsConst, IJxfsMSDConst, IJxfsIntermediateListener,
    IJxfsOperationCompleteListener, IJxfsStatusListener {

    private final static String DEMO_NAME = "ALM Demo";

    private final static String DEMO_DESCRIPTION = "Executes the following commands on the Dynasty ALM Simulator:\n" 
        + "\t1. Open Device\n"
        + "\t2. Alarm on\n" 
        + "\t3. Alarm off\n" 
        + "\t4. Close Device\n" 
        + "\t5. Deregister Device\n";

    // These constants are used to indicate the next command to execute
    // see runCommands method
    private final static int CMD_OPEN = 1;

    private final static int CMD_ALM_ON = 2;

    private final static int CMD_ALM_OFF = 3;

    private final static int CMD_CLOSE = 4;

    private final static int CMD_DEREGISTER = 5;

    // In case of an error, we will execute a close and the
    // demo will end
    private final static int CMD_ERROR = CMD_CLOSE;

    private final static int CMD_END = -1;

    // The ALM Control
    private JxfsAlarm alm_;

    //
    public static void main(String[] args) {
        new JxfsALMDemo(getInitString()).startDemo();
        System.out.println("<<<<< JXFS shutdown >>>>>");
        shutdown();
        System.exit(0);
    }

    /**
     * This default constructor will use the default initialization string for the J/XFS Manager (JxfsDemoService.INIT_STRING). If you want
     * to use the Dynasty Device Manager, you just have to change the constructor of JxfsDemoService to this: protected JxfsDemoService(){
     * initString_ = INIT_STRING_DDM; }
     */
    public JxfsALMDemo() {
        super();
    }

    /**
     * Used only for the main method of this class, where you can specify the initialization string for the J/XFS Manager or Dynasty Device
     * Manager.
     * 
     * @param initString
     */
    private JxfsALMDemo(String initString) {
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
     * initialize it and then we can ask for the device control of the simulator. If you haven't configured a simulator, the first
     * JxfsDocumentPrinter found will be used instead. This procedure is all done in the getDeviceControl method. Once we have got the
     * deviceControl, we have to map it to JxfsDocumentPrinter to finally run the commands.
     */
    public void startDemo() {
        IJxfsBaseControl deviceControl = getDeviceControl("AlarmDynastySimulator@dss", JxfsAlarm.class);
        if (deviceControl != null) {
            deviceControl.addOperationCompleteListener(this);
            deviceControl.addStatusListener(this);
            deviceControl.addIntermediateListener(this);
            if (deviceControl instanceof JxfsAlarm) {
                alm_ = (JxfsAlarm) deviceControl;
                runCommands();
            }
        }
    }

    /**
     * It's just a method to print the event data on console.
     */
    protected void printEventData(Serializable eventData) {
        if (eventData instanceof JxfsMSDTracks) {
            JxfsMSDTracks wrTracks = (JxfsMSDTracks) eventData;

            if (wrTracks.isTrack1()) {
                System.out.println("Track1 has been written");
            }
            if (wrTracks.isTrack2()) {
                System.out.println("Track2 has been written");
            }
            if (wrTracks.isTrack3()) {
                System.out.println("Track3 has been written");
            }
        } else {
            System.out.println("event.getData(): " + eventData.toString());
        }
    }

    /**
     * In case that any error occurs, the next step will be closing the device and end the demo.
     */
    protected void setError() {

        try {
            if (alm_.getStatus().isOpen()) {
                nextCommand_ = CMD_ERROR;
            } else {
                alm_.deregisterDevice();
                nextCommand_ = CMD_END;
            }
        } catch (JxfsException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is running step by step some of the methods of the device control. deregisterDevice() is synchronous and we haven't to
     * wait for the operation complete event. After the switch we are calling the method to wait for the operation complete, so for all
     * synchronous methods, we have to use "continue" to avoid that application hangs, waiting for a operation complete event, that doesn't
     * exist.
     */
    private void runCommands() {
        nextCommand_ = CMD_OPEN;
        while (nextCommand_ != CMD_END) {
            try {
                switch (nextCommand_) {
                case CMD_OPEN:
                    identificationID_ = alm_.open();
                    break;
                case CMD_ALM_ON:
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    identificationID_ = alm_.alarm(true);
                    break;
                case CMD_ALM_OFF:
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    // Select the two first tracks to be read.
                    identificationID_ = alm_.alarm(false);
                    break;
                case CMD_CLOSE:
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    identificationID_ = alm_.close();
                    break;
                case CMD_DEREGISTER:
                    alm_.deregisterDevice();
                    nextCommand_ = CMD_END;
                    continue;
                }

                waitForOce();
            } catch (JxfsException e) {
                int errorCode = e.getErrorCode();

                System.out.println("JxfsException: " + errorCode + " = "
                    + DtgJxfsObjectToStringResolver.getOperationCompleteIdStringFromObject(alm_, errorCode));

                setError();
            }
        }
    }
}
