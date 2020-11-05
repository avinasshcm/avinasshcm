package file.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import pojo.JiraSVNMap;

public class GetFileNamesFromURL {

    private static final String FilePath = "C:/Users/amanjuna/Desktop/Jira-details/Prod_Comparison/";

    private static final String InFileName = "4261_REL_UB.txt";

    private static final String OutFileName = "4261_REL_UB"+"_Out.txt";

    public static void main(String[] args) {
        BufferedReader reader;

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FilePath + OutFileName));

            reader = new BufferedReader(new FileReader(FilePath + InFileName));
            String line = reader.readLine();

            // for (String line : allLines) {
            while (line != null) {
                writer.write(line.substring(line.lastIndexOf("/") + 1)+"\n");

                line = reader.readLine();
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Completed");
    }

}