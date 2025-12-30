// Creating TemperaturLogger class to solve
import java.util.*;
public class TemperatureLogger{

     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         double [] temperature = new double[7];
   
        // Taking input from user
        System.out.println("Enter days temperature : ");
        for(int i = 0; i < temperature.length; i++){
           temperature[i] = sc.nextInt();
        }

        // Calculating max temperature and average
        double sum = 0;
        double maxTemperature = temperature[0];
        for(int i = 0; i < temperature.length; i++){
           if(temperature[i] > maxTemperature){
              maxTemperature =  temperature[i];
           }
           sum += temperature[i];
        }
       System.out.println("Average Temperature : " + sum / 7);
       System.out.println("Maximum temperature : " + maxTemperature);
   }

}