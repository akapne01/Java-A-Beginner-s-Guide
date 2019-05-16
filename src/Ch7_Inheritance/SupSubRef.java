package Ch7_Inheritance;

/*
 * p. 250
 * A superclass reference can refer to subclass object
 */

class X {
    int a;

    X(int i) {
        a = i;
    }
}

class Y extends X {
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}

public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);
        x2 = x; // ok, because both are the same type
        System.out.println("x2.a: " + x2.a);

        x2 = y; // Still OK, because y is derived from x (lose b as it auto converts the type and loses everything that is unique for a child class)
        System.out.println("x2.a: " + x2.a);

        // x references only know about x numbers
        x2.a = 19;
        // x2.b = 27; // Error, X doesn't have the b number


    }
}
