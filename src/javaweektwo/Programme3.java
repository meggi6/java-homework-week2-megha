package javaweektwo;
/**  Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    String a= "megha"; // instance variable
    static double b= 200.2; // static variable

    // instance method
    public void m1(){
        System.out.println(a);
        System.out.println(b);
    }
    //static method
    public static void m2(){
        Programme3 t= new Programme3();
        System.out.println(t.a);
        System.out.println(b);
    }
    //main method
    public static void main(String[] args) {
        Programme3 t= new Programme3();
        t.m1();
        m2();
    }

}
