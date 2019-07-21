package OCA_Programmer_Exam_Guide.Ch4_Operators;

/**
 * p. 244
 * Instanceof can only compare types in the same hierarchy.
 */

class Cat {}

public class Dog {
    public static void main(String[] args) {

        Dog d = new Dog();
//        System.out.println(d instanceof Cat); => (xNC) Inconvertible types
    }
}
