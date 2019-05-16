/*
  p.74 - BG
  Demonstrates nested Switch statements
*/

class NestedSwitch {
  public static void main(String[] args) {

    char ch1, ch2;
    ch1 = ch2 = 'A';

    // The outer switch
    switch (ch1) {
      case 'A': System.out.println("This A is part of the outer switch");
        // The inner Switch - can have the same vars as the outer one
        switch (ch2) {
          case 'A': System.out.println("This A is part of inner switch");
          break;
        } // end of the onner Switch
        break; // break out from the outer switch
    }
  }
}
