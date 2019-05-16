/*
 * p. 217
 * Demonstrates usage of the inner class
 */

package Ch6_Methods_Classes_Closer_Look;

class Outer {

    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    // This is an inner class
    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 1, length = nums.length; i < length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1, length = nums.length; i < length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++)
                a += nums[i];
            return a / n;
        }
    }  // Inner
} // Outer


public class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outOb = new Outer(x);

        outOb.analyze();
    }
}
