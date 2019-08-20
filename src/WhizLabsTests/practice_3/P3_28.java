package WhizLabsTests.practice_3;

public class P3_28 {
   public static void main(String[] args) {

      Loop1:for(int x = 0; x<5;x++){
      if(x==3)continue ;
         for (int y = 0; y < 3; y++) {
            if(y==1)continue Loop1;
            System.out.print(y);
         }
      }
   }
}
