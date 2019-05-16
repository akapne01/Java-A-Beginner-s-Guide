/*
  p.56 - DB
  *** This program will not compile ***
  Cannot automaticatlly concert from double to long
*/

class AutoConvertDoubleToLong {
  public static void main(String[] args) {
    long L;
    double D;

    D = 100123285.0;
    L = D;

    System.out.println("L and D: " + L + " " + D);

    double D2 = 1.00123285E8;
    L = D2;

    System.out.println("L and D2: " + L + " " + D2);
  }
}
