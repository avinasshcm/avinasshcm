package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;

import com.twmacinta.util.MD5;

public class DB {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String rgs[]) throws Exception {

        // getCodeResource();
        getResource();

    }

    private static void getCodeResource() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        Blob blob = null;
        /*
         * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection connection =
         * DriverManager.getConnection("jdbc:oracle:thin:@blrvssyoma1:1521:YOMA464", "bfdbusr", "misys123");
         */
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        Connection connection = DriverManager.getConnection("jdbc:db2://BLR2UBLP070:50000/FBE426", "bfdbusr", "misys123$");
        // Connection connection = DriverManager.getConnection("jdbc:db2://BLRCSWESNL30019:50000/FBE426", "bfdbusr", "misys123$");

        System.out.println("From DB2, connection obtained ");
        long startTime = Calendar.getInstance().getTimeInMillis();

        PreparedStatement ps =
            connection
            // .prepareStatement("Select BFARTEFACTID,BFCLASSDATA,BFGROUPREFERENCE from bankfusion.BFTB_CODERESOURCE where date(BFDATEPUBLISHED) > '2016-10-06' order by BFARTEFACTID,BFAPPLICATIONVERSION");
                .prepareStatement("Select BFARTEFACTID,BFCLASSDATA,BFGROUPREFERENCE,BFAPPLICATIONVERSION from bankfusion.BFTB_CODERESOURCE order by BFARTEFACTID,BFAPPLICATIONVERSION");
        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        System.out.println("Resultset Column Count :" + columnsNumber);

        File f = new File("Output.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);
        System.out.println("File writing started...... Please wait for it to complete");
        int counter = 0;
        while (rs.next()) {

            blob = rs.getBlob(2);

            String filePath = "D:/BLOB/Text.txt";
            InputStream inputStream = blob.getBinaryStream();
            OutputStream outputStream = new FileOutputStream(filePath);

            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            String hash = MD5.asHex(MD5.getHash(new File(filePath)));
            // System.out.println(rs.getString(1)+ " ------> "+ rs.getString(3)+" ------> "+ hash);
            pw.write(rs.getString(3) + "|" + rs.getString(1) + "|" + rs.getString(4) + "|" + hash);
            pw.write("\n");
            counter++;
            // System.out.println("");
        }

        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Time Taken for processing " + counter + " rows in milliseconds : " + (endTime - startTime));
        connection.close();
        pw.flush();
        fos.close();
        pw.close();
        System.out.println("File writing completed successfully....");
    }

    private static void getResource() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        Blob blob = null;
        /*
         * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection connection =
         * DriverManager.getConnection("jdbc:oracle:thin:@blrvssyoma1:1521:YOMA464", "bfdbusr", "misys123");
         */
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        // Connection connection = DriverManager.getConnection("jdbc:db2://BLR2UBLP070:50000/FBE426", "bfdbusr", "misys123$");
        Connection connection = DriverManager.getConnection("jdbc:db2://BLRCSWESNL30019:50000/FBE4261", "bfdbusr", "misys123$");

        System.out.println("From DB2, connection obtained ");
        long startTime = Calendar.getInstance().getTimeInMillis();

        PreparedStatement ps =
            connection
            // .prepareStatement("Select BFARTEFACTID,BFCLASSDATA,BFGROUPREFERENCE from bankfusion.BFTB_CODERESOURCE where date(BFDATEPUBLISHED) > '2016-10-06' order by BFARTEFACTID,BFAPPLICATIONVERSION");
                .prepareStatement("select BFARTEFACTID,BFRESOURCEDATA,BFAPPLICATIONVERSION from BANKFUSION.BFTB_RESOURCE order by BFARTEFACTID,BFAPPLICATIONVERSION");
        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        System.out.println("Resultset Column Count :" + columnsNumber);

        File f = new File("Resource_Output.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);
        System.out.println("File writing started...... Please wait for it to complete");
        int counter = 0;
        while (rs.next()) {

            blob = rs.getBlob(2);

            String filePath = "D:/BLOB/Resource_Text.txt";
            InputStream inputStream = blob.getBinaryStream();
            OutputStream outputStream = new FileOutputStream(filePath);

            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            String hash = MD5.asHex(MD5.getHash(new File(filePath)));
            // System.out.println(rs.getString(1)+ " ------> "+ rs.getString(3)+" ------> "+ hash);
            pw.write(rs.getString(1) + "|" + rs.getString(3) + "|" + hash);
            pw.write("\n");
            counter++;
            // System.out.println("");
        }

        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Time Taken for processing " + counter + " rows in milliseconds : " + (endTime - startTime));
        connection.close();
        pw.flush();
        fos.close();
        pw.close();
        System.out.println("File writing completed successfully....");
    }
}
