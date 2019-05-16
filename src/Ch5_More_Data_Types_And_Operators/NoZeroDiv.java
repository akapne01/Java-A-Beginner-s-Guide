/*
    p. 182
    prevent division by 0

    Output:
    100 / -5 is -20
    100 / -4 is -25
    100 / -3 is -33
    100 / -2 is -50
    100 / -1 is -100
    100 / 1 is 100
    100 / 2 is 50
    100 / 3 is 33
    100 / 4 is 25
    100 / 5 is 20

 */

package Ch5_More_Data_Types_And_Operators;

public class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {
            // prevents division by zero
            result = i != 0 ? 100 / i : 0;
            if (i != 0) System.out.println("100 / " + i + " is " + result);
        }
    }
}
