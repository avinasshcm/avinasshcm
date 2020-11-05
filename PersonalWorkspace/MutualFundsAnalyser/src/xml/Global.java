package xml;

import java.util.List;

public class Global {

    private String AMFIINDIAURL;

    private String FILEPATH;

    private String HistoricData;

    public String getHistoricData() {
        return HistoricData;
    }

    public void setHistoricData(String historicData) {
        HistoricData = historicData;
    }

    public String getFILEPATH() {
        return FILEPATH;
    }

    public void setFILEPATH(String fILEPATH) {
        FILEPATH = fILEPATH;
    }

    public String getAMFIINDIAURL() {
        return AMFIINDIAURL;
    }

    public void setAMFIINDIAURL(String aMFIINDIAURL) {
        AMFIINDIAURL = aMFIINDIAURL;
    }

    private List<Item> item;

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
