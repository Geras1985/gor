package com.gor.core;

import java.io.IOException;

import static com.gor.core.util.WriteToTxt.writeToTxt;

public class Main {
    static String pathName = "D:\\DAVID KURGHINYAN\\GOR\\Davo\\doc1.pdf";
    public static void main(String[] args) throws IOException {
        writeToTxt(pathName);

    }
}
