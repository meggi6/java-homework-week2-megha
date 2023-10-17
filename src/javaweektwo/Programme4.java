package javaweektwo;
/** Declare two instance and two static variables.
 * Declare one instance method.
 * Declare one static method.
 * Call all four instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    float a= 2.1f; // instance variable
    double b= 2.22; // instance variable
    static boolean c= true; //static variable
    static char d= 'm'; //static variable

    // instance method
    public void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    //static method
    public static void m2(){
        Programme4 t= new Programme4();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args){
        Programme4 obj= new Programme4(); // object creation for calling instance method
        obj.m1();
        m2(); // direct calling
    }

}
