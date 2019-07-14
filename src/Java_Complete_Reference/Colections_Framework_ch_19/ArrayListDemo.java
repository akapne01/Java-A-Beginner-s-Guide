package Java_Complete_Reference.Colections_Framework_ch_19;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * p. 552
 * Demonstrates ArrayList
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.println("Initial size of a1: " + a1.size());

        // Add elements to ArrayList
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");

        System.out.println("Size of a1 after additions: " + a1.size());

        // Display the ArrayList
        System.out.println("Contents of a1: " + a1);

        // Remove elements from the ArrayList
        a1.remove("F");
        a1.remove(2);

        System.out.println("Size of a1 after deletions: " + a1.size());
    }
}
