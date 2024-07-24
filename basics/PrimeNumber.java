// Write a Java program that takes a number as input and checks if it is a prime number using a while loop and break statement.
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        boolean isPrime = true;

        if(num <=1){
            isPrime = false;
        }
        else{
            int i = 2;
            while(i <= num / 2){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
        }
    }

        if(isPrime)
        {
            System.out.println("The number "+ num +" is a prime number.");
        }
        else{
            System.out.println("The number "+ num +" is not a prime number.");
        }   
        scan.close();
    }
}
