/*
 * Sorting Strings using Bubble version from the book
 * p. 599
 */

package Ch5_More_Data_Types_And_Operators;

public class StrBubble {

    static String[] differentBubbleSort(String arr[]) {
        String strs[] = arr;
        int size = strs.length;
        String t;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (strs[j - 1].compareTo(strs[j]) > 0) {
                    // if out of order exchange elements
                    t = strs[j - 1];
                    strs[j - 1] = strs[j];
                    strs[j] = t;
                }
            }
        }
        return strs;
    }

    public static void main(String[] args) {
        // String strs[] = {"this", "is", "a", "test", "of", "a", "string", "sort",};
        // String strs2[] = {"this", "is", "a", "test", "of", "a", "string", "sort",};
        String strs[] = {"ac", "po", "abbc", "abba", "ab", "a"};
        String strs2[] = {"ac", "po", "abbc", "abba", "ab", "a"};

        int a, b;
        String t;
        int size;

        size = strs.length; // number of elements to sort
        System.out.println("Before sort");
        BubbleArraySort.printArray(strs);
        differentBubbleSort(strs);
        BubbleArraySort.BubbleSort(strs2);
        System.out.println();
        System.out.println("After sort strs:");
        BubbleArraySort.printArray(strs);
        System.out.println();
        System.out.println("After sort strs2 (my algorithm):");
        BubbleArraySort.printArray(strs2);
        String test = "atest";
        System.out.println(test.indexOf("t"));
        System.out.println(test.lastIndexOf("t"));
        String t1 = "I like Java";
        System.out.println("t1.length(): " + t1.length());
        System.out.println("t1.charAt(3): " + t1.charAt(3));
        System.out.println("I like Java".length());
        System.out.println("I like Java".charAt(3));
    }
}