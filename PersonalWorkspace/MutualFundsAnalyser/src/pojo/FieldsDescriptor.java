package pojo;
public class FieldsDescriptor {

    public String schemeCode;

   public String ISIN_Div_Payout;

    String ISIN_Div_Reinvestment;

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getISIN_Div_Payout() {
        return ISIN_Div_Payout;
    }

    public void setISIN_Div_Payout(String iSIN_Div_Payout) {
        ISIN_Div_Payout = iSIN_Div_Payout;
    }

    public String getISIN_Div_Reinvestment() {
        return ISIN_Div_Reinvestment;
    }

    public void setISIN_Div_Reinvestment(String iSIN_Div_Reinvestment) {
        ISIN_Div_Reinvestment = iSIN_Div_Reinvestment;
    }

    public String getScheme_Name() {
        return Scheme_Name;
    }

    public void setScheme_Name(String scheme_Name) {
        Scheme_Name = scheme_Name;
    }

    public String getNetAssetValue() {
        return NetAssetValue;
    }

    public void setNetAssetValue(String netAssetValue) {
        NetAssetValue = netAssetValue;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    String Scheme_Name;

    String NetAssetValue;

    String Date;

}
