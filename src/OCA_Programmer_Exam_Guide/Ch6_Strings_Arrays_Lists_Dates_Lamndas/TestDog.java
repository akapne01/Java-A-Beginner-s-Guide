package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

import java.util.*;
import java.util.function.Predicate;

/**
 * p. 391
 * Simple Lambdas
 */

class Dog {
   String name;
   int weight;
   int age;

   // Constructor assigns a name, weight and age
   Dog(String name, int weight, int age) {
      this.name = name;
      this.weight = weight;
      this.age = age;
   }

   String getName() {
      return name;
   }

   int getWeight() {
      return weight;
   }

   int getAge() {
      return age;
   }

   public String toString() {
      return name;
   }
}

/**
 * Create and populate an ArrayList of Dog objects
 * Invoke a few "queries" on the ArrayList
 * Declare a couple of "query" methods.
 */

public class TestDog {
   public static void main(String[] args) {

      ArrayList<Dog> dogs = new ArrayList<>();
      dogs.add(new Dog("boi", 30, 6));
      dogs.add(new Dog("tyri", 40, 12));
      dogs.add(new Dog("charis", 120, 7));
      dogs.add(new Dog("aiko", 50, 10));
      dogs.add(new Dog("clover", 35, 12));
      dogs.add(new Dog("mia", 15, 4));
      dogs.add(new Dog("zooey", 45, 8));

      System.out.println("all dogs " + dogs);
      System.out.println("min age 7 " + minAge(dogs, 7).toString());
      System.out.println("max weight " + maxWeight(dogs, 40).toString());

      System.out.println("age >= 7 " + dogQuery(dogs, d -> d.getAge() >= 7));
      System.out.println("weight <= 40 " + dogQuery(dogs, d -> d.getWeight() <= 40));
   }

   static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
      ArrayList<Dog> result1 = new ArrayList<>();

      for (Dog d : dogList) {
         if (d.getAge() >= testFor) {
            result1.add(d);
         }
      }
      return result1;
   }

   static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor) {
      ArrayList<Dog> result1 = new ArrayList<>();

      for (Dog d : dogList) {
         if (d.getWeight() <= testFor) {
            result1.add(d);
         }
      }
      return result1;
   }

   static ArrayList<Dog> dogQuery(ArrayList<Dog> dogList, Predicate<Dog> expr) {
      // Do an 'on the fly' boolean query
      ArrayList<Dog> result1 = new ArrayList<>();
      for (Dog d : dogList) {
         if (expr.test(d)) {
            result1.add(d);
         }
      }
      return result1;
   }
}
