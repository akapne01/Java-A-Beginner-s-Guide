/*
    p. 165
    Simple automated telephone directory
    Takes a person name as a command line argument and displays a telephone number.
    If no CL argument given, displays usage.
    If more than 1, only displays the first one.
 */


package Ch5_More_Data_Types_And_Operators;

public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}
        };

        int i;

        if (args.length != 1)
            System.out.println("Please enter command line argument. Usage: java Phone <name>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0]+ ": " + numbers[i][1]);
                    break;
                }
            }

            if (i == numbers.length) System.out.println("Name not found");
        }
    }
}
