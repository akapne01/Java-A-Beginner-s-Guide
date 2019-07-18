package OCA_Programmer_Exam_Guide.Ch3_Assignments;

/**
 * p. 193
 * Variable scope
 */
public class VariableScope {
   /**
    * s = static variable
    * x = instance variable
    * y = local variable (method local variable)
    * z = block variable
    * x2 = an init block variable, a flavour of local variable
    * x3 = constructor variable, a flavour of local variable
    *
    * There are 4 scopes:
    *
    * (1) Static -> longest scope = Class
    * Created when class = loaded, survive as long as class stays loaded in JVM.
    *
    * (2) Instance variables -> next most lived
    * Created: when new instance is created
    * live until instance is removed.
    *
    * (3) Local variables
    * Live as long as the method remains on the stack.
    * Local variables can be alive and still be 'out of scope'.
    *
    * (4) Block variables
    * Live only as long as the block is executing.
    */

}

class Layout {               // class

   static int s = 343;              // static variable
   int x;                           // instance variable

   {
      x = 7;
      int x2 = 5;
   }                                // initialization block

   Layout() {                       // constructor
      x += 8;
      int x3 = 6;
   }

   void doStuff() {                 // method
      int y = 0;                    // local variable (method local variable)
      for (int z = 0; z < 4; z++) { // 'for' code block
         y += z + x;
      }
   }
}

