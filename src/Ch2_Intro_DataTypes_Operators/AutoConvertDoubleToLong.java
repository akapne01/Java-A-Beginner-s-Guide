package Ch2_Intro_DataTypes_Operators;/*
  p.56 - DB
  *** This program will not compile ***
  Cannot automaticatlly concert from double to long
*/

class AutoConvertDoubleToLong {
  public static void main(String[] args) {
    long L;
    double D;
    L= 1009L;

    D = 100123285.0;
    // L = D; xNC

    System.out.println("L and D: " + L + " " + D);

    double D2 = 1.00123285E8;
    // L = D2; xNC

    System.out.println("L and D2: " + L + " " + D2);
  }
}
