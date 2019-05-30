package Ch8_Packages_and_Interfaces;

/*
 * p 290
 * Interface references
 */
public class ReferencesSeriesDemo {
    public static void main(String[] args) {

        SeriesByTwos seriesByTwos = new SeriesByTwos();
        SeriesByThrees seriesByThrees = new SeriesByThrees();
        /**
         * Series object reference can be used to store any object that
         * implements Series interface.
         */
        Series ob;

        for (int i = 0; i < 5; i++) {

            // Assign Series by 2 object to Series object reference
            ob = seriesByTwos;
            System.out.println("Next Series By 2 value is " + ob.getNext());

            // Assign Series by 3 object to Series object reference
            ob = seriesByThrees;
            System.out.println("Next Series by 3 value is " + ob.getNext());

            System.out.println();
        }
    }
}
