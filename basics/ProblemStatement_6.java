// Write a Java program that finds the maximum of three numbers using a method with parameters and a return type.

import java.util.Scanner;

public class ProblemStatement_6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        System.out.println("The maximum of three numbers is: "+ MaximumNumber(num1,num2,num3));

        scan.close();
    }
    public static int MaximumNumber(int num1,int num2,int num3){
        if(num1 > num2){
            if(num1 > num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        else if (num2 > num3){
            return num2;
        }
        else{
            return num3;
        }
    }
}