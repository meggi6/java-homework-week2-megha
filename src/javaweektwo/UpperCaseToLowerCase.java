package javaweektwo;

import java.util.Scanner;
/*
Write a program to convert the upper case to lower case
 */

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any word in uppercase");
        String a= sc.next();
        String input= a.toLowerCase();
        System.out.println(input);
        sc.close();
    }
}
