package Ch8_Packages_and_Interfaces;

public class FixedQueue implements QuableChars {
    private char queue[];
    private int putIndexLocation;
    private int getIndexLocation;

    // Constructs an empty queue from size
    FixedQueue(int size) {
        queue = new char[size]; // allocates memory for the queue
        putIndexLocation = getIndexLocation = 0;
    }
    public void putChar(char ch) {
        if (putIndexLocation == queue.length) {
            System.out.println(" - Queue is full!");
            return;
        }
        queue[putIndexLocation++] = ch;
    }

    public char getChar() {
        if (getIndexLocation == putIndexLocation) {
            System.out.println(" - Queue is empty!");
            return (char) 0;
        }
        return queue[getIndexLocation++];
    }
}
