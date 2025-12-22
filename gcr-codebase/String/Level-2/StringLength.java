import java.util.*;
public class StringLength{

     // Method to find string 
     public static int findLength(String str){
          int count = 0;
          try{
             while(true){
                  str.charAt(count);
                  count++;
             }
          }catch(StringIndexOutOfBoundsException e){

          }
           return count;
     }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a string:");
        String str = sc.next();
        int userLength = findLength(str);
        int builtInLength = str.length();

        // Displaying the output
        System.out.println("Length using user-defined method : " + userLength);
        System.out.println("Length using built-in length()   : " + builtInLength);
    }
}
  