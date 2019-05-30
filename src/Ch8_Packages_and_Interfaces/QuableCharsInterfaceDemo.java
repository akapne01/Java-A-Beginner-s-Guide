package Ch8_Packages_and_Interfaces;

/*
 * p. 294 => Look at the Circular queue
 */

public class QuableCharsInterfaceDemo {
    public static void main(String[] args) {
        // Creating queues
        FixedQueue fixedQueue = new FixedQueue(10);
        DynamicQueue dynamicQueue = new DynamicQueue(5);
        CircularQueue circularQueue = new CircularQueue(10);

        QuableChars quableChars;
        char ch;

        quableChars = fixedQueue;
        // Put some chars in the fixed queue
        for (int i = 0; i < 10; i++) {
            quableChars.putChar((char) ('A' + i));
        }

        // Show Queue
        System.out.println("Contents of the fixed queue");
        for (int i = 0; i < 10; i++) {
            ch = quableChars.getChar();
            System.out.print(ch);
        }
        System.out.println();

        quableChars = dynamicQueue;
        // Put some chars in the dynamic queue
        for (int i = 0; i < 10; i++) {
            quableChars.putChar((char) ('Z' - i));
        }

        // Show Queue
        System.out.println("Contents of the dynamic queue");
        for (int i = 0; i < 10; i++) {
            ch = quableChars.getChar();
            System.out.print(ch);
        }
        System.out.println();

        quableChars = circularQueue;
        // Put some chars in the fixed queue
        for (int i = 0; i < 10; i++) {
            quableChars.putChar((char) ('A' + i));
        }

        // Show Queue
        System.out.println("Contents of the circular queue");
        for (int i = 0; i < 10; i++) {
            ch = quableChars.getChar();
            System.out.print(ch);
        }
        System.out.println();

        // Put more characters in the circular queue
        for (int i = 10; i < 20 ; i++) {
            quableChars.putChar((char) ('A' + i));
            System.out.println("putting: " + (char) ('A' + i));
        }

        // Show the queue
        System.out.println("Contents of the circular queue");
        for (int i = 0; i < 20; i++) {

            ch = quableChars.getChar();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("\n Store and consume from circular queue!");
        for (int i = 0; i < 20; i++) {
            quableChars.putChar((char) ('A' + i));
            ch = quableChars.getChar();
            System.out.print(ch);
        }
    }
}
