package ExamCloud.Q3;

import java.util.*;

public class RefTest {
   public static void main(String[] args) {
      Object a = new String("Java Tiger");
      Object b = 99; // Autoboxed to Integer class
      System.out.println(b.getClass());
      Object c = new Vector<String>();
      a = c; // a is now referring to c
      b = a; // since a refers to c, b now refers to c as well
      /**
       * All 3 references now refer to the same object.
       */
      System.out.println(a.hashCode());
      System.out.println(b.hashCode());
      System.out.println(c.hashCode());

   }

}
