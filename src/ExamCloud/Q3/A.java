package ExamCloud.Q3;

public class A {
   int i;

   A(int i) {
      this.i = i;
   }

   protected void finalize() {
      System.out.println(i);
   }

   public static void main(String[] args) {
      A a1 = new A(5);
      a1.finalize();
      A a2 = new A(10);
      a1 = null;
      a2 = null;
      System.gc();

   }
}
