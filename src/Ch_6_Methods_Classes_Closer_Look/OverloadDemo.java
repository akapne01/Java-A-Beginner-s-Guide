/*
    p. 198
    Method overloading
 */

package Ch_6_Methods_Classes_Closer_Look;

class Overload {
    void ovlDemo() { // 1st version
        System.out.println("No Parameters");
    }

    // Overload ovlDemo for 1 int param
    void ovlDemo(int a) { // 2nd version
        System.out.println("One parameter: " + a);
    }

    // Overload ovlDemo for 2 int param
    int ovlDemo(int a, int b) { // 3rd version
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Overload ovlDemo for 2 double param
    double ovlDemo(double a, double b) { // 4th version
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // call all versions of ovlDemo()
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();
        resD = ob.ovlDemo(1.1, 2.43);
        System.out.println("Result of ob.ovlDemo(1.1, 2.43): " + resD);
    }
}
