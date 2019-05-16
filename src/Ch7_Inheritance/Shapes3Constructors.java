/*
 * p. 236
 * Constructors and inheritance
 */

package Ch7_Inheritance;

class Triangle3 extends TwoDShape2 {
    private String style;

    Triangle3(String s, double w, double h) {
        // calls these methods from superclass
        setWidth(w);
        setHeight(w);

        // Sets private style in this class
        style = s;
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


public class Shapes3Constructors {
    public static void main(String[] args) {
        Triangle3 triange1 = new Triangle3("filled", 4.0, 4.0);
        Triangle3 triange2 = new Triangle3("outlined", 8.0, 12.0);

        triange1.printInfo("triangle1");
        System.out.println();
        triange2.printInfo("triangle2");
    }

}

