class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan2 = new Vehicle();
        int range;

        // assign values to the fields of minivan
        minivan2.passengers = 9;
        minivan2.mpg = 22;
		minivan2.fuelcap = 10;
        
        // compute the range assuming a full tank of gas
        range = minivan2.fuelcap * minivan2.mpg;
		// this is to be compliled using command line
        System.out.println("Minivan can carry ");
		System.out.print(minivan2.passengers + " with range of " + range);
    }
}