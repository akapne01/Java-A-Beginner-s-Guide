/*
  p.74 - BG
  Demondtrates the case stacking.
  This exercise is not from the book itself, but uses idea from the
  book to demonstrate how swich works when code for some of the
  cases repeats itself.
*/

class EmptyCaseSwitch {
  public static void main(String[] args) {

    for (int i=0; i<10; i++) {
      switch(i) {
        case 2:
        case 4:
        case 6:
        case 8:
        case 10:
          System.out.println("i is even: " + i);
          break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 9:
          System.out.println("i is odd: " + i);
          break;
        default:
          System.out.println("i must be zero: " + i);
      }
    }
  }
}
