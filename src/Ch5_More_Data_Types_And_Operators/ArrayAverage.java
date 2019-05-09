/*
    p. 183
    Ch 5 Self Test - (3)
    Uses array to find average of 10 double values. Use any 10 values you like

 */

package Ch5_More_Data_Types_And_Operators;

public class ArrayAverage {
    public static void main(String[] args) {
        // init array
        double arr[] = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};

        double sum = 0, average;

        for (double d : arr) sum += d;
        average = sum / arr.length;
        System.out.println("Average value is: " + average);
        byte a = 0b00000011;
        System.out.println(-a>>>-1);
        System.out.println(a>>>1);
    }
}
