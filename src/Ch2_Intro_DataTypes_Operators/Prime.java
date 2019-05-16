/*
  p.63 - Ch2 - Self Test - (10)
  Program that finds all prime numbers between 2 and 100.
  This program uses Sieve of Eratosthenes
*/

class Prime {
  public static void main(String[] args) {

    System.out.println("All Prime numbers between 2 and 100");

    for (int n = 2; n < 100 ; n++) {
      // 2, 3, 5 and 7 are prime numbers
      if ((n == 2) || (n == 3) || (n == 5) || (n == 7)) {
        System.out.print(n + " ");
      // If number is not divisible by 2, 3, 5 and 7 then it is a prime number
      } else if ((n % 2 != 0) && (n % 3 != 0) && (n % 5 !=0) && (n % 7 != 0)) {
        System.out.print(n + " ");
      }
    }
  }
}
