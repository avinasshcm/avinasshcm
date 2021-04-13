import java.net.*;
import java.io.*;

public class PortTest {
   public static void main(String[] args) {
      Socket Skt;
      String host = "blr2devlp0338";
      int port = 2009;
      //System.out.println(serverListening(host, port));
      
      log(isSocketAliveUitlitybyCrunchify(host, port));
   }
   
   public static boolean serverListening(String host, int port)
   {
       Socket s = null;
       try
       {
           s = new Socket(host, port);
           return true;
       }
       catch (Exception e)
       {
           return false;
       }
       finally
       {
           if(s != null)
               try {s.close();}
               catch(Exception e){}
       }
   }
   
   
   public static boolean isSocketAliveUitlitybyCrunchify(String hostName, int port) {
       boolean isAlive = false;

       // Creates a socket address from a hostname and a port number
       SocketAddress socketAddress = new InetSocketAddress(hostName, port);
       Socket socket = new Socket();

       // Timeout required - it's in milliseconds
       int timeout = 2000;

       log("hostName: " + hostName + ", port: " + port);
       try {
           socket.connect(socketAddress, timeout);
           socket.close();
           isAlive = true;

       } catch (SocketTimeoutException exception) {
           System.out.println("SocketTimeoutException " + hostName + ":" + port + ". " + exception.getMessage());
       } catch (IOException exception) {
           System.out.println(
                   "IOException - Unable to connect to " + hostName + ":" + port + ". " + exception.getMessage());
       }
       return isAlive;
   }

   // Simple log utility
   private static void log(String string) {
       System.out.println(string);
   }

   // Simple log utility returns boolean result
   private static void log(boolean isAlive) {
       System.out.println("isAlive result: " + isAlive + "\n");
   }

}