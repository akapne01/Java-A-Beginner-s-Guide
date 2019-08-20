package ExamCloud.Q3;

class Account {

}

public class SavingsAccount extends Account {

   public static void main(String[] args) {
      Account a = new Account();
      SavingsAccount b = new SavingsAccount();

//      b = a;
//      b = (Account)a;
      /**
       * Subclass object can be assigned to supertype without cast.
       */
      a = (SavingsAccount)b; // Superclass reference variable can refer to any of the subclass types.
      a = b;
      a = (Account)b;

   }
}
