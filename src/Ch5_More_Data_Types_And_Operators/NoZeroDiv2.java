/*
    p. 183
    Prevent division by zero using ? operator
    Written more efficiently than NoZeroDiv

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

public class NoZeroDiv2 {
    public static void main(String[] args) {
        for (int i = -5; i < 6; i++)
            if (i != 0 ? true : false)
                System.out.println("100 / " + i + " is " + 100 / i);
    }
}
