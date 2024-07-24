// Write a Java program that takes a string as input and counts the number of vowels 
// in the string using a for loop and continue statement.

import java.util.Scanner;

public class ProblemStatement_4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str_ori = scan.nextLine();
        String str = str_ori.toLowerCase();
        int n = str.length();
        int vowels = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                vowels++;
            }
            else{
                continue;
            }
        }
        System.out.println("Number of vowels in '"+ str_ori +"' are: "+vowels);
        scan.close();
    }
}
