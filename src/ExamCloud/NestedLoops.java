package ExamCloud;

public class NestedLoops {

   public static void main(String[] args) {


   outer: for (int x=0; x <2; x++) {
      middle:
      for (int y = 0; y < 2; y++) {
         for (int z = 0; z < 2; z++) {
            if (y == x) {
               System.out.println("x= "+ x + " y="+y+" z= " + z );
               break middle;
            }
         }
      }

   }
}}
