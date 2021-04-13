package com.dtg.jxfs.tools.demo;

import java.io.Serializable;

import com.dtg.jxfs.consts.DtgJxfsPrinterConst;
import com.dtg.jxfs.misc.DtgJxfsObjectToStringResolver;
import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.ptr.IJxfsPrinterConst;
import com.jxfs.control.ptr.JxfsDocumentPrinter;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.general.IJxfsConst;

/**
 * DEMO CLASS FOR DOCUMENT 1. Open Device 2. Print form 3. Eject 4. DirectIO 5. Close Device 6. Deregister Device
 */
public class JxfsDocumentPtrDemo extends JxfsBasicDemo implements IJxfsConst, IJxfsPrinterConst, IJxfsOperationCompleteListener,
    IJxfsStatusListener {

    private final static String DEMO_NAME = "Document Printer Demo";

    private final static String DEMO_DESCRIPTION = "Executes the following commands on the Document System Printer:\n"
        + "\t1. Open Device\n" 
        + "\t2. Print form\n" 
        + "\t3. Eject\n" 
        + "\t4. DirectIO \n" 
        + "\t5. Close Device\n" 
        + "\t6. Deregister";

    // These constants are used to indicate the next command to execute
    // see runCommands method
    private final static int CMD_OPEN = 1;

    private final static int CMD_PRINT = 2;

    private final static int CMD_EJECT = 3;

    private final static int CMD_DIRECTIO = 4;

    private final static int CMD_CLOSE = 5;

    private final static int CMD_DEREGISTER = 6;

    // In case of an error, we will execute a close and the
    // demo will end
    private final static int CMD_ERROR = CMD_CLOSE;

    private final static int CMD_END = -1;

    // The Document Control
    private JxfsDocumentPrinter ptr_;

    //
    public static void main(String[] args) {
        new JxfsDocumentPtrDemo(JxfsDemoService.getInitString()).startDemo();
        System.out.println("<<<<< JXFS shutdown >>>>>");
        shutdown();
        System.exit(0);
    }

    /**
     * This default constructor will use the default initialization string for the J/XFS Manager (JxfsDemoService.INIT_STRING). If you want
     * to use the Dynasty Device Manager, you just have to change the constructor of JxfsDemoService to this: protected JxfsDemoService(){
     * initString_ = INIT_STRING_DDM; }
     */
    public JxfsDocumentPtrDemo() {
        super();
    }

    /**
     * Used only for the main method of this class, where you can specify the initialization string for the J/XFS Manager or Dynasty Device
     * Manager.
     * 
     * @param initString
     */
    public JxfsDocumentPtrDemo(String initString) {
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
        IJxfsBaseControl deviceControl = getDeviceControl("DocumentSystemDefault", JxfsDocumentPrinter.class);
        if (deviceControl != null) {
            deviceControl.addOperationCompleteListener(this);
            deviceControl.addStatusListener(this);
            if (deviceControl instanceof JxfsDocumentPrinter) {
                ptr_ = (JxfsDocumentPrinter) deviceControl;
                runCommands();
            }
        }
    }

    /**
     * It's just a method to print the event data on console.
     */
    protected void printEventData(Serializable eventData) {
        System.out.println("event.getData(): " + eventData.toString());
    }

    /**
     * In case that any error occurs, the next step will be closing the device and end the demo.
     */
    protected void setError() {

        try {
            if (ptr_.getStatus().isOpen()) {
                nextCommand_ = CMD_ERROR;
            } else {
                ptr_.deregisterDevice();
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
                    identificationID_ = ptr_.open();
                    ptr_.removeStatusListener(this);
                    break;
                case CMD_PRINT:
                    String[] data = new String[] { "Field001=Misys header Example","Field010=2017000000000000000213" ,"Field012=ASDFklkjlkjl KJjklkj","Field023=fgajksjglkfdjgkdsjgkljfljg kjlsjdflkj lkjlkflakjlv kjlkh jkhkj hkj"};
                    identificationID_ = ptr_.printForm("CustomBankCheque_Advice.frm", "Legal.mdf", data);
                    break;
                case CMD_EJECT:
                    ptr_.addStatusListener(this);
                    identificationID_ = ptr_.ejectMedia(JXFS_PTR_CTRL_FLUSH);
                    break;
                case CMD_DIRECTIO:
                    identificationID_ = ptr_.directIO(DtgJxfsPrinterConst.DTG_JXFS_PTR_DIO_DATA_HANDLER_DIALOG, null);
                    break;
                case CMD_CLOSE:
                    identificationID_ = ptr_.close();
                    break;
                case CMD_DEREGISTER:
                    ptr_.deregisterDevice();
                    nextCommand_ = CMD_END;
                    continue;
                }
                waitForOce();
            } catch (JxfsException e) {
                int errorCode = e.getErrorCode();
                System.out.println("JxfsException: " + errorCode + " = "
                    + DtgJxfsObjectToStringResolver.getOperationCompleteIdStringFromObject(ptr_, errorCode));
                setError();
            }
        }
    }

}
