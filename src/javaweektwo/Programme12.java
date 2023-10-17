package javaweektwo;

/**
 * Write a Java program to compute the specified expressions and print the output.
 * Test Data:  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output :  2.138888888888889
 */
public class Programme12 {
    public static void main(String[] args) {
        double a= 25.5f;
        double b= 3.5f;
        double c= 40.5f;
        double d= 4.5f;
        double result= ((a*b - b*b)/ (c-d));
        System.out.println("Result is: "+ result);
    }
}
