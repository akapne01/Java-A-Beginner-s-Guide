/*
    p. 149
    Use length variable to help copy an array
 */
package Ch5_More_Data_Types_And_Operators;

public class ACopy {
    public static void main(String[] args) {

        int[] nums1 = new int[10];
        int nums2[] = new int[10];

        for (int i = 0; i < nums1.length; i++)
            nums1[i] = i;

        // Copy nums1 to nums2
        for (int i = 0; i < nums1.length; i++)
            nums2[i] = nums1[i];

        for (int i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");


    }

}
