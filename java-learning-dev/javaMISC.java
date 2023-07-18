import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

@FunctionalInterface
interface BookProcessor {
    void process(Book book);
}

class Library<T> {
    private List<T> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(T book) {
        books.add(book);
    }

    public T getBook(int index) {
        return books.get(index);
    }
}

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Exception Handling
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Java I/O
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Multithreading
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running...");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running...");
        });

        thread1.start();
        thread2.start();

        // Generics
        Library<Book> library = new Library<>();
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Data Structures", "Jane Smith");

        library.addBook(book1);
        library.addBook(book2);

        Book retrievedBook = library.getBook(0);
        System.out.println("Retrieved Book: " + retrievedBook.getTitle() + " by " + retrievedBook.getAuthor());

        // Annotations
        processBooks(library, book -> {
            System.out.println("Processing book: " + book.getTitle());
        });
    }

    @SuppressWarnings("rawtypes")
    @SafeVarargs
    @Deprecated
    private static void processBooks(Library library, BookProcessor... processors) {
        for (int i = 0; i < library.getBooks().size(); i++) {
            Book book = library.getBook(i);
            for (BookProcessor processor : processors) {
                processor.process(book);
            }
        }
    }
}
