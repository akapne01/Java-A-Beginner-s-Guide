/*
 * p. 238
 * Using super() to call superclass constructor in the subclass constructor
 * super() always needs to be the first statement in the subclass constructor
 */

package Ch7_Inheritance;

class TwoDShape4 {
    private double width;
    private double height;

    // Constructor in the superclass
    TwoDShape4(double w, double h){
        width = w;
        height = h;
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

class Triangle4 extends TwoDShape4 {
    private String style;

    // Constructor
    Triangle4(String s, double w, double h) {
        super(w, h); // calls a superclass constructor
        style = s; // style unique to triangles so it's initialized here
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


public class Shapes4ConstrForBoth {
    public static void main(String[] args) {
        Triangle4 triangle = new Triangle4("filled", 4.0, 4.0);
        Triangle4 triangle2 = new Triangle4("outlined", 8.0, 12.0);

        triangle.printInfo("triangle");
        triangle2.printInfo("triangle2");
    }
}
