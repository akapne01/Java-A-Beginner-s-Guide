/*
    Objects can be passed to methods
    p. 191
 */
package Ch_6_Methods_Classes_Closer_Look;

class Block {
    int a, b, c, volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if object defines the same block
    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        return false;
    }

    // Return true if object has the same volume
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) return true;
        return false;
    }
}

// Demonstrates Block class
public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }
}
