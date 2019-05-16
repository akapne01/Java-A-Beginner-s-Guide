package Ch7_Inheritance;

/*
 * p. 259
 * Dynamic method dispatch
 */


class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDShape8() {
        width = height = 0.0;
        name = "none";
    }

    // Parametrized constructor
    TwoDShape8(double weight, double height, String name) {
        this.width = weight;
        this.height = height;
        this.name = name;
    }

    // Construct objects with equal height and width
    TwoDShape8(double length, String name) {
        width = height = length;
        this.name = name;
    }

    // Construct an object from object
    TwoDShape8(TwoDShape8 ob) {
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

    double area() {
        System.out.println("area() must be overrideden");
        return 0.0;
    }

}


class Triangle8 extends TwoDShape8 {
    private String style;

    // A default constructor
    Triangle8() {
        super();
        style = "none";
    }

    // Parametrized constructor
    Triangle8(double weight, double height, String style) {
        super(weight, height, "triangle");
        this.style = style;
    }

    // One argument constructor
    Triangle8(double length) {
        super(length, "triangle");
        style = "filled";
    }

    // Construct object from object
    Triangle8(Triangle8 ob) {
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

class Rectangle8 extends TwoDShape8 {

    // A default constructor
    Rectangle8() {
        super();
    }

    // Constructor for Rectangle
    Rectangle8(double width, double height) {
        super(width, height, "rectangle"); // call superclass constructor
    }

    // Construct a square
    Rectangle8(double x) {
        super(x, "rectangle-square");
    }

    // Construct an object from the object
    Rectangle8(Rectangle8 ob) {
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

public class DynamicShapes {
    public static void main(String[] args) {

        /*
         * Because all shapes are defined by array which holds superclass references,
         * overridden methods are selected at runtime.
         *
         * However, methods that are specific to the subclass are not accessible
         *
         * shapes[3].showStyle; => this does not compile
         *
         * Triangle8 triangle8 = new Triangle8(7.0);
         * triangle8.showStyle(); => this compiles
         */

        TwoDShape8 shapes[] = new TwoDShape8[5];

        shapes[0] = new Triangle8(12.0 , 8.0, "outlined");
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10, 4);
        shapes[3] = new Triangle8(7.0);
        shapes[4] = new TwoDShape8(10.0, 20, "generic");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i] + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();

        }

        // shapes[3].showStyle;

        Triangle8 triangle8 = new Triangle8(7.0);
        triangle8.showStyle();
    }
}
