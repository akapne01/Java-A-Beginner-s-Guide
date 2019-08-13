package practice_tests.ch3_operators_decision_contructs;


/**
 * p. 41 3-28
 */
public class Road {
    /**
     * xNC because streets is an int variable in else if, and
     * it can't be compared to boolean.
     */

    public static void main(String[] args) {
        int intersections = 100;
        int streets = 200;

        if (intersections < 150) {
            System.out.println("1");
        }  //else if (streets && intersections >1000) {
           //  System.out.println("2");
        //}

        if (streets < 500)
            System.out.println("1");
        else
            System.out.println("2");

    }
}
