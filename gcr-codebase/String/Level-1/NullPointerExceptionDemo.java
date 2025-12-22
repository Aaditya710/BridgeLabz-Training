import java.util.*;
public class NullPointerExceptionDemo{

     // generating the exception
     public static void GenerateException(){
          String str = null;
          System.out.println(str.length());
     }

     // Handling the exception
     static void HandleException(){
          String str = null;
          try{
             System.out.println(str.length()); 
          } catch(NullPointerException e){
             System.out.println("Text is null : Null Pointer Exception");
          }
     }
     
     // Main method
     public static void main(String [] args){
          // GenerateException();
          HandleException();
     }
}