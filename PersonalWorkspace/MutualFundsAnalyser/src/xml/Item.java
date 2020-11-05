package xml;

public class Item {

    private String name;

    private String excelName;

    private String historyPropFileName;

    public String getHistoryPropFileName() {
        return historyPropFileName;
    }

    public void setHistoryPropFileName(String historyPropFileName) {
        this.historyPropFileName = historyPropFileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExcelName() {
        return excelName;
    }

    public void setExcelName(String excelName) {
        this.excelName = excelName;
    }

    @Override
    public String toString() {
        return "Item [ name=" + name + ", excelName=" + excelName + ", histpryPropFileName=" + historyPropFileName + "]";
    }
}