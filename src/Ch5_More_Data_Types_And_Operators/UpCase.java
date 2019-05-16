/*
    p. 172
    Using Bitwise operator
    Uppercase letters are different by 32 from lowercase
    Uses & to change letter case

    65503 is a decimal representation of  1111 1111 1101 1111
    & leaves all the bits unchanged except the 6th one which is set to 0
 */

package Ch5_More_Data_Types_And_Operators;

public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);


            // This statement turns off the 6th bit
            ch = (char) ((int) ch & 65503); //ch is now uppercase

            System.out.println(ch + " ");
        }
    }
}
