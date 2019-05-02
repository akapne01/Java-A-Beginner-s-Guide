/*
    p. 156
    For-each variable is read-only in the sense that, changing it, does not change nums
    But you can still do some aesthetics with it, etc.
 */
package Ch5_More_Data_Types_And_Operators;

public class NoChange {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int x: nums) {
            System.out.print(x + " ");
            x *= 10;
            System.out.print("m" + x + "/m ");
        }

        System.out.println();

        for(int x: nums) System.out.print(x + " ");

        System.out.println();
    }
}
