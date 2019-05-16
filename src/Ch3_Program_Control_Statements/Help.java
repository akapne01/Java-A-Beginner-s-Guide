/*
  p. 75 - BG
  Try this 3-1
  Start building a Java Help System.
  1) Displays the syntax for Java Control statements
  2) Waits for you to choose one
  3) Displays the chosen syntax statement
  Help available for *if* and *switch*
*/

class Help {
  public static void main(String[] args) throws java.io.IOException {

    System.out.println("Help on:");
    System.out.println("    1. if");
    System.out.println("    2. switch");
    System.out.print("Choose one: ");

    char choice = (char) System.in.read();

    switch(choice) {
      case '1':
        System.out.println("The if:\n");
        System.out.println("if(condition) statement;");
        System.out.println("else statement;");
        break;
      case '2':
        System.out.println("The switch:\n");
        System.out.println("switch(expression) {");
        System.out.println("    case constant:");
        System.out.println("       statement sequence");
        System.out.println("       break;");
        System.out.println("    // ...");
        System.out.println("}");
        break;
      default:
        System.out.println("Selection not found.");

    }

  }
}
