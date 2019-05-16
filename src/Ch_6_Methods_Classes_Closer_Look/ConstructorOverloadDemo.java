/*
    p. 203
    Constructors can be overloaded

    Output:
        Inside ConstructorOverload().
        Inside ConstructorOverload(int).
        Inside ConstructorOverload(double).
        Inside ConstructorOverload(int, int).
        t1.x: 0
        t2.x: 88
        t3.x: 17
        t4.x: 8
 */

package Ch_6_Methods_Classes_Closer_Look;

class ConstructorOverload {
    int x;

    ConstructorOverload() {
        System.out.println("Inside ConstructorOverload().");
        x = 0;
    }

    ConstructorOverload(int i) {
        System.out.println("Inside ConstructorOverload(int).");
        x = i;
    }

    ConstructorOverload(double d) {
        System.out.println("Inside ConstructorOverload(double).");
        x = (int) d;
    }

    ConstructorOverload(int i, int j) {
        System.out.println("Inside ConstructorOverload(int, int).");
        x = i * j;
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args) {

        ConstructorOverload t1 = new ConstructorOverload();
        ConstructorOverload t2 = new ConstructorOverload(88);
        ConstructorOverload t3 = new ConstructorOverload(17.23);
        ConstructorOverload t4 = new ConstructorOverload(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
