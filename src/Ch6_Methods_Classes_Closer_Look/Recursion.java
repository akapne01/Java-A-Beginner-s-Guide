/*
 * p. 208
 * A simple example of recursion
 */

package Ch6_Methods_Classes_Closer_Look;

class Factorial {
    // This is a recursive function
    /*
     * Called until 1 returned.
     */
    int factR(int n) {
        int result;
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        }
        result = factR(n - 1) * n;
        System.out.println("n is: " + n);
        System.out.println("result is: " + result);
        System.out.println();
        return result;
    }

    // This is iterative equivalent
    int factI(int n) {
        int result;
        result = 1;
        // should start from 1. When any numbers are multiplied by 0, zero is always a result
        for (int t = 1; t <= n; t++) result *= t;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}
