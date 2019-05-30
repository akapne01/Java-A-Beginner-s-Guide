package Ch8_Packages_and_Interfaces;

public interface CanGetAcccountsInclufingDefault {
    /*
     * This is a normal interface method declaration;
     */
    int getUserID();

    /* This is a default method that provides a default implementation */
    default int  getAdminID() {
        return 1;
    }

    /**
     * Adding a static interface method
     * Static methods are not inherited by classes, interfaces
     */
    static int getUniversalID() {
        return 0;
    }

}

class AccountIDs implements CanGetAcccountsInclufingDefault {

    /* Only getUserID method needs to be overridden, as getAdminID method
     * has a default implementation. This means that it is optional to be
     * overridden.
     */
    public int getUserID() {
        return 100;
    }
}