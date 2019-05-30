package Ch8_Packages_and_Interfaces;

/*
 * p. 292
 * A circular queue
 */

public class CircularQueue implements QuableChars {
    private char queue[];
    private int putIndexLocation;
    private int getIndexLocation;

    // Construct an empty queue
    public CircularQueue(int size) {
        queue = new char[size+1]; // allocate the memory for the queue
        putIndexLocation = getIndexLocation = 0;
    }

    // put chars into the queue
    /**
     * Queue is full if:
     * 1) putIndexLocation is one less than getIndexLocation
     * 2) putIndexLocation is at the end of the array and getIndexLocation
     * is at the beginning
     */
    public void putChar(char ch) {
        boolean full = (putIndexLocation+1 == getIndexLocation) || ((putIndexLocation == queue.length - 1) && getIndexLocation == 0);
        if (full) {
            System.out.println(" - Queue is full!");
            return;
        }
        queue[putIndexLocation++] = ch;

        boolean loopBack = putIndexLocation == queue.length;
        if (loopBack) {
            putIndexLocation = 0;
        }
    }

    // Get character from the queue
    public char getChar() {
        boolean empty = getIndexLocation == putIndexLocation;
        if (empty) {
            System.out.println("Put and get loc are: " + putIndexLocation + " " + getIndexLocation);
            System.out.println("Queue is empty!");
            return (char) 0;
        }

        char ch = queue[getIndexLocation++];
        boolean endReached = getIndexLocation == queue.length;
        if (endReached) {
            getIndexLocation = 0;
        }
        return ch;
    }


}
