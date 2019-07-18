package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;
// p. 123
public class BeachBall extends Ball {
    @Override
    public void bounce() {
        // Interesting BeachBall specific Bounce code

    }

    @Override
    public void setBounceFactor(int bf) {
        // Clever beachball specific code for setting a bounce factor.

    }
    /**
     * Even though we don't say in the class declaration above,
     * BeachBall implements Bounceable, since beachball's abstract
     * superclass ball implements boouncable.
     *
     * If class Ball would have any abstract methods, they would
     * have to be implemented here as well.
     */


}
