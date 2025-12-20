// Creating CountingHandShake class to count the total number of handshake among students

import java.util.*;
public class CountingHandShake{

     static void HandshakeCalculate(int totalStudents){
          int totalHandshake = (totalStudents * (totalStudents - 1)) / 2;
          System.out.println("Total number of handshakes among all students are :" + totalHandshake);
     }

     public static void main(String[]args){

         // Taking input from user
         Scanner sc = new Scanner(System.in);
         int totalStudents = sc.nextInt();

         // Calling the method
         HandshakeCalculate(totalStudents);
     }
}