package com.avi;

import java.io.File;
import java.io.FileFilter;

public class FolderScanner {

    public static void main(String[] args) {
        File[] directories = listf("E:/Movies/");
    }

    public static File[] listf(String directoryName) {

        // .............list file
        File directory = new File(directoryName);

        // get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                listf(file.getAbsolutePath());
            }
        }
        System.out.println(fList);
        return fList;
    }

}
