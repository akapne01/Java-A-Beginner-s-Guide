/*
    p. 191
    An improved queue class for characters using access modifiers
    Try This 6-1
 */
package Ch6_Methods_Classes_Closer_Look;

class Queue {
    // these members are not private
    private char q[]; // this array holds the queue
    private int putloc, getloc; // put and get indices

    Queue(int size) {
        q = new char[size]; // allocate memory of the queue
        putloc = getloc = 0;
    }

    // put characters into queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue test = new Queue(10);

        // test.q[0] = 99; // wrong
        // test.putloc = -100; // won't work
    }

}
