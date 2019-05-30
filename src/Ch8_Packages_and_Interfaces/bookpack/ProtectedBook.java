package Ch8_Packages_and_Interfaces.bookpack;

/*
 * p 280
 * make instance variables protected
 */
public class ProtectedBook {
    protected String title;
    protected String author;
    protected int pubDate;

    public ProtectedBook(String title, String author, int pubDate) {
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
