/*
  p. 78 - BG
  A negatively running loop
  This program demonstrates that loop control variable in for loop
  can also be negative and decremented
*/

class DecrFor {
  public static void main(String[] args) {

    // prints out the sequence of numbers from 100 to -95
    // loop control variable can be negative and decremented
    for(int x = 100; x > -100; x -= 5) {
      System.out.println(x);
    }
  }
}
