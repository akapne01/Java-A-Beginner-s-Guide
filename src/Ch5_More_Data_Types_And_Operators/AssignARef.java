/*
    p.146
    Assigning array reference variables
    You can assign one array reference variable to another
    Simply changing what object refers to
    This does not create a new copy and contents of 1 array are not copied to other array
 */
package Ch5_More_Data_Types_And_Operators;

public class AssignARef {
    public static void main(String[] args) {
        // init 2 one-dim arrays
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        // assign values to arrays
        for (int i = 0; i < 10; i++) {
            nums1[i] = i;
            nums2[i] = -i;
        }

        System.out.print("Here is nums1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here is nums2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();


        nums2 = nums1; // Now nums2 refers to nums1

        System.out.print("Here is nums2 after assignment: ");
        for (int i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();


        // Now operate on nums1 array through nums2
        nums2[3] = 99;

        System.out.print("Here is nums1 after change through nums2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}
