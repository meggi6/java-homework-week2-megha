package javaweektwo;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:   Width = 5.5 Height = 8.5
 * Expected Output:  Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class RectanglePerimeter {
    public static void main(String[] args) {
        float w= 5.6f;
        float h= 8.5f;
        float perimeter= 2*(w+h);
        float area= w*h;
        System.out.println("Perimeter of rectangle is: "+ perimeter+" and area is: "+area);
    }
}
