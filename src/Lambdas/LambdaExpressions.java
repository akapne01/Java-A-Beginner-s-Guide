package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));
//        print(animals, new CanJump());
        System.out.println();
        print(animals, animal -> animal.canSwim());
        System.out.println();
        print(animals, animal -> !animal.canSwim());
        System.out.println();
        print(animals, (Animal a) -> {
//            Animal a = new Animal("cat", true, false);
            System.out.println("checking animal = " + a.getType());
            return a.canJump();
        });

        System.out.println();
        print(animals, a -> {
            return a.canJump();
        });


        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);

        print(fish, rabbit, (first, second) -> first.canSwim() && second.canSwim());
        print(fish, dog, (f, s) -> f.canSwim() && s.canSwim());

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anothony");
        names.add("Jimmy");
        names.add("Timmy");

        System.out.println("names = " + names);

        /**
         * removes all elements in the list that start with 'J'
         * Both below statements are equal
         */
        names.removeIf(name -> name.charAt(0) == 'J');
//        names.removeIf((String str) -> {return str.charAt(0) == 'J';});
        System.out.println("After filter names = " + names);


    }

    private static void print(List<Animal> animals, Predicate<Animal> filter) {
        for (Animal animal : animals) {
            if (filter.test(animal)) {
                System.out.println(animal.getType());
            }
        }
        System.out.println();
    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

}
