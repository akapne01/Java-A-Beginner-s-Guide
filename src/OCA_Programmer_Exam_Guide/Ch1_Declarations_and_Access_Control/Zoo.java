package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

/*
 * p. 31
 */

class Zoo {
    public String coolMethod() {
        return "Wow baby";
    }
}

class Moo {
    public void useAZoo() {
        Zoo z = new Zoo();
        /*
         * If preceding line compiles, Moo has access to Zoo class
         */
        System.out.println("A Zoo says, " + z.coolMethod());
        // The preceding line works, because Moo can access the public method
    }
}

class CoolMoo extends Zoo {
    public void useMyCoolMethod() {
        // Does an instance of Moo can inherit the coolMethod()?
        System.out.println("Moo says, " + this.coolMethod());
        // The preceding line works, because Moo can inherit the public method
        // Can instance of Moo invoke coolMethod() on an instance of Zoo?
        Zoo z = new Zoo();
        System.out.println("Zoo says, " + z.coolMethod());
        // coolMethod() is public, so Moo can invoke it on a Zoo references
    }
}