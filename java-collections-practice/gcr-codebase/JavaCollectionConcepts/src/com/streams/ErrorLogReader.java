package com.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ErrorLogReader {

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // 500MB+ file

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}

