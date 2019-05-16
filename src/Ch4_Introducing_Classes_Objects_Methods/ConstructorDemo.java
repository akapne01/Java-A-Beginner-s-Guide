package Ch4_Introducing_Classes_Objects_Methods;

class MyClass {
    int x;

    // This is constructor for MyClass
    MyClass() {
        x = 10;
    }

    MyClass(int value) {
        x = value;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);

        MyClass p1 = new MyClass(10);
        MyClass p2 = new MyClass(88);

        System.out.println(p1.x + " " + p2.x);
    }
}
