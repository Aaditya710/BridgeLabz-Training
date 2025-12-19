// Creating TwoDArray class to solve

import java.util.*;
public class TwoDArray{
     public static void main(String [] args){
           Scanner sc = new Scanner(System.in);
          
           // Taking input from user
           System.out.println("Enter number of rows :");
           int rows = sc.nextInt();
           System.out.println("Enter number of columns :");
           int columns = sc.nextInt();

           int [][] matrix = new int[rows][columns];
           System.out.println("Enter matrix elements:");
           for(int i = 0; i < rows; i++){
              for(int j = 0; j < columns; j++){
                 System.out.println("Element [" + i + "][" + j + "] ");
                 matrix[i][j] = sc.nextInt();
              }
           }
           int [] array = new int[rows * columns];

            // Copy 2D array elements to 1D array
           int index = 0;
           for(int i = 0; i< rows;i++){
              for(int j = 0; j < columns; j++){
                 array[index] = matrix[i][j];
                 index++;
              }
           }
           
         // Display 1D array
        System.out.println("\n1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
  }
}