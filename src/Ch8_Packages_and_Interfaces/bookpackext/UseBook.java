package Ch8_Packages_and_Interfaces.bookpackext;

/*
 * p. 280
 *
 * This class doesn't use imports, but they are very useful
 * Imports help to keep code shorter and tells Java compiler where the class
 * lives. Its a shortcut that allows to use the class we want to use by referring
 * to it only by the class name and skip the whole package name as it is in this
 * example.
 *
 * If I would import Book from the package, it is equal to adding the shortcut in
 * your directory that links to the class you are importing. So whe compiler needs
 * to access it, it know how.
 */

public class UseBook {
    public static void main(String[] args) {

        /*
         * Can use Book with the package name without importing it in the file
         * If Java class we want to use is in the different package and public
         */
        Ch8_Packages_and_Interfaces.bookpack.Book books[] = new Ch8_Packages_and_Interfaces.bookpack.Book[5];

        books[0] = new Ch8_Packages_and_Interfaces.bookpack.Book("Java: A Beginner's Guide", "Schildt", 2019);
        books[1] = new Ch8_Packages_and_Interfaces.bookpack.Book("Java: The Complete Reference", "Schildt", 2019);
        books[2] = new Ch8_Packages_and_Interfaces.bookpack.Book("Introduction JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new Ch8_Packages_and_Interfaces.bookpack.Book("Red Storm rising", "Clancy", 1986);
        books[4] = new Ch8_Packages_and_Interfaces.bookpack.Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

    }
}
