/*
    p. 118
    Class uses method with parameter
 */

package Ch4_Introducing_Classes_Objects_Methods;

class CheckNumber {
    // returns true if x is even
    boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }
}

class ParameterDemo {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();

        if (e.isEven(10)) System.out.println("10 is even");

        if (e.isEven(9)) System.out.println("9 is even");

        if (e.isEven(8)) System.out.println("8 is even");
    }
}
