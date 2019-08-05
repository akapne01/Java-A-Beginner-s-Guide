package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

public class TestLog {


   public static void main(String[] args) {
      String mStr = "123";
      long z = 1_0L;
//      long m = new Long(mStr);
      long m =  Long.valueOf(mStr).longValue();
      System.out.println(m);

   }
}
