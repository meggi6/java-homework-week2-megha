package javaweektwo;
//Write a Java program to swap two variables
//
public class SwapVariables {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        System.out.println("Before swapping, a= "+a+" and b= "+b);
        int swp= a;
        a= b;
        b= swp;
        System.out.println("After swapping, a= "+a+" and b= "+b);
    }
}
