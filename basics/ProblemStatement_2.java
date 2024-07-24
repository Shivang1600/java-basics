// Write a Java program that takes a number as input and prints the first 10 multiples of that number using a for loop.

import java.util.Scanner;

public class ProblemStatement_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("First 10 multiples of "+ num +" are: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(num*i);
        }
        scan.close();
    }
}
