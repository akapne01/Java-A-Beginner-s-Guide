package OCA_Programmer_Exam_Guide.Ch_2_Object_orientation;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        /**
         * Both a and b refer to Animal superclass.
         * JVM at runtime assigns the correct method
         * to use, based on the object type.
         */
        a.eat();
        b.eat();

        Horse he = new Horse();
        he.eat("apples");

        Animal a2 = new Animal();
//        a2.eat("treats"); => (xNC) because only horse has overloaded method of eat

        Animal ah2 = new Horse();
        /**
         * (xNC) Compiler looks only at the reference and sees that Animal doesn't have
         * an eat() method that takes String. Compiler doesn't care that the actual
         * object might be a Horse at runtime.
         */
//        ah2.eat("Carrots");

        a.printYourself();
        System.out.println();
        b.printYourself();
//         b.buck(); // Can't be invoked, because Animal doesn't have this method.
    }
}

class Animal {
    public void eat() {
        System.out.println("Generic Animal Eating Generically.");
    }

    public void printYourself() {
        System.out.println("I am an Animal.");
    }

    void makeNoise() {
        System.out.println("generic noise");
    }
}

class Horse extends Animal {
    /**
     * When overriding superclass methods, access modifiers can't be
     * weaker. This is due to the polymorphism. Any object can have
     * either the same or it's superclasses reference variable. JVM
     * at runtime selects the correct method to use based on the
     * actual object itself. If it would be allowed for them to be
     * more restrictive, it would cause the meltdown of the program
     * at runtime.
     */
    public void eat() {
        System.out.println("Horse eating hay, oats, and horse treats.");
    }

    public void eat(String s) {
        System.out.println("Horse eating " + s);
    }

    public void buck() {
    }

    public void printYourself() {
        /**
         * Calls a superclass version of the printYourself() method
         * using keyword super.
         */
        super.printYourself();
        System.out.println("Hahaha, but also a horse");
    }
}

class Dog extends Animal {
    /* It (xNC), because it's not an override and not an overload */
//    public String eat() {
//        return "";
//    }

    /**
     * This method is overloaded and not overriden.
     */
    public void eat(String food) {
        System.out.println(food);
    }

    void makeNoise() {
        System.out.println("bark");
    }

    void playDead() {
        System.out.println("Roll over");
    }
}

class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the animal version.");
    }

    public void doStuff(Horse h) {
        System.out.println("In the Horse version.");
    }

    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animal = new Animal();
        Animal horseButAnimal = new Horse();
        Horse horse = new Horse();
        ua.doStuff(animal);
        ua.doStuff(horse);
        ua.doStuff(horseButAnimal);
    }
}


