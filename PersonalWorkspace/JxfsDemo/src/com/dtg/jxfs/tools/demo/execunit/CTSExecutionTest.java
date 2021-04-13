package com.dtg.jxfs.tools.demo.execunit;

import com.dtg.comm.DtgCommDriver;
import com.dtg.comm.DtgRawExecutionUnit;

public class CTSExecutionTest extends DtgRawExecutionUnit {

    // Constants
    public final static int MAX_SEQUENTIAL_NUMBER = 9;

    public final static String COMMAND_SEPARATOR = ",";

    // Communication constants:
    public final static String STX = "" + (char) 0x02;

    public final static String ETX = "" + (char) 0x03;

    public final static String EOT = "" + (char) 0x04;

    // CM24 Commands
    public final static char CM24_OPEN = 'O';

    public final static char CM24_CLOSE = 'C';

    public final static char CM24_SPECIAL_DEPOSIT = 'D';

    int sequentialNumber_ = 0;

    public Object executeUnit() {

        if (!((DtgCommDriver) this.getCommDriver()).isOpen()) {
            if (!((DtgCommDriver) this.getCommDriver()).open()) {
                return null;
            }
        }
        byte[] resp;

        try {
            String OpenMessage = "" + STX + CM24_OPEN;
            OpenMessage += COMMAND_SEPARATOR;
            OpenMessage += incrementSequentialNumber();
            OpenMessage += COMMAND_SEPARATOR;
            OpenMessage += 'L';
            OpenMessage += COMMAND_SEPARATOR;
            OpenMessage += "123456" + ETX;
            OpenMessage += getBCC(OpenMessage);
            OpenMessage += EOT;

            resp = readWrite(OpenMessage.getBytes(), 1000000);

            String SpecialDepositMessage = "";
            SpecialDepositMessage += STX + CM24_SPECIAL_DEPOSIT;
            SpecialDepositMessage += COMMAND_SEPARATOR;
            SpecialDepositMessage += incrementSequentialNumber();
            SpecialDepositMessage += COMMAND_SEPARATOR;
            SpecialDepositMessage += 'L';
            SpecialDepositMessage += COMMAND_SEPARATOR;
            SpecialDepositMessage += 24;
            SpecialDepositMessage += COMMAND_SEPARATOR;
            SpecialDepositMessage += "0000" + ETX;
            SpecialDepositMessage += getBCC(SpecialDepositMessage);
            SpecialDepositMessage += EOT;

            resp = readWrite(SpecialDepositMessage.getBytes(), 1000000);

            String CloseMessage = "" + STX + CM24_CLOSE;
            CloseMessage += COMMAND_SEPARATOR;
            CloseMessage += incrementSequentialNumber();
            CloseMessage += COMMAND_SEPARATOR;
            CloseMessage += 'L' + ETX;
            CloseMessage += getBCC(CloseMessage);
            CloseMessage += EOT;

            readWrite(CloseMessage.getBytes(), 1000000);

            if (((DtgCommDriver) this.getCommDriver()).isOpen()) {
                ((DtgCommDriver) this.getCommDriver()).close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            // Error, returning null back to application
            return null;
        }

        return resp;
    }

    public int incrementSequentialNumber() {
        sequentialNumber_++;

        if (sequentialNumber_ > MAX_SEQUENTIAL_NUMBER)
            sequentialNumber_ = 1;

        return sequentialNumber_;
    }

    // Calculate the BCC code for the message to send, and
    // return it as a character, to concat with the message.
    private char getBCC(String message) {
        int Value = 0;

        if ((message != null) && (message.length() >= 2)) {
            // All characters including the STX
            for (int i = 0; i < message.length(); i++)
                Value += (int) message.charAt(i);

            Value &= 0x007F;
        }

        return (char) Value;
    }
}
