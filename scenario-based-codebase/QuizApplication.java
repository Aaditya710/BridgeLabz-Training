// Creating QuizApplication class to solve
import java.util.*;
import java.util.Scanner;

public class QuizApplication {

/*          17. Online Quiz Application 🧠
            Ask 5 questions (MCQs) from a user.
            ● Use arrays and for-loop.
            ● Record score.
            ● Switch for answer checking. Apply clear indentation and structured layout.*/
    public static void main(String[] args) {

        // Creating scanner class object
        Scanner sc = new Scanner(System.in);

        // String array
        String question[] = {"A. Which of the following is not the java feature ?"+
                             " \n1. Object-oriented \n2. Platform independent \n3. Use of pointers" +
                              "\n4. Secure" ,"B. Which keyword is used to inherit a class in java ?" +
                             "\n1. Implement \n2. Inherit \n3.Extend \n4. Super", "C. What is the size of INT in java" +
                             "\n1. 2 byte \n2. 4 byte \n3. 8 byte \n4. Depends on OS", "D. Which of the following is the parent class of all java classes ?" +
                             "\n1. String \n2. Object \n3. Class \n4. Main" ,"E. Which method is the entry point of java program" +
                             "\n1. start() \n2. run() \n3. init() \n4. main()"};

        // Answer array
        int arr[] = {3, 3, 2, 2, 4};
        // Score
        int score =0;
        for(int i=0;i<5;i++){
            System.out.println(question[i]);

            // Taking user input
            System.out.println("Enter choice : ");
            int ans = sc.nextInt();

            switch (ans){
                case 1 ->{
                    if(arr[i]==1){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }
                case 2 ->{
                    if(arr[i]==2){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }
                case 3 ->{
                    if(arr[i]==3){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }
                case 4 ->{
                    if(arr[i]==4){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }

            }

        }
        System.out.println("Scored marks : "+score);
    }
}