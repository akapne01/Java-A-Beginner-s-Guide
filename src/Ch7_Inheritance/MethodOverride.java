package Ch7_Inheritance;

/*
 * p 254
 * If method in subclass has the same method signature and return type as in superclass, it is overriding
 * the method and uses subclass method, hides the superclass method
 */

class A2 {
    int i, j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("Class A2: i and j:" + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        int k;
    }

    // display k - this method overrides show() in A2
    void show() {
        // super.show() allows to access method from the superclass
        super.show();
        System.out.println("B2: k is " + k);
    }
}



public class MethodOverride {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2, 3);

        // uses method from B2 class to show.
        subOb.show();
    }
}
