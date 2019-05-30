package Ch8_Packages_and_Interfaces;

/*
 * p. 285 Interfaces
 */

public interface Series {

    /**
     * Returns the next integer in the series
     * @return next number in series
     */
    int getNext();


    /**
     * Reset series
     */
    void reset();

    /**
     * Set starting value
     * @param start
     */
    void setStart(int start);

    /**
     * Adding default method getNextArray()
     */
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }
}
