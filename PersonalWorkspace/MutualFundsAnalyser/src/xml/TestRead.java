package xml;

import java.util.List;

public class TestRead {

    public static void main(String args[]) {
        StaXParser read = new StaXParser();
        //List<Item> readConfig = read.readConfig("MFAnalysis.xml");
        
        Global global =  read.readConfig("MFAnalysis.xml");
        System.out.println(global.getAMFIINDIAURL());
        for (Item item : global.getItem()) {
            System.out.println(item);
        }
    }
}