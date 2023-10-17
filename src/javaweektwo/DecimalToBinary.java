package javaweektwo;
/**
 *  Write a Java program to convert a decimal number to binary number.
 *  Input Data: Input a Decimal Number : 5
 *  Expected Output: Binary number is: 101
 */

public class DecimalToBinary {
    public static void main(String[] args) {
        int deci= 5;
        String Binary= Integer.toBinaryString(deci); //decimal to binary
        System.out.println("Conversion of decimal to binary of number 5 is: "+ Binary);
    }
}
