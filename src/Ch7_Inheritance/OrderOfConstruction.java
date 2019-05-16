package Ch7_Inheritance;

/*
 * p. 249
 * Demonstrate when constructors are executed
 *
     * Output:
    Constructing A
    Constructing B
    Constructing C

 */
class AA {
    AA() {
        System.out.println("Constructing A");
    }
}

class BB extends AA {
    BB() {
        System.out.println("Constructing B");
    }
}

class C extends BB {
    C() {
        System.out.println("Constructing C");
    }
}


public class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}
