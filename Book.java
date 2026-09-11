public class Book {

    private String title;
    private String author;
    private double price;
    private String isbn;

    static int bookCount = 0;

    final String libraryName = "Sunrise Public Library";

    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;

        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}


public class LibraryTest {

    public static void main(String[] args) {

        Book b1 = new Book(
            "Java Basics",
            "J. Author",
            350.0,
            "ISBN001"
        );

        Book b2 = new Book(
            "OOP Concepts",
            "K. Writer",
            420.0,
            "ISBN002"
        );

        System.out.println("Book 1");
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());
        System.out.println("ISBN: " + b1.getIsbn());

        System.out.println();

        System.out.println("Book 2");
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("ISBN: " + b2.getIsbn());

        System.out.println();

        System.out.println("Library Name: " + b1.libraryName);
        System.out.println("Total Books: " + Book.bookCount);
    }
}
 {
    
}
