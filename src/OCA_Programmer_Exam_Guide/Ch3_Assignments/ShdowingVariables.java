package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 208
public class ShdowingVariables {

}

class FooSh {
    static int size = 7;

    static void changeIt(int size) {
        size = size + 200;
        System.out.println("Size in changeIt is " + size);
    }

    public static void main(String[] args) {
        FooSh f = new FooSh();
        System.out.println("size = " + size);
        changeIt(size);
        System.out.println("size after changeIt is " + size);
    }
}

class Barsh {
    int barNum = 28;
}

class FooBar {
    Barsh mybar = new Barsh();

    void changeIt(Barsh mybar) {
        mybar.barNum = 99;
        System.out.println("myBar.barNum in changeIt is " + mybar.barNum);
        mybar = new Barsh();
        mybar.barNum = 420;
        System.out.println("mybar.barNum in changeIt is now " + mybar.barNum);
    }

    public static void main(String[] args) {
        FooBar fb = new FooBar();
        System.out.println("fb.mybar.barNum is " + fb.mybar.barNum);
        fb.changeIt(fb.mybar);
        System.out.println("fb.mybar.barNum after changeIt is " + fb.mybar.barNum);

    }
}
