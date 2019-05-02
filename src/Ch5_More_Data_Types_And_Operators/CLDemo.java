/*
    p. 165
    Display all command line info

    To pass command line arguments in ItelliJ: Run/Edit Configurations => program arguments separated by space
 */

package Ch5_More_Data_Types_And_Operators;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " command line arguments.");

        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}
