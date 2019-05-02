package Ch5_More_Data_Types_And_Operators;

public class MinMax {
    public static void main(String[] args) {
        // init array
        int nums[] = new int[10];
        int min, max;

        // assign elements to array
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        System.out.println("min is " + min);
        System.out.println("max is " + max);

        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("min is: " + min);
        System.out.println("max is: " + max);
    }
}
