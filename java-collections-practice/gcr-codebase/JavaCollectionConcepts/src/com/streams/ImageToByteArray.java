package com.streams;

import java.io.*;

public class ImageToByteArray {

    public static void main(String[] args) {

        String sourceImage = "original.jpg";
        String newImage = "copy.jpg";

        try {
            // Read image into byte array
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(newImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            // Verify files are identical
            if (imageBytes.length == new File(newImage).length()) {
                System.out.println("Image copied successfully. Files are identical.");
            } else {
                System.out.println("Files are NOT identical.");
            }

        } catch (IOException e) {
            System.out.println("Error while processing image file.");
        }
    }
}

