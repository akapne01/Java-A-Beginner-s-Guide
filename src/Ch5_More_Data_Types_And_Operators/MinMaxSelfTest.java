package Ch5_More_Data_Types_And_Operators;

public class MinMaxSelfTest {

        public static void main(String[] args) {
            // init array and assign elements to array
            int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

            int min, max;

            min = max = nums[0];

            for (int n: nums){
                if (n > max) max = n;
                if (n < min) min = n;

            }
            System.out.println("Min and max: " + min + " " + max);
        }



}
