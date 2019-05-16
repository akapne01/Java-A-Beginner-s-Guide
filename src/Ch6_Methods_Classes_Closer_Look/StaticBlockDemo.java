/*
 * p. 213
 * Static blocks are executed when the class is first loaded, before
 * the class is used.
 * Below classes use static block
 *
 * Output of this program is:
    Inside the static block.
    Inside Constructor
    Square root of 2 is 1.4142135623730951
    Square root of 3 is 1.7320508075688772
 */

package Ch6_Methods_Classes_Closer_Look;

class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // executed when class is loaded and before it is used, before objects are constructed
    static {
        System.out.println("Inside the static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }

}

class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + StaticBlock.rootOf3);
    }

}
