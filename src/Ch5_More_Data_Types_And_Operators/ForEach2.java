/*
   p. 157
   Uses for each style for 2-dim array
   In Java multidimensional arrays is array of arrays
 */

package Ch5_More_Data_Types_And_Operators;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

            // Use for-each for loop to display the sum of values
        for (int x[] : nums) {
            for(int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }

        }

        System.out.println("Sum is " + sum);
    }
}
