package com.gor.core.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;

public class CreateDirAndFile {


    public static String createDirAndFile() throws IOException {

        String basePackage = "D:\\DAVID KURGHINYAN\\GOR\\Davo\\" + LocalDate.now();
        String fileName = "\\50.txt";
        File file1 = new File(basePackage + fileName);
        File file = new File(basePackage);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory was created!");
                if (!file1.exists()){
                    if (file1.createNewFile()) {
                        System.out.println("File was created successfully");
                    }
                }

            } else {
                System.out.println("Failed to create directory!");
            }
        } else {

            Files.deleteIfExists(file1.toPath());
            if (file1.createNewFile()) {
                System.out.println("Old file was deleted successfully and created a new file");
            }
        }
        return file1.getAbsolutePath();
    }
}
