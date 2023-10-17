package javaweektwo;

/**Java program to add two binary numbers
 * Input Data:   Input first binary number: 10    Input second binary number: 11
 * Expected Output:Sum of two binary numbers: 101
 */

public class AddBinaryNumbers {
    public static void main(String[] args) {
        String binary1 = "10";
        String binary2 = "11";
        String sum= binary1+binary2;
        System.out.println("The sum of " + binary1 + " and " + binary2 + " is: " + sum);
    }
}
