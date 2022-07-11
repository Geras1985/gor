package com.gor.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.gor.core.util.CreateDirAndFile.createDirAndFile;

public class WriteToTxt {
    public static void writeToTxt(String pathName) throws IOException {
        String dirAndFile = createDirAndFile();
        String s = ReadPDF.readPdf(pathName);

        //StringBuffer to store the contents
        StringBuffer buffer = new StringBuffer();
        buffer.append(s);
        //Appending each line to the buffer

        FileWriter writer = new FileWriter(dirAndFile);
        //Writing content to the destination
        writer.write(String.valueOf(buffer));
        writer.flush();
        System.out.println(buffer);
        System.out.println("File copied successfully.......");
    }
}
