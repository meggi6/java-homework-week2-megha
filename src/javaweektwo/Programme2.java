package javaweektwo;
/**  Declare two static variables
 * Declare one static method
 *  Call both static variables into the static method inside the print statement.
 *   Declare the Main method.
 *   Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    static int a= 10; // static variable
    static float b= 20.5f; // static variable

    // static method
    public static void m1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        m1(); // calling static method into main method
    }
}
