// Creating BusAttendanceSystem class for solving
import java.util.*;
public class BusAttendanceSystem{
     public static void main(String [] args){

         Scanner sc = new Scanner(System.in);
         String [] names = {"Aaditya", "Aviral", "Ayush", "Vishal", "Kartik", "Bhuvan", "Rakesh", "Shashi", "Rohan", "Anuj"};
         int [] attendance = new int[10];
         int totalPresent = 0;
         int totalAbsent = 0;

         for(int i = 0; i< attendance.length;i++){
            
            System.out.println(names[i] + " Enter 0 and 1 for attendance");
            attendance[i] = sc.nextInt();
         
            if(attendance[i] == 1){
              totalPresent++;
            }
            else if(attendance[i] == 0){
              totalAbsent++;
            }
         }
         System.out.println("Total number of present students are : " + totalPresent);
         System.out.println("Total number of absent students are : " + totalAbsent);

     }
}