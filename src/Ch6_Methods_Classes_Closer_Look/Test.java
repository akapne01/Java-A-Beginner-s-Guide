
package Ch6_Methods_Classes_Closer_Look;


class TestPi {

    public static double pi = 3.14;
    // double pi;

    TestPi() {
        double pi = 9.0;
        this.pi = pi;
        System.out.println(pi);
    }

    void printPi() {

        System.out.println(this.pi);
        System.out.println(pi);

    }


    public static void main(String[] args) {
        TestPi test = new TestPi();
        test.printPi();
    }

}
