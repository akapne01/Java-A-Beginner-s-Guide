package OCA_Programmer_Exam_Guide.Ch3_Assignments;

public class ScopeErrors {
/**
 * p. 194
 * Scope errors:
 * 1) Variable is shadowed and two scopes overlap
 * 2) The most common reason for scoping errors is an attempt to access
 * variable that is not in scope.
 *
 * Pay attention to scoping errors.
 *
 * You might see them in:
 * 1) Switch
 * 2) Try-catch
 * 3) for
 * 4) do
 * 5) while
 */
}

class AccessInstanceVariableFromStaticContext {
   int x = 5;

   /**
    * Instance variable can't be accessed from static context
    */
   public static void main(String[] args) {
//      x++; => (xNC) x is an instance variable.
   }
}

class AccessLocalVariableFromInvokingMethod {
   public static void main(String[] args) {
      AccessLocalVariableFromInvokingMethod s = new AccessLocalVariableFromInvokingMethod();
      s.go();
   }

   void go() {
      int y = 5;
      go2(); // once go2() completes, y is back in scope.
      y++;
   }

   void go2() {
//      y++; => (xNC) y is a local variable for go method and is not in scope in go2().
   }
}

class UsingBlockVariableAfterBlockCompleted {
   void go3() {
      for (int z = 0; z < 5; z++) {
         boolean test = false;
         if (z == 3) {
            test = true;
            break;
         }
      }
//      System.out.println(test); => (xNC) test is an ex-variable, it has ceased to be.
   }
}
