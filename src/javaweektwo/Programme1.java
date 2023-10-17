package javaweektwo;
/**  Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    int a= 10; // instance variable
    int b= 20; // instance variable

    //instance method
    public void m1(){
        System.out.println(a);
        System.out.println(b);
    }
    //main method
    public static void main(String[]args ){
        Programme1 obj= new Programme1(); // object creation
        obj.m1();
    }
}
