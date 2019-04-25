/*
p. 114
added method to the Vehicle class range()
 */

package Ch4_Introducing_Classes_Objects_Methods;

public class AddMethod {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        // assign values to the fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to the sport car
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.printRange(); // displays range of minivan

        System.out.print("Sports car can carry " + sportcar.passengers + ". ");
        sportcar.printRange(); // display range of sports car

        minivan.voidReturn();

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Minivan range is: " + range1);
        System.out.println("Sport car range is: " + range2);

        if (minivan.range() > sportcar.range()) System.out.println("Minivan has a greater range");
    }
}
