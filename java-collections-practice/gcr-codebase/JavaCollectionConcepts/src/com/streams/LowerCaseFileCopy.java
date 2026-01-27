package com.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LowerCaseFileCopy {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt", StandardCharsets.UTF_8));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("output.txt", StandardCharsets.UTF_8))
        ) {
            int ch;

            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File copied with lowercase conversion.");

        } catch (IOException e) {
            System.out.println("Error while processing the file.");
        }
    }
}

