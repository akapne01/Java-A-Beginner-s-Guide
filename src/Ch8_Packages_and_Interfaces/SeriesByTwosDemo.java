package Ch8_Packages_and_Interfaces;

/*
 * p. 286
 * Demonstrates Series by Twos
 */

public class SeriesByTwosDemo {
    public static void main(String[] args) {
        SeriesByTwos seriesByTwos = new SeriesByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + seriesByTwos.getNext());
        }

        System.out.println("\nResetting");
        seriesByTwos.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + seriesByTwos.getNext());
        }

        System.out.println("\nStarting at 100");
        seriesByTwos.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + seriesByTwos.getNext());
        }

        /*
         * Now the same thing but with series by 3
         */

        SeriesByThrees seriesByThrees = new SeriesByThrees();

        System.out.println("\nNOW SERIES INCREMENTED BY 3:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + seriesByThrees.getNext());
        }

        System.out.println("\nResetting");
        seriesByThrees.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + seriesByThrees.getNext());
        }

        System.out.println("\nStarting at 100");
        seriesByThrees.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + seriesByThrees.getNext());
        }

    }
}
