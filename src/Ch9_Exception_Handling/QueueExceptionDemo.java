package Ch9_Exception_Handling;

public class QueueExceptionDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;

        try {
            // overrun the queue
            for (int i = 0; i < 11; i++) {
                System.out.print("Attempting to store: " + (char) ('A' + i));
                q.putChar((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // over-empty the queue
            for (int j = 0; j < 11; j++) {
                System.out.print("Getting the next char: ");
                ch = q.getChar();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

    }
}
