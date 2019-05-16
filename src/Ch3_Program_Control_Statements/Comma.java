/*
  p.79 - BG
  Use commas in for statement
  This program demonstrates that for loop can have 2 loop
  control variables separted by commas.
  Here:
    i is 0 and increased
    j is 10 and decreaed
*/

class Comma {
  public static void main(String[] args) {

    // this for loop uses 2 loop control variables i and j.
    // Both separeted by comma

    for(int i=0, j=10; i < j; i++, j--)
      System.out.println("i and j: " + i + " " + j);
  }
}
