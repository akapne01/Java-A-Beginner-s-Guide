/*
    p. 149
    A Queue Class
    Try This 5-2
    Queue is data structure. Uses concept FIFO: first in first out
    Data engine => storage and retrieval provided by data structure itself
    Consumptive operations => PUT and GET
        Put => Puts element at the end of queue
        Get => Retrieves the first element
    Consumptive operations => once the element has been retrieved, it cannot be retrieved again
    2 types of Queues => Circular and Non-circular
    Circular => reuse locations
    Non-Circular => Does nor reuse locations and can become exhausted
    For simplicity sake this program uses Non-circular locations
 */
package Ch5_More_Data_Types_And_Operators;

class Queue {
    char q[]; // holds the queue
    int putloc, getloc; //  put and get indices

    // Constructor
    Queue(int size) {
        q = new char[size]; // allocate memory for the queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get a char from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Que is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }


} // class Queue


/*
    Demonstrate the queue class
 */
public class QDemo {
    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;

        System.out.println("Using the bigQ to store the alphabet.");
        // put some numbers into bigQ
        for (int i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display elements from the bigQ
        System.out.println("Contents of bigQ: ");
        for (int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate error.");
        // Now use smallQ to generate some errors
        for (int i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (int i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }

    } // m
} // class QDemo
