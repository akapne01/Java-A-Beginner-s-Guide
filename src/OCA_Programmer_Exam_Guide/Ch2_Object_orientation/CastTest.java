package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;
// p 188

public class CastTest {
    public static void main(String[] args) {
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for (Animal animal : a) {
            animal.makeNoise();
            if (animal instanceof Dog) {
                /**
                 * Casting the reference variable to dog to be able to access methods
                 * defined in Dog class.
                 */
                ((Dog) animal).playDead();
            }
        }
    }
}

class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        /**
         * Compiles, but throws Runtime Exception. Because
         * in this case animal object is not really a dog.
         * Compiler has to trust us, there is no way compiler
         * knows right now.
         * Compiler must allow things that might possibly work
         * at runtime.
         * If compiler knows with certainty that the cast could not
         * possibly work, compilation will fail.
         */
//        Dog dog = (Dog) animal; // => (xNC) throws Runtime Exception.
//        String s = (String) animal; ==> (xNC) animal can'r EVER be a String

        Dog d = new Dog();
        /**
         * Upcast is implicit. Anything that Animal can do, Dog can also do.
         * Anyone with animal reference can safely call Animal methods on a
         * Dog instance.
         */
        Animal a1 = d; // Upcast is ok with no explicit cast
        Animal a2 = (Animal) d; // this cast is redundant

    }
}
