package javaweektwo;
/**
 *  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
 *  Test Data: Input first number: 125 Input second number: 24
 *  Expected Output : 125 + 24 = 149, 125 - 24 = 101, 125 x 24 = 3000, 125 / 24 = 5, 125 mod 24 = 5
 */

public class Programme18 {
    public static void main(String[] args) {
        int num1= 125;
        int num2= 24;
        int add= num2+num1;
        int multi= num1*num2;
        int sub= num1-num2;
        int div= num1/num2;
        int remain= num1 % num2;
        System.out.println("addition of 125 and 24 is: "+add);
        System.out.println("subtraction of 125 and 24 is: "+sub);
        System.out.println("multiplication of 125 and 24 is: "+multi);
        System.out.println("division of 125 and 24 is: "+div);
        System.out.println("remainder of 125 and 24 is: "+remain);
    }
}
