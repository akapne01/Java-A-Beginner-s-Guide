/*
 * p. 205
 * Try this 6-2
 * Overloading the queue constructor
 * A Queue class from characters
 * Adding additional constructors
 */
package Ch6_Methods_Classes_Closer_Look;

class Queue2 {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // put and get indices

    // Construct an empty Queue given its size
    Queue2(int size) {
        q = new char[size]; // allocate memory from the queue
        putloc = getloc = 0;
    }

    // Construct a queue from the queue
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copy elements
        for (int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Construct a Queue with initial values
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // Put a characters into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        } // if

        q[putloc++] = ch;
    } // put

    // Get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        } //if

        return q[getloc++];
    } // get
}


// Demonstrates the Queue2 class
public class QDemo2 {
    public static void main(String[] args) {
        // construct 10 element empty queue
        Queue2 q1 = new Queue2(10);

        char name[] = {'T', 'o', 'm'};
        // construct queue from array
        Queue2 q2 = new Queue2(name);

        char ch;

        // put some characters into q1
        for (int i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // construct queue from another queue
        Queue2 q3 = new Queue2(q1);

        // Show the queues
        System.out.print("Contents of the q1: ");
        for (int i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (int i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");


        System.out.print("Contents of q3: ");
        for (int i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

        System.out.println();
    } //


} // class
