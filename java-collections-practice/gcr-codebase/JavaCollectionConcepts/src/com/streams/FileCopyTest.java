package com.streams;

import java.io.*;

public class FileCopyTest {

    static final int SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String source = "largefile.dat";

        copyUnbuffered(source, "unbuffered_copy.dat");
        copyBuffered(source, "buffered_copy.dat");
    }

    // Unbuffered Streams
    static void copyUnbuffered(String src, String dest) {
        long start = System.nanoTime();

        try (FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(dest)) {

            byte[] buffer = new byte[SIZE];
            int bytes;

            while ((bytes = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytes);
            }

        } catch (IOException e) {
            System.out.println("Unbuffered copy failed");
        }

        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start) / 1_000_000 + " ms");
    }

    // Buffered Streams
    static void copyBuffered(String src, String dest) {
        long start = System.nanoTime();

        try (BufferedInputStream in =
                     new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream out =
                     new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[SIZE];
            int bytes;

            while ((bytes = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytes);
            }

        } catch (IOException e) {
            System.out.println("Buffered copy failed");
        }

        long end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start) / 1_000_000 + " ms");
    }
}
