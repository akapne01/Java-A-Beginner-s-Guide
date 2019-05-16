package Ch7_Inheritance;

/*
 * p. 250
 * Demonstrate reference variables for superclasses and subclasses
 */


class TwoDShape7 {
    private double width;
    private double height;

    // A default constructor
    TwoDShape7() {
        width = height = 0;
    }

    // Parametrized constructor
    TwoDShape7(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    // Construct objects with equal height and width
    TwoDShape7(double length) {
        width = height = length;
    }

    // Construct an object from object
    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
    }

    // Getters and setters
    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    // method
    void showDim() {
        System.out.println("Weight and height are: " + width + " and " + height);
    }

}


class Triangle7 extends TwoDShape7 {
    private String style;

    // A default constructor
    Triangle7() {
        super();
        style = "none";
    }

    // Parametrized constructor
    Triangle7(double weight, double height, String style) {
        super(weight, height);
        this.style = style;
    }

    // One argument constructor
    Triangle7(double length) {
        super(length);
        style = "filled";
    }

    // Construct object from object
    Triangle7(Triangle7 ob){
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
     * @param name name of the object passed in as a string
     */
    void printInfo(String name) {
        System.out.println("Info for " + name + ": ");
        showStyle();
        showDim();
        System.out.println("Area is " + area());
    }
}



public class Shape7ConstrFromOb {
    public static void main(String[] args) {
        Triangle7 triangle = new Triangle7(8.0, 12.0, "outlined");

        // make a  copy of triangle
        Triangle7 triangle2 = new Triangle7(triangle);

        triangle.printInfo("triangle");
        System.out.println();
        triangle2.printInfo("triangle2");
    }


}
