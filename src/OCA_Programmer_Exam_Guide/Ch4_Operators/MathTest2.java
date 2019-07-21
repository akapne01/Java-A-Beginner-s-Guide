package OCA_Programmer_Exam_Guide.Ch4_Operators;

/**
 * p. 248
 * Increment and Decrement Operators
 */
public class MathTest2 {
    static int players = 0;

    public static void main(String[] args) {
        System.out.println("players online: " + players++);
        System.out.println("The value of players is " + players);
        System.out.println("the value of players is now " + ++players);
    }
}
