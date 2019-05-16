/*
    p. 163
    Strings are immutable
    Demonstrates substring()
 */

package Ch5_More_Data_Types_And_Operators;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        // constructs a substring
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
