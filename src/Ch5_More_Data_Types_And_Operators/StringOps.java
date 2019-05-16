/*
    p. 160
    Some String operations
    1) equals(str) ==> Boolean
    2) length() ==> int
    3) charAt(index) ==> char
    4) compareTo(str) ==> int (0=equal; nr < 0 smaller, nr > 0 bigger
    5) indexOf(str) ==> int (if failed ==> returns -1)
    6) lastIndexOf(str) ==> int (if failed ==> returns -1)
 */

package Ch5_More_Data_Types_And_Operators;

public class StringOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java Strings are powerful.";

        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        // display str1 1 char at the time
        for (int i = 0; i < str1.length(); i++) System.out.print(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 equals to str2");
        else System.out.println("str1 does not equal to e2");

        if (str1.equals(str3)) System.out.println("str1 equals to str3");
        else System.out.println("str1 doesn't equal to str3");

        result = str1.compareTo(str3);
        if (result == 0) System.out.println("Str1 and str3 are equal");
        else if (result < 0) System.out.println("str1 is less than str3");
        else System.out.println("str1 is greater than str3");

        // assign new string to str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Index of forst occurance of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurance of One: " + idx);

        /*
        Strings can be concatenated together using +
        */
        String str4 = str1 + str2 + str3;
        System.out.println(str4);

    }
}
