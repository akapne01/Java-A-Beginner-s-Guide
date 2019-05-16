/*
 * p. 230
 * A simple class hierarchy
 * Class for 2 dimensional objects
 */


package Ch7_Inheritance;

class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    // width and height is accessed from the superclass
    double area() {
        return width * height / 2;
    }

    // style is from Triangle class
    void showSyle() {
        System.out.println("Triangle is " + style);
    }
}


public class ShapesDemo {
    public static void main(String[] args) {

        /*
         * When new object is created, default constructors are called from both classes
         */
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showSyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showSyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());



    }

}
