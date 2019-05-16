/*
 * p. 242
 * Using super to Access Superclass members
 * Using super to overcome name hiding
 */

package Ch7_Inheritance;

class A {
    int i;
}

class B extends A {
    int i; // this i hides the i in the class A

    B(int a, int b) {
        super.i = a; // in A
        i = b; // in B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}


public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
