public interface SQLTemplate {

    public static final String insertInto = "INSERT INTO BTTB_TXNMFDETAILS ( BTTXNMFDETAILSIDPK, BTTXNDEFNDETAILSID, BTMFTYPE, BTSTATE, BTMFNAME, VERSIONNUM, BTDATELASTMAINTAINED, BTLASTMAINTAINEDUSER, BTTXNPROCMODE ) ";

    public static final String date = " CURRENT TIMESTAMP ";

    public static final String user = " CURRENT USER ";

    public static final String txnModeMain = "''EXECSTDTXN''";

    public static final String txnModeReversal = "''CANCSTDTXN''";

    public static final String SCF = "''SCF''";

    public static final String SRV = "''SRV''";

    public static final String preInputMain =       insertInto + " VALUES ({0}1,''{1}'', " + SCF + ", ''UEPINPT'',''BT_EXT_{2}PreInput_SCF''   , 0, " + date + " , " + user + ", " + txnModeMain + " );\n";

    public static final String inputMain =          insertInto + " VALUES ({0}2,''{1}'', " + SCF + ", ''UEINPT'', ''BT_EXT_{2}Input_SCF'', 0, " + date + " , " + user + ", " + txnModeMain + " );\n";

    public static final String validateMain =       insertInto + " VALUES ({0}3,''{1}'', " + SRV + ", ''UEVALD'', ''BT_EXT_{2}Validate_SRV'', 0, " + date + " , " + user + ", " + txnModeMain + " );\n";

    public static final String updateMain =         insertInto + " VALUES ({0}4,''{1}'', " + SRV + ", ''UEUPD'',  ''BT_EXT_{2}Update_SRV'', 0, " + date + " , " + user + ", " + txnModeMain + " );\n";

    public static final String advicePrintMain =    insertInto + " VALUES ({0}5,''{1}'', " + SRV + ", ''UERCPT'', ''BT_EXT_{2}AdvicePrint_SRV'', 0, " + date + " , " + user + ", " + txnModeMain + " );\n";

    public static final String validateReversal =   insertInto + " VALUES ({0}6,''{1}'', " + SRV + ", ''UEVALD'', ''BT_EXT_Rev{2}Validate_SRV'', 0, " + date + " , " + user + ", " + txnModeReversal + " );\n";

    public static final String updateReversal =     insertInto + " VALUES ({0}7,''{1}'', " + SRV + ", ''UEUPD'',  ''BT_EXT_Rev{2}Update_SRV'', 0, " + date + " , " + user + ", " + txnModeReversal + " );\n";

    public static final String template = preInputMain + inputMain + validateMain + updateMain + advicePrintMain + validateReversal + updateReversal

    ;

}