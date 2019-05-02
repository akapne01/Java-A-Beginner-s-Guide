package Ch5_More_Data_Types_And_Operators;

public class Ragged {
    public static void main(String[] args) {
        // init array dimensions
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        // generate week data
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
            }
        }

        // generate weekend data
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
            } // j
        } // i

        // print out week data
        System.out.println("Riders per trip during the week:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(riders[i][j] + " ");
            } // j
            System.out.println();
        } // i
        System.out.println();

        // print out weekend data
        System.out.println("Riders per trip on the weekend:");
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(riders[i][j] + " ");
            } // i2
            System.out.println();
        } // j2
    } // m
} // c
