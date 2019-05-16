/*
    p. 162
    Demonstrates string arrays
    Modification of the string array
 */

package Ch5_More_Data_Types_And_Operators;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "is", "a", "test"};

        System.out.println("Original array: ");
        for (String s: strs) System.out.print(s + " ");
        System.out.println("\n");

        // change a string
        strs[1] = "was";
        strs[3] = "test, too.";

        System.out.println("Modified array: ");
        for(String s: strs) System.out.print(s + " ");
    }
}
