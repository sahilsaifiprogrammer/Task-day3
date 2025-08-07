import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.title + " added to library.");
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && !book.isIssued) {
                book.isIssued = true;
                System.out.println("Book '" + title + "' issued successfully.");
                return;
            }
        }
        System.out.println("Book not available for issue.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && book.isIssued) {
                book.isIssued = false;
                System.out.println("Book '" + title + "' returned successfully.");
                return;
            }
        }
        System.out.println("This book was not issued.");
    }

    public void showBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println("- " + book.title + " by " + book.author + " [" + (book.isIssued ? "Issued" : "Available") + "]");
        }
    }
}