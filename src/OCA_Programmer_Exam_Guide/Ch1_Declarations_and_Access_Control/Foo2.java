package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
// p 51. and 57
class Foo2 {
    int size = 27;
    // Constructor (doesn't have return type
    protected Foo2() {}

    // Badly named method, does have return type
    protected void Foo2() {}

    // Legal Constructors
//    Foo2() {}
    private Foo2(byte b) {}
    Foo2(int x) {}
    Foo2(int x, int... y) {}

    // Illegal constructors
//    void Foo2() {} => (xNC) has return type, is a method
//    Foo() {} => (xNC) Name doesn't match the class name
//    Foo2(short s); => (xNC) Looks like abstract method, doesn't have {}
//    static Foo2(float f) {} => (xNC) Can't be static
//    final Foo2(long x) {} => (xNC) Can't be final
//    abstract Foo(char c) {} => (xNC) Can't be abstract
//    Foo2(int... x, int t) {} => Var-arg can only be the last parameter
    public void setSize(int size) {
        size = size;
//        this.size = size; ==> Above is equal to, for readability this used
        System.out.println(size);
    }

    public static void main(String[] args) {

        new Foo2() .setSize(26);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
