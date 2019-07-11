package Ch14_Lambda_Expressions_Method_References;

/**
 * p. 495
 * Demonstrate 2 simple lambda expressions.
 */

// A functional interface (FI)
interface MyValue {
   double getValue();
}

// Another functional interface
interface MyParamValue {
   double getValue(double v);
}

class LabdaDemo {
   public static void main(String[] args) {

      MyValue myVal; // declare an interface reference

      /**
       * Here, the lambda expression is simply a constant expression.
       * When it is assigned to myVal, a class instance is constructed
       * in which the lambda expression implements the getValue() method
       * in MyValue.
       */
      myVal = () -> 98.6;

      /**
       * Call getValue(), which is provided by previously assigned lambda
       * expression.
       */
      System.out.println("A constant value: " + myVal.getValue());

      /**
       * Now, create a parametrized lambda expression and assign it to a
       * MyParamValue reference. This lambda expression returns the
       * reciprocal of its argument.
       */
      MyParamValue myParamValue = (n) -> 1.0 / n;

      /**
       * Call getValue through myParamValue reference.
       */
      System.out.println("Reciprocal of 4 is " + myParamValue.getValue(4.0));
      System.out.println("Reciprocal of 8 is " + myParamValue.getValue(8));

      /**
       * A lambda expression must be compatible with the method defined by the
       * functional interface. Below, doesn't compile.
       */
//      myVal = () -> "three"; ==> (xNC) String is not compatible with double
//      myParamValue = () -> Math.random(); ==> (xNC) Parameters are required!

   }
}
