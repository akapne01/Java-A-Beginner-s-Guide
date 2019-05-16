/*
    p. 200
    Automatic type conversions can affect overloaded method
    resolution

    Output:
        Inside f(int): 10
        Inside f(double): 10.1
        Inside f(byte): 99
        Inside f(int): 10
        Inside f(double): 11.5
 */

package Ch_6_Methods_Classes_Closer_Look;

class Overload2 {
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }

    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }
}

public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // calls f(int)
        ob.f(d); // calls d(double)

        ob.f(b); // f(byte)
        ob.f(s); // f(int) - type conversion
        ob.f(f); // f(double) - type conversion
//        boolean test = true;
//        ob.f(test);
        /* Does the method with parameter types match?
            YES => use it
            NO => Can any of the types be auto cast?
                YES => do it and use this method
                NO => return error
         */
    }
}
