package Ch7_Inheritance;

/*
 * p. 257
 * Dynamic method dispatch = call to an overridden method is resolved at run time
 * rather than compile time
 */

class Sup {
    void who() {
        System.out.println("who() in Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("sho() in Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() in Sub2");
    }
}


public class DynamicMethodDispach {
    public static void main(String[] args) {
        Sup sup = new Sup();
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        // Reference of type Super class
        Sup supRef;

        // Which version of who() is called is determined at run time by type of the
        // object being referred to
        supRef = sup;
        supRef.who();

        supRef = sub1;
        supRef.who();

        supRef = sub2;
        supRef.who();

    }
}
