import java.util.*;
public class CompareStrings{

     // Creating CheckStrings methods to compare strings
     public static Boolean CheckStrings(String str1, String str2){
          if(str1.length() != str2.length()){
             return false; 
          }
          
          for(int i = 0; i < str1.length(); i++){
             if(str1.charAt(i) != str2.charAt(i)){
                return false;
             }
          }
      
          return true;
     }

     // Creating StringBuiltinCheck method to check the result
     public static Boolean StringBuiltinCheck(String str1, String str2){
          return str1.equals(str2);
     }
     
     // Main method
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
     
          // Taking input from user
          System.out.println("Enter both strings: ");
          String str1 = sc.nextLine();
          String str2 = sc.nextLine();
          System.out.println(CheckStrings(str1, str2));
          System.out.println(StringBuiltinCheck(str1, str2));
     }
}