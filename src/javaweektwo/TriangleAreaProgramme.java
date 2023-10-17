package javaweektwo;

import java.util.Scanner;

/*
Write a program to calculate the area of a triangle.
 */
public class TriangleAreaProgramme {

    public static void areaTri(double b,double h ){
        double area= (b*h)/2;
        System.out.println("Area of Triangle is: "+area);
    }
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.println("Enter breadth");
        double b= t.nextDouble();
        System.out.println("Enter height");
        double h= t.nextDouble();
        areaTri(b, h);
        t.close();
    }
}
