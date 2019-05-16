/*
  p. 81 - BG
  This program demonstrates that For loop can also have an Empty body.
*/

class ForLoopEmptyBody {
  public static void main(String[] args) {

    int i;
    int sum = 0;

    // sum the numbers through 5
    for(i = 1; i <= 5; sum += i++) ;

    System.out.println("Sum of 1 to 5 is: " + sum);
  }
}
