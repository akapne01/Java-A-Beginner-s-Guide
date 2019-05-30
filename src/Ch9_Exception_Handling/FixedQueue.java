package Ch9_Exception_Handling;

public class FixedQueue implements ICharQ {
    private char queue[];
    private int putIndexLocation;
    private int getIndexLocation;

    // Constructs an empty queue from size
    FixedQueue(int size) {
        queue = new char[size]; // allocates memory for the queue
        putIndexLocation = getIndexLocation = 0;
    }
    public void putChar(char ch) throws QueueFullException {
        if (putIndexLocation == queue.length) {
            throw new QueueFullException(queue.length);

        }
        queue[putIndexLocation++] = ch;
    }

    public char getChar() throws QueueEmptyException {
        if (getIndexLocation == putIndexLocation) {
            throw new QueueEmptyException();
        }
        return queue[getIndexLocation++];
    }
}
