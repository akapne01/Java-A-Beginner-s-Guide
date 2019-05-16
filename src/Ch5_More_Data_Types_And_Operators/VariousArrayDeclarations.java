/*
    p. 145
    To understand various ways to declare an array
    1) type array-name[] = new type[size];
    2) type[] var-name;

 */
package Ch5_More_Data_Types_And_Operators;

public class VariousArrayDeclarations {
    int counter1[] = new int[3];
    int[] counter2 = new int[3];

    char table1[][] = new char[3][4];
    char[][] table2 = new char[3][4];

    // This way is convenient when declaring several arrays at the same time
    int[] nums, nums2, nums3; // create 3 arrays at the same time
    int nums4[], nums5[], nums6[]; // also creates 3 arrays

    // Alternative declaration is useful when specifying array as an return type for a method

}

