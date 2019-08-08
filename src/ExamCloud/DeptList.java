package ExamCloud;

import java.util.ArrayList;

public class DeptList {

   public static void main(String[] args) {

      ArrayList depNoList = new ArrayList<Integer>();
      depNoList.add(0);
      depNoList.add(1);
      depNoList.add(5);
      depNoList.add(19);
      depNoList.add(101);
      depNoList.add(600);

      for (Object deptNo: depNoList) {
         System.out.print(depNoList+" ");

         if (deptNo.equals(5))
            break;
      }
   }
}
