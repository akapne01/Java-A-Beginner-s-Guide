/*
  p43 - BG
  Demonstrate escape sequences in strings
*/

class StrDemo {
  public static void main(String args[]) {
    // /n generates a new line
    System.out.println("First line \nSecond Line");
    // \t tab
    System.out.println("A\tB\tC");
    System.out.println("D\tE\tF");

    // Java ignores underscores, useful for readability purposes
    int intnr = 1_234_567;
    System.out.println(intnr);

    char ch = 'a';
    String a = "a";
    // System.out.println(ch == a); => doesn't compile as they are different types
    System.out.println(a.equals(ch)); // prints false
  }
}
