/*
 * p. 243
 * Try This 7-1
 * Extending the Vehicle Class from ch 4
 * Build a subclass of Vehicle for trucks
 */

package Ch7_Inheritance;

class Vehicle {
    // instance variables
    private int passengers;  // number of passengers
    private int fuelcap;     // fuel capacity in gallons
    private int mpg;         // fuel consumption in miles per gallon

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

    // returns range
    int range() {
        return mpg * fuelcap;
    }


    // gallons required for number of miles
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods for instance variables
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}



// Extend Vehicle to create a Truck specialization

/**
 * Truck inherits from Vehicle class.
 * Truck class adds cargocap, getCargo(), setCargo()
 * All the general Vehicle attributes are inherited from the Vehicle
 */
class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    // Constructor
    Truck(int p, int f, int m, int c) {
        /*
         * Initialize vehicle members using Vehicle's constructor
         */
        super(p, f, m);

        cargocap = c;
    }

    // Accessor method dor cargocap
    int getCargo() {return cargocap;}
    void putCargi(int c) {cargocap = c;}

}


public class TruckDemo {
    public static void main(String[] args) {

        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n" );

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.\n" );

    }

}
