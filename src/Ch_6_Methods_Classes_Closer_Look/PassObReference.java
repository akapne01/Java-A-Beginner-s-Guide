/*
    p. 195
    Objects are passed through their reference

    Output:
    ab.a and ob.b before call: 15 20
    ab.a and ob.b after call: 35 -20
 */
package Ch_6_Methods_Classes_Closer_Look;

class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    /*
    Pass an object. Now, ob.a ans ob.b in object used in call will be changed.
     */
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

public class PassObReference {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ab.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ab.a and ob.b after call: " + ob.a + " " + ob.b);

    }
}
