// Write a Java program that takes three numbers as input and determines the largest of the three using if-else statements.

import java.util.Scanner;

public class ProblemStatement_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        System.out.println("Enter three numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("Number 1 is largest.");
            }
            else{
                System.out.println("Number 3 is largest.");
            }
        }
        else if (num2 > num3){
            System.out.println("Number 2 is largest.");
        }
        else{
            System.out.println("Number 3 is largest.");
        }
        scan.close();
    }
}