import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup {

    public static void main(String[] args) {
        System.out.print("Enter IP Address of Client Machine : ");
        String ipAddress = readLine();
        long startTime = System.currentTimeMillis();
        InetAddress Address = null;
        
        String hostName = "";
        try {
            Address = InetAddress.getByName(ipAddress);
        
            hostName = Address.getHostName().toLowerCase();
            long endTime = System.currentTimeMillis();
            System.out.println("Host Name is "+hostName);
            System.out.println("Time Taken to get Host Name : "+String.valueOf(endTime-startTime)+ " milliseconds");
        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException" + e.getLocalizedMessage());
        }

    }

    public static String readLine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String option = null;
        try {
            option = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read Input!");
        }

        return option;
    }

}
