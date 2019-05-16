/*
  Demonstrates the for loop
*/

class ForDemo {
  public static void main(String args[]) {
    int count; // loop control variable

    // prints 0 - 4
    // at the start of each iteration, conditional test performed,
    // incluidng the first one
    for(count = 0; count < 5; count = count + 1)
      System.out.println("This is count: " + count);

    System.out.println("Done!");
    System.out.println(count);

    // doesn't enter the loop as condition is false
    for (int i = 0; i > 5; i++)
      System.out.println("This is i: " + i);

    System.out.println("Done!");
  }
}
