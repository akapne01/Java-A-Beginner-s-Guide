package Ch4_Introducing_Classes_Objects_Methods;

public class VehicleConstructorDemo {
    public static void main(String[] args) {

        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles sports car needs " + gallons + " gallons of fuel.");
    }
}
