package ExamCloud.Q3;

public class MyClass1 {
   int subTotal;
   static int total;

   public void calculate() {
      int local;
      local = this. total;
      local = this. subTotal;
      this.total = total;
//      this.local = 4; xNC because this can't be used with local variables
//      this = new MyClass1(); xNC this reference can't be changed
   }
}
