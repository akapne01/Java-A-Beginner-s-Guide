package ExamCloud;

import java.util.*;

public class PayRoll {

   /**
    * All instances of a generic class have the same runtime class,
    * regardless of their actual type parameters.
    * Since no data have been added to the lists, they are meaningfully
    * equal as well.
    */

   public static void main(String[] args) {
      Vector<String> employeeList = new Vector<>();
      Vector<Integer> employeeIdList = new Vector<>();
      Vector<Object> emplyeeProfileList = new Vector<>();

      System.out.println(employeeList.getClass());
      System.out.println(employeeIdList.getClass());
      System.out.println(employeeList.equals(emplyeeProfileList));
      System.out.println(employeeIdList);
      System.out.println(employeeList);
   }

}
