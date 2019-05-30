package Ch8_Packages_and_Interfaces.bookpack;

/*
 * A short package demonstration
 * p. 276
 */

public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
