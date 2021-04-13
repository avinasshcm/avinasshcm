import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

class Connectivity extends TimerTask {

    public static void main(String args[]) {
        
        Connectivity conn = new Connectivity();
        conn.connect();
    }

    public void connect(){


        Properties prop = new Properties();
        String ip = "";
        int port = 0;

        try {
            prop.load(new FileInputStream("Connection.properties"));
            ip = prop.getProperty("HostName");
            port = Integer.parseInt(prop.getProperty("Port"));
        } catch (FileNotFoundException e1) {

            e1.printStackTrace();
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        try {

            TimerTask con = new Connectivity();

            Timer timer = new Timer();
            timer.scheduleAtFixedRate(con, 1, 1000);
            Socket s1 = new Socket(ip, port);
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            if (dis != null) {
                System.out.println("Connected with ip " + ip + " and port " + port);
            } else {
                System.out.println("Connection invalid");
            }

            dis.close();
            s1.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Connection refused: connect " + port);

        }

    
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
}