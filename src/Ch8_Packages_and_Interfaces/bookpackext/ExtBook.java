package Ch8_Packages_and_Interfaces.bookpackext;

class ExtBook extends Ch8_Packages_and_Interfaces.bookpack.ProtectedBook {
    private String publisher;

    public ExtBook(String title, String author, int pubDate, String publisher) {
        super(title, author, pubDate);
        this.publisher = publisher;

    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    /* These are OK because subclass can access a protected member
     * Also tested the setters. It turns out that in this case,
     * if parent class has a protected access then fields in the parent
     * class can be set using keywords: super, this and no keyword at all
     * if field name is different
     */
    public String getTitle() {return title;}
    // setting using keyword super
    public void setTitle(String title) {super.title = title;}
    public String getAuthor() {return author;}
    // setting using keyword this
    public void setAuthor(String author) {this.author = author;}
    public int getPubDate() {return pubDate;}
    public void setPubDate(int d) {pubDate = d;}
}


class ProtectDemo{
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];
        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2019, "Oracle Press");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2019, "Oracle Press");
        books[2] = new ExtBook("Introduction JavaFX 8 Programming", "Schildt", 2015, "Oracle Press");
        books[3] = new ExtBook("Red Storm rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i <books.length; i++) {
            books[i].show();
        }

        // Find a books author
        System.out.println("Showing all books by Schildt.");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Schildt") {
                System.out.println(books[i].getTitle());
            }
        }

        // Change one of the entries to test the setters and see which keywords work
        books[2].setAuthor("Some Random Author Name");
        books[2].setTitle("Funny, but this is a Random book");
        books[2].setPubDate(2020);
        books[2].setPublisher("Random Publisher");

        for (int i = 0; i <books.length; i++) {
            books[i].show();
        }


        // books[0].title = "testing the title"; This is not accessible
    }
}