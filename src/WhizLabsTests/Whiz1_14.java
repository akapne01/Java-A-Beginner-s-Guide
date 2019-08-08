package WhizLabsTests;

/**
 * From Java 7, JVM first looks for the main method.
 * If not found => gives an error
 * If main() exists => loads class in the memory.
 * Class may not have a main method => No compile time error
 */
public class Whiz1_14 {
   static {
      System.out.println("This java program will run without the main method");
      System.exit(0);
   }
}
