/*
  This is a program to check if it will run if class name is not matching
  the file name
*/

/*
  In this case Java compiler will create a class file that matches class
  name, and not the file name. In this case, you need to use java DifferentClass
  to run this file on the command line and not the file name
*/

class DifferentClass {
  public static void main(String[] args) {
    System.out.println("It still runs though!");
  }
}

class DifferentClass2 {
  public static void main(String[] args) {
    System.out.println("This is the second class on the same file, but should have 2 class files though!");
  }
}
