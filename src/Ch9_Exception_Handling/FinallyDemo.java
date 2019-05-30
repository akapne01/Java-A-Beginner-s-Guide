package Ch9_Exception_Handling;

/*
 * p. 323
 * Use finally. It reaches finally block regardless if the exception
 * was cached or not.
 */

class UseFinally {
    public static void genrateException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch(what) {
                case 0:
                    t =10/what; // generate division by 0 error
                    break;
                case 1:
                    nums[4] = 4; // generate array index error
                    break;
                case 2:
                    return; // return form the try block
            }
        } catch (ArithmeticException exception) {
            System.out.println("Can't divide by Zero!");
            return; // return from catch
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("No matching element found.");
        }
        finally {
            System.out.println("Leaving try. Inside Finally block");
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genrateException(i);
            System.out.println();
        }
    }

}