/*
 * p. 246
 * Demonstrate hierarchies
 * You can build hierarchies that contain as many layers of inheritance as you like
 */

package Ch7_Inheritance;

class TwoDShape6 {
    private double weight;
    private double height;

    // A default constructor
    TwoDShape6() {
        weight = height = 0;
    }

    // Parametrized constructor
    TwoDShape6(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Construct objects with equal height and width
    TwoDShape6(double length) {
        weight = height = length;
    }


    // Getters and setters
    void setWeight(double weight) {
        this.weight = weight;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getWeight() {
        return weight;
    }

    double getHeight() {
        return height;
    }

    // method
    void showDim() {
        System.out.println("Weight and height are: " + weight + " and " + height);
    }

}


class Triangle6 extends TwoDShape6 {
    private String style;

    // A default constructor
    Triangle6() {
        super();
        style = "none";
    }

    // Parametrized constructor
    Triangle6(double weight, double height, String style) {
        super(weight, height);
        this.style = style;
    }

    // One argument constructor
    Triangle6(double length) {
        super(length);
        style = "filled";
    }

    double area() {
        return getHeight() * getWeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}


class ColorTriangle extends Triangle6 {
    private String color;

    // Parametrized constructor
    ColorTriangle(double weight, double height, String style, String color) {
        super(weight, height, style);
        this.color = color;
    }

    // getter
    String getColor() {
        return color;
    }

    // show color
    void showColor() {
        System.out.println("Colour is " + color);
    }

    /**
     * Prints info about the triangle, style, width, height, area
     * @param name name of the object passed in as a string
     */
    void printInfo(String name) {
        System.out.println("Info for " + name + ": ");
        showStyle();
        showDim();
        showColor();
        System.out.println("Area is " + area());
    }
}


public class Shapes6Hierarchies {
    public static void main(String[] args) {
        ColorTriangle colorTriangle = new ColorTriangle(8.0, 12.0, "outlined", "blue");
        ColorTriangle colorTriangle2 = new ColorTriangle(2.0, 2.0, "filled", "red");

        colorTriangle.printInfo("Colour Triangle 1");
        System.out.println();
        colorTriangle2.printInfo("Colour Triangle 2");
    }
}
