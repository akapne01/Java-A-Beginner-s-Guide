/*
 * p. 214
 * Try this 6-3
 * The Simple version of quick sort algorithm
 * This is arguably the best general purpose sorting algorithm currently available
 * Implementation rely on recursion.
 * This version sorts array of chars
 * Algorithm:
 *  a) built on idea of partitions
 *  b) select value (comparand) & partion the array into 2 sections
 *  c) elements greater or equal on one side and less than value on other side
 *  d) repeated for each remaining section until array is sorted
 *
 *  Output:
        Original array:
        dxarpji
        Sorted array:
        adijprx

 */

package Ch6_Methods_Classes_Closer_Look;

class QuickSort {

    // set up a call to the actual QuickSort method.
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    // A recursive version of Quicksort for characters
    public static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }
}

public class QuickSortDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};

        System.out.println("Original array: ");
        for (int i = 0, n = a.length; i < n; i++)
            System.out.print(a[i]);

        System.out.println();

        // now sort the array
        QuickSort.qsort(a);

        System.out.println("Sorted array: ");
        for (int i = 0, n = a.length; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}

