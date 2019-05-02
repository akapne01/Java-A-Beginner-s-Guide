/*
    p. 147
    Use length of array
 */

package Ch5_More_Data_Types_And_Operators;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = { // a variable-length table
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {}
        };

        System.out.println("Length of lst is " + list.length);
        System.out.println("Length of nums is " + nums.length);
        System.out.println("Length of table is " + table.length); // shows number of rows
        System.out.println("Length of table[0] is " + table[0].length); // shows elements in each rows
        System.out.println("Length of table[1] is " + table[1].length);
        System.out.println("Length of table[2] is " + table[2].length);
        System.out.println("Length of table[3] is " + table[3].length);
        System.out.println();

        int total = 0;
        for (int i = 0; i < table.length; i++) {
                total += table[i].length;
        }

        System.out.println("Total number elements in whole table is " + total);

        // use length to init list
        for (int i = 0; i < list.length; i++) {
            list[i] = i * i;
        }

        System.out.println("Here is the list: ");
        // Now use length to display the list
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

    }
}
