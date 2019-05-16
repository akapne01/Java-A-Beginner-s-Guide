package Ch7_Inheritance;

/*
 * p. 299
 * Creates an abstract class
 * Abstract method : area()
 * All abstract methods need to be overridden by subclasses
 * Subclasses need to be abstract until full implementation of all
 * abstract methods is achieved
 */


abstract class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }

    // Parametrized constructor
    TwoDShape9(double weight, double height, String name) {
        this.width = weight;
        this.height = height;
        this.name = name;
    }

    // Construct objects with equal height and width
    TwoDShape9(double length, String name) {
        width = height = length;
        this.name = name;
    }

    // Construct an object from object
    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Getters and setters
    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    String getName() {
        return this.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    // method
    void showDim() {
        System.out.println("Widtht and height are: " + width + " and " + height);
    }

    // Now area() is abstract method
    abstract double area();

}


class Triangle9 extends TwoDShape9 {
    private String style;

    // A default constructor
    Triangle9() {
        super();
        style = "none";
    }

    // Parametrized constructor
    Triangle9(double weight, double height, String style) {
        super(weight, height, "triangle");
        this.style = style;
    }

    // One argument constructor
    Triangle9(double length) {
        super(length, "triangle");
        style = "filled";
    }

    // Construct object from object
    Triangle9(Triangle9 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }


    /**
     * Prints info about the triangle, style, width, height, area
     *
     * @param name name of the object passed in as a string
     */
    void printInfo(String name) {
        System.out.println("Info for " + name + ": ");
        showStyle();
        showDim();
        System.out.println("Area is " + area());
    }
}

class Rectangle9 extends TwoDShape9 {

    // A default constructor
    Rectangle9() {
        super();
    }

    // Constructor for Rectangle
    Rectangle9(double width, double height) {
        super(width, height, "rectangle"); // call superclass constructor
    }

    // Construct a square
    Rectangle9(double x) {
        super(x, "rectangle-square");
    }

    // Construct an object from the object
    Rectangle9(Rectangle9 ob) {
        super(ob); // pass object to TwoDShape8 constructor
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Override area() for Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}


public class AbstractShape9 {
    public static void main(String[] args) {

        TwoDShape9 shapes[] = new TwoDShape9[4];

        shapes[0] = new Triangle9(12.0 , 8.0, "outlined");
        shapes[1] = new Rectangle9(10);
        shapes[2] = new Rectangle9(10, 4);
        shapes[3] = new Triangle9(7.0);
        //shapes[4] = new TwoDShape9(10.0, 20, "generic"); // Cannot instantiate because it is of abstract class

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i] + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();

        }
    }
}
