package ExamCloud.Q3;

enum AccountType {
   SILVER {double interestRate() {return 10.0;}},
   GOLD {double interestRate() {return 20.0;}},
   DIAMOND {double interestRate() {return 30.0;}};
   abstract double interestRate();
}

public class Test2 {
   public static void main(String[] args) {
      for (AccountType op : AccountType.values()) {
         System.out.println(op.interestRate());
      }
   }
}
