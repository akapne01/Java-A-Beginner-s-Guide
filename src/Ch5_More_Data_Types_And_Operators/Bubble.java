/*
    p 140
    Try this 5-1
    1 dimensional array sort -  bubble method which is not efficient for large arrays
 */
package Ch5_More_Data_Types_And_Operators;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int t, size;
        size = 10; //  number of elements in the array

        // display original array
        System.out.println("Original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }

        // This is a Bubble sort
        for (int a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { // if out of order exchange elements
                    t = nums[b - 1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                } // if
            } // for - b
        } // for - a

        // display the sorted array
        System.out.println();
        System.out.println("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    } // main
} // class
