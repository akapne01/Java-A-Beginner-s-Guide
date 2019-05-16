package Ch7_Inheritance;

/*
 * p. 256
 * Methods with different signatures are overloaded and not overridden
 */

class A3 {
    int i, j;

    A3(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("A3: i and j: " + i + " " + j);
    }
}

class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload show()
    void show(String msg) {
        System.out.println("B3: " + msg + k);
    }
}

public class Overload {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2, 3);
        // displays show() from A3
        subOb.show();
        // displays show from B3
        subOb.show("This is k: ");
    }
}
