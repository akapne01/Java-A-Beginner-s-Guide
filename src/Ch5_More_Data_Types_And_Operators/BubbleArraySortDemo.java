/*
 * p. 183 Ch 5 - Self test (4)
 * Change Bubble sort to work for array of strings
 */
package Ch5_More_Data_Types_And_Operators;

class BubbleArraySort {


    /*
     *  p 140
     * Try this 5-1
     * 1 dimensional array sort -  bubble method which is not efficient for large arrays
     * Pseudo code for this algorithm
     * We have arrays of strings {"hi", "me", "he"}
     * We have to compare the first characters of each string and swap based on that
     * If first character is the same, compares the second char, until determines which
     * string is before and which after in alphabet
     */
    static boolean startSameLetter(String str1, String str2) {
        return str1.charAt(0) == str2.charAt(0);
    }


    /**
     * This method determines which of the 2 strings is smallest and
     * comes first in the alphabet. Used to sort Strings in an array
     *
     * @param str1 First string
     * @param str2 Second String
     * @return smallest of the two strings
     */
    static String smallerString(String str1, String str2) {
        String smallest = str1;
        // n = length of smallest string
        int n = str1.length() >= str2.length() ? str2.length() : str1.length();
        if (str1.equals(str2)) return str1;
        if (str1.length() > str2.length()) smallest = str2;

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == str2.charAt(i)) continue;
            if (str2.charAt(i) > str1.charAt(i)) {
                smallest = str1;
                break;
            } else {
                smallest = str2;
                break;
            }
        }
        return smallest;
    }


    /**
     * This is my amazing String Bubble Sort
     * Sorts arrays of strings using Bubble sort algorithm
     *
     * @param arr String array
     * @return sorted array arr
     */
    static String[] BubbleSort(String[] arr) {
        String nums[] = arr;
        String first;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                // j-1 = first & j = latest
                first = smallerString(nums[j - 1], nums[j]);
                if (first.equals(nums[j - 1]))
                    continue;
                // swap j-1 with j
                nums[j] = nums[j - 1];
                nums[j - 1] = first;
            }
        }
        return nums;
    }


    /**
     * Prints a String array on the console
     *
     * @param arr is String array
     */
    static void printArray(String[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

}

class BubbleArraySortDemo {
    public static void main(String[] args) {

        String nums[] = {"ac", "po", "abbc", "abba", "ab"};
        int size = nums.length; //  number of elements in the array

        System.out.println("Original array is:");
        BubbleArraySort.printArray(nums);
        BubbleArraySort.BubbleSort(nums);
        System.out.println("After the sort array looks as follows : ");
        BubbleArraySort.printArray(nums);
    }
}

