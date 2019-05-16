/*
    p. 155
    Use of for-each style for loop
    General form: for(type itr-val : collection) statement-block
 */
package Ch5_More_Data_Types_And_Operators;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Sums all nums elements
        int sum = 0;
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);

        // Sums all num elements short way;
        int sum2 = 0;
        for (int x : nums) sum2 += x;
        System.out.println("Using other way, the sum is: " + sum2);

        // Sums first 5 elements, break early using break
        int sum3 = 0;
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum3 += x;
            if (x == 5) break; // stop the loop when 5 is obtained
        }
        System.out.println("Sum of first 5: " + sum3);
    }
}
