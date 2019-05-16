/*
  p52 - BG
  Demonstrate the short - circuit operators
*/

class ShortCircuitOps {
  public static void main(String[] args) {

    int n, d, q;

    n = 10;
    d = 2;
    if (d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);

    d = 0; // now, set d to 0

    // Since d = 0, the second hand operand is not evaluated.
    // Short-circuit hand operator prevents divison by 0
    if (d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);

    /*
      Now same thing without short-circuit operator.
      This will cause a divison-by-zero error.
    */

    // both expresions are evaluated allowing a division by zero to occur
    if (d != 0 & (n % d) == 0) System.out.println(d + " is a factor of " + n);
  }
}
