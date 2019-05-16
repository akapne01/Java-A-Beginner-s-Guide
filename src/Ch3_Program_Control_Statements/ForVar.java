/*
  p.82 - BG
  Declare loop control variable inside for loop
*/

class ForVar {
  public static void main(String[] args) {

    int sum = 0;
    int fact = 1;

    // compute factorial of the numbers through 5
    for(int i = 1; i <= 5; i++) {
      sum += i;
      fact *= i;
    }
    // i is not known here anymore
    System.out.println("Sum is " + sum);
    System.out.println("Factorial is " + fact);
  }
}
