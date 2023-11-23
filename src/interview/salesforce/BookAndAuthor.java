package interview.salesforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}

class Library {
    private Map<String, Book> booksByTitle;
    private Map<String, List<Book>> booksByAuthor;
    private Map<String, List<Author>> authorsByBook;

    public Library() {
        booksByTitle = new HashMap<>();
        booksByAuthor = new HashMap<>();
        authorsByBook = new HashMap<>();
    }

    public void addBook(String title, List<Author> authors) {
        Book newBook = new Book(title, authors);
        booksByTitle.put(title, newBook);

        // Update booksByAuthor
        for (Author author : authors) {
            booksByAuthor.computeIfAbsent(author.getName(), k -> new ArrayList<>()).add(newBook);
        }

        // Update authorsByBook
        authorsByBook.put(title, authors);
    }

    public List<Book> getBooksByAuthor(String authorName) {
        return booksByAuthor.getOrDefault(authorName, new ArrayList<>());
    }

    public List<Author> getAuthorsByBook(String bookTitle) {
        return authorsByBook.getOrDefault(bookTitle, new ArrayList<>());
    }
}

public class BookAndAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smith");
        Author author3 = new Author("Alice Johnson");

        Library library = new Library();

        // Adding books
        library.addBook("Book One", List.of(author1, author2));
        library.addBook("Book Two", List.of(author2));
        library.addBook("Book Three", List.of(author1, author3));

        // Getting books by author
        String authorNameToSearch = "John Doe";
        List<Book> booksByAuthor = library.getBooksByAuthor(authorNameToSearch);

        if (booksByAuthor.isEmpty()) {
            System.out.println("No books found for author: " + authorNameToSearch);
        } else {
            System.out.println("Books by author " + authorNameToSearch + ":");
            for (Book book : booksByAuthor) {
                System.out.println("- " + book.getTitle());
            }
        }

        // Getting authors by book
        String bookTitleToSearch = "Book Two";
        List<Author> authorsByBook = library.getAuthorsByBook(bookTitleToSearch);

        if (authorsByBook.isEmpty()) {
            System.out.println("No authors found for book: " + bookTitleToSearch);
        } else {
            System.out.println("Authors of book " + bookTitleToSearch + ":");
            for (Author author : authorsByBook) {
                System.out.println("- " + author.getName());
            }
        }
    }
}
