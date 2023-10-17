package javaweektwo;

import java.util.Scanner;
/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input");
        int input= sc.nextInt();
        int result1= input*1;
        System.out.println(input+" x 1 = "+ result1);
        int result2= input*2;
        System.out.println(input+" x 2 = "+result2);
        int result3= input*3;
        System.out.println(input+" x 3 = "+result3);
        int result4= input*4;
        System.out.println(input+" x 4 = "+result4);
        int result5= input*5;
        System.out.println(input+" x 5 = "+result5);
        int result6= input*6;
        System.out.println(input+" x 6 = "+result6);
        int result7= input*7;
        System.out.println(input+" x 7 = "+result7);
        int result8= input*8;
        System.out.println(input+" x 8 = "+result8);
        int result9= input*9;
        System.out.println(input+" x 9 = "+result9);
        int result10= input*10;
        System.out.println(input+" x 10 = "+result10);
        sc.close();
    }
}
