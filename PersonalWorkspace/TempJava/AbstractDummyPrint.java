package com.trapedza.bankfusion.steps.refimpl;

import java.util.ArrayList;
import com.trapedza.bankfusion.microflow.ActivityStep;
import java.util.Map;
import java.util.List;
import com.trapedza.bankfusion.core.BankFusionException;
import java.util.HashMap;
import com.trapedza.bankfusion.core.DataType;
import com.trapedza.bankfusion.utils.Utils;
import com.trapedza.bankfusion.core.CommonConstants;
import java.util.Iterator;
import com.trapedza.bankfusion.servercommon.commands.BankFusionEnvironment;
import com.trapedza.bankfusion.core.ExtensionPointHelper;
import bf.com.misys.bankfusion.attributes.UserDefinedFields;

/**
 * 
 * DO NOT CHANGE MANUALLY - THIS IS AUTOMATICALLY GENERATED CODE.<br>
 * This will be overwritten by any subsequent code-generation.
 *
 */
public abstract class AbstractDummyPrint implements IDummyPrint {
    /**
     * @deprecated use no-argument constructor!
     */
    public AbstractDummyPrint(BankFusionEnvironment env) {
    }

    public AbstractDummyPrint() {
    }

    private String f_IN_DeviceName = CommonConstants.EMPTY_STRING;

    public void process(BankFusionEnvironment env) throws BankFusionException {
    }

    public String getF_IN_DeviceName() {
        return f_IN_DeviceName;
    }

    public void setF_IN_DeviceName(String param) {
        f_IN_DeviceName = param;
    }

    public Map getInDataMap() {
        Map dataInMap = new HashMap();
        dataInMap.put(IN_DeviceName, f_IN_DeviceName);
        return dataInMap;
    }
}