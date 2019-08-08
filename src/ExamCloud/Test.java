package ExamCloud;

public class Test {
   public static void main(String[] args) {
      A1:
      for (int i = 0; i < 2; System.out.println("A1: i= " + ++i)) {
         A2:
         for (int j = -1; j < 2; System.out.println("A2: j= " + ++j)) {
            A3:
            for (int k = -1; k < 2; System.out.println("A3: k= " + ++k)) {
               System.out.println(" K " + k);
               if ((i++ - k++) == 2) {
                  System.out.println("i= " + i + " k= " + k);
                  break;
               }
            }
         }
      }

      /** Array declarations - size associated with instance not reference */
//      int i[] = new[2] { 14, 8 } ; xNC
//      int i[4] = {11, 2, 34, 9}; xNC
      int[] myArray[] = {{100, 8}, {19}, {}, {15, 16, 35}};
      int i[][] = new int [][] {{81, 62, 88}, {48, 5, 6}} ;
      int j[][] = {{16, 21}, new int[2]};


   }
}
