package javaweektwo;

import java.util.Scanner;

/* Write a program for a calculator with addition, subtraction, multiplication
   and division methods all with parameters and use string concatenation methods.
   (Note: Two static and Two instance methods.)
 */
public class Programme5 {

    public void addition(int a, int b){
        int add= a+b;
        System.out.println("addition of a and b is: " +add);
    }
    public void subtraction(int a, int b){
        int sub= b-a;
        System.out.println("substration of a and b is: "+ sub);
    }
    public static void multiplication(int a, int b){
        int multi= a*b;
        System.out.println("multiplication of a and b is: "+multi);
    }
    public static void division(int a, int b){
        int div= b/a;
        System.out.println("disivion of a and b is: "+div);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value");
        int a= sc.nextInt();
        System.out.println("Enter second value");
        int b= sc.nextInt();
        Programme5 t= new Programme5();
        t.addition(a,b);
        t.subtraction(a,b);
        multiplication(a,b);
        division(a, b);
        sc.close();
    }
}
