package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

interface Foo {
    /**
     * Interface constant. Implicitly public static final
     */
    int BAR = 42;
    public int x =1;
    int y = 1;
    static int z = 1;
    final int a = 1;
    public static int b = 1;
    public final int c = 1;
    static final int d = 1;
    public static final int e = 1;
    void go();

    /**
     * Default Interface methods
     * Implicitly public. Public keyword is redundant.
     * Default methods can't be marked:
     *  x private
     *  x protected
     *  x static
     *  x final
     *  x abstract
     */
    default int m1() {return 1;}
    public default void m2() {;}
//    static default void m3() {;} ==> xNC because default methods can't be static
//    default void m4(); ==> xNC because default methods need to have a concrete method body
}
