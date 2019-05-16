/*
 * p. 211
 * Demonstrate static variables and methods
 * Static variables are essentially like global variables
 * Static variables and static methods does not require any object to
 * be created before they can be used.
 */
package Ch6_Methods_Classes_Closer_Look;

class SDemo {
    int x; // a normal instance variable
    static int y; // a static variable

    // Return the sum of the instance variable x
    // and static variable y
    int sum() {
        return x + y;
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        SDemo ob1 = new SDemo();
        SDemo ob2 = new SDemo();

        // Each object has it's own copy of an instance variable
        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Of course, ob.x and ob2.x are independent.");
        System.out.println("ob.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        // Each object shares one copy of a static variable

        /*
         * Each object in the SDemo class is affected when static variable is changed
         */

        System.out.println("The static variable y is shared.");
        SDemo.y = 19;
        System.out.println("Set SDemo.y to 19.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println("ob1.y: " + ob1.y);
        System.out.println("ob2.y: " + ob2.y);
        System.out.println();

        SDemo.y = 100;
        System.out.println("Set SDemo.y to 100.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println("ob1.y: " + ob1.y);
        System.out.println("ob2.y: " + ob2.y);
        System.out.println();


    }
}
