/**
 * 
 */
package dummy.print;

import java.util.List;

import com.trapedza.bankfusion.core.BankFusionException;
import com.trapedza.bankfusion.servercommon.commands.BankFusionEnvironment;
import com.trapedza.bankfusion.steps.refimpl.AbstractDummyPrint;

import com.misys.bankfusion.cbs.device.service.PrinterService;

/**
 * Cash Withdrawal calculation fatom
 * @author amanjuna 
 *
 */
public class DummyPrint extends AbstractDummyPrint {
    private static final long serialVersionUID = -2798278388514514594L;
    Class docPrinterClass = com.jxfs.control.ptr.JxfsDocumentPrinter.class;
    
    public DummyPrint() {
    }

    public DummyPrint(BankFusionEnvironment env) {
        this();
    }

    @Override
    public void process(BankFusionEnvironment env) throws BankFusionException {
        PrinterService p = new PrinterService();
        setF_IN_DeviceName("DSD_00000001:DocumentSystemDefault@BLR2UBLP070");
        //[Field001=CASHDEP, Field002=Cash Deposit, Field003=, Field004=99999999, Field005=Head Office, Field006=teller1, Field007=March 28, 2017, Field008=13:18:17, Field009=13dcc07e0338ffff, Field010=9999999928031713110000826, Field011=, Field012=C, Field013=C, Field014=C, Field015=C, Field016=C, Field017=March 28, 2017, Field018=March 28, 2017, Field019=March 28, 2017, Field020=, Field021=DOMP10026EUR00500002, Field022=Puspita_SG1, Field023=P10026, Field024=Puspita_SG1, Field025=100.00, Field026=EUR, Field027=EURO CURRENCY One Hundred And Zero Only, Field028=100.00, Field029=EUR, Field030=EURO CURRENCY One Hundred And Zero Only, Field031=0, Field032=EUR, Field033=EURO CURRENCY Zero And Zero Only, Field034=16,570.26, Field035=EUR, Field036=16,570.26, Field037=EUR, Field038=, Field039=, Field040=, Field041=, Field042=, Field043=, Field044=, Field045=, Field046=, Field047=, Field048=, Field049=, Field050=, Field051=, Field052=, Field053=, Field054=, Field055=, Field056=, Field057=, Field058=, Field059=, Field060=, Field061=, Field062=, Field063=, Field064=, Field065=, Field066=, Field067=, Field068=, Field069=, Field070=, Field071=, Field072=, Field073=, Field074=, Field075=, Field076=, Field077=, Field078=, Field079=, Field080=, Field081=, Field082=, Field083=, Field084=, Field085=, Field086=, Field087=, Field088=, Field089=, Field090=, Field091=, Field092=, Field093=, Field094=, Field095=, Field096=, Field097=, Field098=, Field099=, Field100=, TellerAnyType2=, TellerAnyType3=, TellerAnyType4=, TellerAnyType5=, UserField001=, UserField002=, UserField003=, UserField004=, UserField005=, UserField006=, UserField007=, UserField008=, UserField009=, UserField010=, UserField011=, UserField012=, UserField013=, UserField014=, UserField015=, UserField016=, UserField017=, UserField018=, UserField019=, UserField020=, UserField021=, UserField022=, UserField023=, UserField024=, UserField025=, UserField026=, UserField027=, UserField028=, UserField029=, UserField030=, UserField031=, UserField032=, UserField033=, UserField034=, UserField035=, UserField036=, UserField037=, UserField038=, UserField039=, UserField040=, UserField041=, UserField042=, UserField043=, UserField044=, UserField045=, UserField046=, UserField047=, UserField048=, UserField049=, UserField050=, UserAnyType=]
        
        //String[] fields = { "Field001=THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG'S BACK 1234567890", "Field002=CASHDEP","Field003=CASHDEP", "Field004=CASHDEP","Field005=CASHDEP", "Field006=CASHDEP" };
        String[] fields = { "Field027=Two Thousand Five Hundred Eighty Seven And Thirty Six Cents Only", "Field002=CASHDEP","Field003=CASHDEP", "Field004=CASHDEP","Field005=CASHDEP", "Field006=CASHDEP" };
        String formName = "IssueBankChequeCashAdvice";
        String mediaName = "Legal";
        
        List Status = p.print(getF_IN_DeviceName(), docPrinterClass,formName ,mediaName , fields);

    }
}
