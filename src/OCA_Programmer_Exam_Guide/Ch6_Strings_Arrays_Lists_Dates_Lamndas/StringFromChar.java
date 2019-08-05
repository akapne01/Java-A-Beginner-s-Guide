package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFromChar {

   public static void main(String[] args) {
      String myStr = "good";
      char[] myCharArr = {'g', 'o', 'o', 'd' };

//      String newStr = null;
      String newStr = "";
      for(char ch : myCharArr){
         newStr = newStr + ch;
      }

      String a= "a";
      String b = "a";

      /**
       * Compile time vs Runtime
       * Runtime = Stirngs in the same pool are not the same
       * Compile time => Same reference assigned.
       *
       */
      System.out.println(newStr);
      System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
      System.out.println(a == b);

      String[] arr = new String [2];
      for(String str : arr){
         System.out.println(str);
      }
      System.out.println(Arrays.toString(arr));

      int ind = 0;
      for(String str : arr){
//         str.concat(str+" "+ind);
         ind++;
      }

      ArrayList s = new ArrayList();
      s.add("a");
      s.add("b");
      s.add("c");
      List s2 = new ArrayList(s.subList(1,1));
      s.addAll(s2);
      System.out.println(s);
   }
}
