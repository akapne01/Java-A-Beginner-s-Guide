/* This class implements a "fail-soft" array which prevents
    runtime errors.
    p. 188
 */
package Ch_6_Methods_Classes_Closer_Look;

/*
    private variables a[], errvalue and
    private method: indexOK all 3 can be used
    only within the FailSoftArray class

 */
class FailSoftArray {
    private int a[]; // reference to array
    private int errvalue; // value to return if get() fails
    public int length; // length is public

    /* Construct array given its size and value to return if get() fails
     */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errvalue = errv;
        length = size;
    }

    // Return value at given index
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errvalue;
    }

    // Put a value at an index. Return false on failure
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Return true if index within bounds.
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// Demonstrates the fail-soft array
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // show quiet failures
        System.out.println("Fail quietly.");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i*10);
        }
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();

        // now, handle failures
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("index " + i + " out-of-bounds");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds.");
        }
    }
}
