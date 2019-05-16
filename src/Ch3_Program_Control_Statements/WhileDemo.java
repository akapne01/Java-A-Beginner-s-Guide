/*
  p.83 - BG
  Demonstrate the While Loop by printing the AlphaBet
*/

class WhileDemo {
  public static void main (String[] args) {
    char ch;

    // print the AlphaBet
    ch = 'a';

    while(ch <= 'z') {
      System.out.println(ch);
      ch++;
    }
  }
}
