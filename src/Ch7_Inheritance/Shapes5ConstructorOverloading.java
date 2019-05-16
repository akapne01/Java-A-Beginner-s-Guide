/*
 * p. 239
 * Constructor overloading
 */

package Ch7_Inheritance;

class TwoDShape5 {
    private double width;
    private double height;

    // Constructor in the superclass

    // A default constructor
    TwoDShape5() {
        width = height = 0.0;
    }

    // Parametrized constructor
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height
    TwoDShape5(double x) {
        width = height = x;
    }


    // accessor methods for width and height

    // getters
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    // setters
    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }


    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

class Triangle5 extends TwoDShape5 {
    private String style;

    // Constructors

    // Default constructor
    Triangle5() {
        super();
        style = "none";
    }

    // Constructor with params
    Triangle5(String s, double w, double h) {
        super(w, h); // calls a superclass constructor
        style = s; // style unique to triangles so it's initialized here
    }

    // One argument constructor
    Triangle5(double x) {
        super(x);
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }

    /**
     * Prints info about the triangle, style, width, height, area
     * @param name name of the object passed in as a string
     */
    void printInfo(String name) {
        System.out.println("Info for " + name + ": ");
        showStyle();
        showDim();
        System.out.println("Area is " + area());
    }

}

public class Shapes5ConstructorOverloading {
    public static void main(String[] args) {
        Triangle5 triangle = new Triangle5();
        Triangle5 triangle2 = new Triangle5("Outlined", 8.0, 12.0);
        Triangle5 triangle3 = new Triangle5(4.0);

        // triangle = triangle2;

        triangle.printInfo("triangle");
        System.out.println();

        triangle2.printInfo("triangle2");
        System.out.println();

        triangle3.printInfo("triangle3");
        System.out.println();


    }
}
