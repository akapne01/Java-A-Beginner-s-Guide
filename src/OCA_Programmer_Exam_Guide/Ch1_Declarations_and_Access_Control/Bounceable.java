package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

public interface Bounceable {


    /**
     * public abstract keywords are redundant in the interface
     * code still compiles.
     * Interface methods are implicitly PUBLIC & ABSTRACT.
     * Except, when they are declared as DEFAULT OR STATIC.
     */
    public abstract void bounce();

    void setBounceFactor(int bf);

    /**
     * final, private, protected xNC
     */
//    final void jump(); ==> xNC
//    private void jump(); ==> xNC
//    protected void jump(); ==> xNC
}
