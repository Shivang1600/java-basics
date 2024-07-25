// Write a Java program that calculates the factorial of a number using a recursive method.

import java.util.Scanner;

public class ProblemStatement_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number = scan.nextInt();
        
        System.out.println("Factorial of "+ number + " is: " + factorial(number));
        scan.close();
    }    
    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        else{
            return number * factorial(number - 1);
        }
    }
}
