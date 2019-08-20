package WhizLabsTests.practice_3;

public class P3_58 {
   public static void main(String[] args) {
      /**
       * new Teacher("name") => xNC because constructor is private
       */
//   Person p2 = new Teacher ("name");
      Person p1 = new Teacher();
      System.out.println();
      Student s1 = new Student();
   }

}

class Person {
   Person(){
      System.out.println("Person Class constructor");
   }

   static {
      System.out.println("Person Static Block");
   }
}

class Student extends Person {
   Student() {
      System.out.println("Student Constructor");
   }
}

class Teacher extends Person {
   Teacher() {
      System.out.println("Teacher no args constructor");
   }

   private Teacher(String s) {
      System.out.println("Teacher string constructor");
   }
}
