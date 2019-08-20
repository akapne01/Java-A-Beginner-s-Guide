package WhizLabsTests.practice_2;

class Wrap {
   Double d = 10.0;
   int x = 10;
   int[] s = new int[10];
}

public class P2_54 {
   public static void main(String[] args) {
      /**
       * At the end of these program, how many objects will be
       * eligible for GC?
       *
       * We have a instance of the Wrap class and at the end of this
       * program, there are no references pointing to this object anymore.
       *
       * But, Wrap class has 3 fields and 2 of them are objects + 1 primitive.
       *
       * So this makes for 3 objects unreachable by the end:
       * 1) Wrap class object
       * 2) It's field Double
       * 3) it's field int[]
       */
      Wrap w = new Wrap();
      w = null;
   }
}
