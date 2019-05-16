/*
    Try this 3-2 p. 88
    An improved Help system that uses a do-while to
    process a menu selection.
 */

package Ch3_Program_Control_Statements;

public class Help2 {
    public static void main (String[] args) throws java.io.IOException {
        char choice, ignore;

        // gives menu, accepts user input. Loops until response between 1 and 5
        do {
            System.out.println("Help on:");
            System.out.println("   1.   if");
            System.out.println("   2.   switch");
            System.out.println("   3.   for");
            System.out.println("   4.   while");
            System.out.println("   5.   do-while");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

            /*
            needed because of the specifics of the input buffer. .read() only reads one char
            enter is another char, and user might accidentaly enter more than one as well
            Clears out the sting buffer
             */
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choice < '1' | choice > '5'); // evaluates both in this case - needed?


        switch(choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("     statement sequence;");
                System.out.println("     break;");
                System.out.println("     // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for: \n");
                System.out.print("for(init; condition; iteration)");
                System.out.println("   statement;");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("   statement;");
                System.out.println("} while (condition);");
                break;
        } // switch

    } // main
} // class
