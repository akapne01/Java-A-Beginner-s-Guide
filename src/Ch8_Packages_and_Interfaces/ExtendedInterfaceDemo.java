package Ch8_Packages_and_Interfaces;

/*
 * p. 297 Demonstrates that interfaces can be extended
 */

interface A {
    void method1();

    void method2();
}

// B now includes methods 1 and 2 from the A and adding its own method 3
interface B extends A {
    void method3();
}

class C implements B {
    public void method1() {
        System.out.println("Implementing method 1.");
    }
    public void method2() {
        System.out.println("Implementing method 2.");
    }
    public void method3() {
        System.out.println("Implementing method 3.");
    }
}

// This class must implement all the methods form A and B
public class ExtendedInterfaceDemo {
    public static void main(String[] args) {
        C c = new C();

        c.method1();
        c.method2();
        c.method3();
    }

}
