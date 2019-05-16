/*
    p. 108
    Defining a class
    This file defines 2 classes.
    1) Vehicle
    2) VehicleDemo
    VehicleDemo class creates an instance of the Vehicle class
    To access Vehicle class members or instance variables,
    dot operator is used, it links objects with the members
    of the class
    object.member

    Creates 2 separate bytecode .class files for each class separately

 */

package Ch4_Introducing_Classes_Objects_Methods;

/*
    Class is defined using keyword (class)
    Class definition creates a new data type
 */
class Vehicle {
    // instance variables
    int passengers;  // number of passengers
    int fuelcap;     // fuel capacity in gallons
    int mpg;         // fuel consumption in miles per gallon

    // No values given constructor => default values
    Vehicle() {
        passengers = 2;
        fuelcap = 2;
        mpg = 2;
    }

    // This is a constructor for Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Display the range
    void printRange() {
        System.out.println("Range is " + fuelcap * mpg);
    }

    // void method with return statement
    void voidReturn() {
        System.out.print("Void return method invoked: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i==5) {
                System.out.println();
                return; // stop at 5. Anything after return is not executed anymore
            }
        }
    }

    // returns range
    int range() {
        return mpg * fuelcap;
    }


    // gallons required for number of miles
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}


// this class declares an object of type Vehicle
public class VehicleDemo {
    public static void main(String[] args) {

        /*
        This declaration performs 2 functions:
        1) Declares a variable class type Vehicle. This variable doesn't define
        an object, it refers to the object.
        2) Declaration creates an instance of the object and assigns to minivan
        the reference to that object
         */
        Vehicle minivan = new Vehicle();

        int range;
        int distance = 252;
        double gallons;

        // assign values to the fields of minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range);

        // car 1 and car 2 refer to the same object in memory. Both are references to the objects
        Vehicle car1 = new Vehicle();
        car1.passengers = 9;
        Vehicle car2 = car1;

        // both are the same
        System.out.println(car1.passengers);
        System.out.println(car2.passengers);

        // Both equality checks return back True
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));

        Vehicle car3 = new Vehicle();
        car3.passengers = 8;

        // now car 2 and car 3 refer to the same object
        car2 = car3;
        System.out.println(car1.passengers);
        System.out.println(car2.passengers);
        System.out.println(car3.passengers);

        // Both equality checks return back True
        System.out.println("car1 == car 2: " + (car1 == car2));
        System.out.println("car3 == car 1: " + (car3 == car1));
        System.out.println("car2 == car 3: " + (car2 == car3));

        gallons = minivan.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles minivan needs " + gallons + " gallons of fuel.");

        Vehicle car = new Vehicle();
        System.out.println("Passengers are " + car.passengers);
        System.out.println("Fuel Capacity is " + car.fuelcap);
        System.out.println("Miles per gallon " + car.mpg);
    }
}
