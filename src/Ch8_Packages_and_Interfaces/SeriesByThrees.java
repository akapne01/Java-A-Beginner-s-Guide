package Ch8_Packages_and_Interfaces;

/*
 * p. 288
 * Implements series and makes the series to be incremented
 * by 3
 */

public class SeriesByThrees implements Series {
    int start;
    int value;
    int previous;
    private static final int SERIES_INCREMENT_VALUE = 3;

    SeriesByThrees() {
        start = 0;
        value = 0;
        previous = -SERIES_INCREMENT_VALUE;
    }
    /**
     * Method signature has to match the interface method signature
     * All methods of interface are implicitly public
     */
    // Overrides getNext method from interface
    public int getNext() {
        previous = value;
        value += SERIES_INCREMENT_VALUE;
        return value;
    }

    // Overrides reset from interface series
    public void reset() {
        value = start;
        previous = start - SERIES_INCREMENT_VALUE;
    }

    // Overriding setStart from interface
    public void setStart(int start) {
        this.start = start;
        this.value = start;
        previous = start - SERIES_INCREMENT_VALUE;
    }

    // Adding a new method to the interface
    int getPrevious() {
        return previous;
    }
}
