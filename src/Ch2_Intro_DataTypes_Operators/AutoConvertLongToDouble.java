/*
  p.56 - BG
  Demonstrates automatic conversion from long to double
*/

class AutoConvertLongToDouble {
  public static void main(String[] args) {
    long L;
    double D;

    L = 100123285L;
    D = L;

    System.out.println("l and D: " + L + " " + D);
  }
}
