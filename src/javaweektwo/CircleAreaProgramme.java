package javaweektwo;
/* Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class CircleAreaProgramme {
    public void circleArea(int r){
        double ans= 3.14*r*r;
        System.out.println("Area of circle is: "+ ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value for radius");
        int r= sc.nextInt();
        CircleAreaProgramme t= new CircleAreaProgramme();
        t.circleArea(r);
        sc.close();
    }
}
