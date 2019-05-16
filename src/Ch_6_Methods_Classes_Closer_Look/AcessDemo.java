/*
p. 187 public vs private access
 */
package Ch_6_Methods_Classes_Closer_Look;

class MyClass {

    private int alpha; // private
    public int beta; // public
    int gamma; // default

    /*
    Methods to access alpha. It is ok for a member of class to access a private member
    of the same class
     */

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /*
        Access to alpha is allowed only through its accessor methods.
         */

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // You cannot access alpha like this:
        // ob.alpha = 10;

        // These are ok because beta and gamma are public
        ob.beta = 88; // public
        ob.gamma = 99; // default

        /*
        Default and public variables can be accessed outside the class
        Private cannot
         */
    }
}
