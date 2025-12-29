// Creating PhoneRechargeSimulator class to solve
import java.util.*;
public class PhoneRechargeSimulator {
    public static void main(String[] args) {

        //creating scanner class object
        Scanner sc = new Scanner(System.in);
        int balance =0;
        boolean bal =false;
        do{
            System.out.println("Enter operator (Airtel / Jio / BSNL / Vi)");
            String operator = sc.nextLine();
            switch (operator){
                case "Airtel":
                case "BSNL":
                case "Vi":
                case "Jio":
                    System.out.println("Available offers.");
                    System.out.println("₹199 -> 1.5GB/day, 30 days " +
                            " \n₹299 -> Unlimited + OTT " +
                            "\n₹ 350 -> Unlimited, 80 days ");
                    break;
                default:
                    System.out.println("Invalid operator selected ");
            }
            System.out.println("Enter amount : ");
            int rechargeAmount = sc.nextInt();

            if(rechargeAmount ==199) {
                System.out.println("Recharge succesfull.");
                balance  = rechargeAmount;
                System.out.println("₹199 -> 1.5GB/day, 30 days");
            }
            else if (rechargeAmount==299 ){
                System.out.println("Recharge succesfull.");
                balance+=299;
                System.out.println("₹299 -> Unlimited + OTT");
            }
            else if(rechargeAmount==350){
                System.out.println("Recharge succesfull.");
                balance+=350;
                System.out.println(" 350 -> Unlimited, 80 days ");
            }
            System.out.println("Do you want to recharge again? (Y/N)");
            char ask = sc.next().charAt(0);
            sc.nextLine();

             if(ask=='y') bal =true;
             else {
                 bal = false;
                 System.out.println("Balance = "+balance);
             }
        }while(bal);
    }
}