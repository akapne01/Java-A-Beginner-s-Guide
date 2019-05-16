/*
  Ch1 SelfTest - (9) p31 BG
  This program computes your effective weight on the Moon
  Moon's gravity is about 17% of the Earths
*/

class Moon {
  public static void main(String args []) {
    double earthWeight; // weight on Earth
    double moonWeight; // weight on Moon

    earthWeight = 50;

    moonWeight = earthWeight * 0.17;

    System.out.println(earthWeight + " earth kilograms is equivalent to " + moonWeight + " moon kilograms.");
  }
}
