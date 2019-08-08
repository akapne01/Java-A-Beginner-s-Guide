package ExamCloud;

class Customer {
   String customerID;

   private String getCustomerID() {
      return customerID;
   }
}

public class CreditCardCustomer extends Customer {

   /**
    * getCustomerID() method is private and only accessible in the
    * Customer class. Because Brad is referring to the Customer
    * reference variable, but actually is a CreditCardCustomer instance.
    * As far as JVM is concerned, Customer doesn't have a getCustomerID()
    * method and, therefore, there is a compilation error.
    * However, if the actual CreditCardCustomer reference variable is used,
    * in that case method is found and all works as expected.
    */
   public static void main(String[] args) {
      Customer brad = new CreditCardCustomer();
      CreditCardCustomer alan = new CreditCardCustomer();
      brad.customerID = "12122";
      System.out.println(alan.getCustomerID());
//      System.out.println(brad.getCustomerID());
   }

   String getCustomerID() {
      return customerID;
   }
}
