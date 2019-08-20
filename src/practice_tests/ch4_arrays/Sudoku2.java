package practice_tests.ch4_arrays;

public class Sudoku2 {
   static int[][] game;

   public static void main(String[] args) {
      game[3][3] = 6;
      Object[] obj = game;
      /**
       * xNC, because this is an integer array,
       * but we are trying to assign String.
       */
//      game[3][3] = "X";
      System.out.println(game[3][3]);
   }
}
