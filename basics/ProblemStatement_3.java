// Write a Java program that takes numbers as input and calculates the sum of positive numbers. 
// The program should terminate if a negative number is entered using a do-while loop and break statement.

import java.util.Scanner;

public class ProblemStatement_3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean isPositive = true;
        System.out.println("Enter a number to start: ");
        int number = scan.nextInt();
        int sum = number;
        do { 
            System.out.println("Enter a number to add: ");
            number = scan.nextInt();
            if(number < 0){
                isPositive = false;
                System.out.println("The final sum positive numbers is: "+ sum);
                break;
            }
            else{
                sum += number;
                System.out.println("The sum positive numbers is: "+ sum);           
            }
        } while (isPositive);
        scan.close();
    }
}