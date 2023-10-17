package javaweektwo;

import java.util.Scanner;
/*
Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */
public class TemperatureProgramme {

    public void temp(float f){
        float convert= (f - 32) * 5/9f;
        System.out.println(convert+ " degree Celsius");
    }
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.println("Enter value in degree Fahrenheit");
        float f= t.nextFloat();
        TemperatureProgramme t2= new TemperatureProgramme();
        t2.temp(f);
        t.close();
    }
}
