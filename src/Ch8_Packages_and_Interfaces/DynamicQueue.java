package Ch8_Packages_and_Interfaces;

/*
 * p. 293
 * Try this 8-1
 * Dynamic Queue
 */
public class DynamicQueue implements QuableChars {
    private char queue[];
    private int putIndexLocation;
    private int getIndexLocation;

//    private boolean full = (putIndexLocation + 1 == getIndexLocation) || ((putIndexLocation == queue.length - 1) && getIndexLocation == 0);

    public DynamicQueue(int size) {
        queue = new char[size];
        putIndexLocation = getIndexLocation = 0;
    }

    private void doubleQueueSize() {
        char increasedQueue[] = new char[queue.length * 2];
        // copy elements into the new queue
        System.arraycopy(queue, 0, increasedQueue, 0, queue.length);
        // Reassign the reference of the array
        queue = increasedQueue;
    }

    // Put char in the queue
    public void putChar(char ch) {
        boolean endReached = (getIndexLocation == queue.length) || (putIndexLocation == queue.length);
        if (endReached) {
            doubleQueueSize();
        }
        queue[putIndexLocation++] = ch;
    }

    // Get a char from the queue
    public char getChar() {
        boolean empty = getIndexLocation == putIndexLocation;
        if (empty) {
            System.out.println(" - Queue is empty!");
            return (char) 0;
        }
        return queue[getIndexLocation++];
    }
}
