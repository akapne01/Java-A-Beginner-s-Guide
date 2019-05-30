package Ch8_Packages_and_Interfaces.bookpackext;

/*
 * p. 282
 * Same as UseBook, but with import this time. Shorter to type
 */
import Ch8_Packages_and_Interfaces.bookpack.Book;

public class UseBookImport {
    public static void main(String[] args) {
        // Using Book from bookpack package
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2019);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2019);
        books[2] = new Book("Introduction JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new Book("Red Storm rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
