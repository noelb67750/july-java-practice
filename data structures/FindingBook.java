import java.util.ArrayList;
import java.util.List;

// Book class with id and title
class Book {
    //defining id and title
    private int id;
    private String title;

    // Constructor to initialize the book
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
//getters for id and title
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

// BookManager class to manage the books
class BookManager {
    private List<Book> books = new ArrayList<>();
    private List<Integer> ids = new ArrayList<>();
// Method to add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        ids.add(book.getId());
    }
//` Method to retrieve the list of books and ids
    public List<Book> getBooks() {
        return books;
    }
// Method to retrieve the list of ids
    public List<Integer> getIds() {
        return ids;
    }
// Method to find a book by its id
    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null; // Book not found
    }
}
// This code defines a simple book management system where you can add books and find them by their ID.
// Main class to test
public class FindingBook {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book(1, "1984"));
        manager.addBook(new Book(2, "Brave New World"));

        Book found = manager.findBookById(2);
        if (found != null) {
            System.out.println("Book found: " + found.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}