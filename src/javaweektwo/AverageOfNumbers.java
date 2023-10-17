package javaweektwo;
import java.util.Scanner;
/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int fst = sc.nextInt();
        System.out.println("Enter second number");
        int snd= sc.nextInt();
        System.out.println("Enter first number");
        int thd= sc.nextInt();
        int avr= (fst+snd+thd)/3;
        System.out.println("Average of "+ fst+ snd+ thd+"is: "+avr);
        sc.close();
    }
}
