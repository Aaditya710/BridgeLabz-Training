package com.streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
	public static void main(String [] args) {
		try {
			FileInputStream fileIn = new FileInputStream("questionInput.txt");
			FileOutputStream fileOut = new FileOutputStream("questionOutput.txt");
			
			int byteData;
			while((byteData = fileIn.read()) != -1) {
				fileOut.write(byteData);
			}
			
			System.out.println("File copied successfully");
		}
		catch(IOException e) {
			System.out.println("Error in file " + e.getMessage());
		}
	}

}
