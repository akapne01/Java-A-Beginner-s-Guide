/*
  p.80 - BG
  Parts of for loop can be Empty.
  This program demonstrates for loop with iteration missing
*/

class EmptyIterationForLoop {
  public static void main(String[] args) {

    for(int i = 0; i < 10; ){
      System.out.println("Pass #" + i);
      i++; // manually increment loop control variable
    }
  }
}
