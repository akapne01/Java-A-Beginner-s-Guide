package ExamCloud.Q3;


interface Gym {
   public void liftWait();
}

public class LambdaExpressionTest {

   public static void main (String as[]) {
      Gym gym = null;

//      gym = ()-> System.out.println("100 lbs");

      gym = ()->{
         System.out.println("100 lbs");
         System.out.println("50 lbs");
         System.out.println("25 lbs");
      };

      gym.liftWait();
   }

}
