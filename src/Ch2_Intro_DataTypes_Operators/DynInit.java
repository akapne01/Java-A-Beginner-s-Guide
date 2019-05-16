/*
  p45 - BG
  Demonstrates dynamic initalization
  Computes the volume of the cilinder given the radius of its
  base and its height.
*/

class DynInit {
  public static void main(String[] args) {
    double radius = 4, height = 5;

    // dynamically initalize volume
    // volume is dynamically initalized at runtime
    double volume = 3.1416 * radius * radius * height;

    System.out.println("Volume is " + volume);
  }
}
