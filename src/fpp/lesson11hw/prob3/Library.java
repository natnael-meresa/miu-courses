package fpp.lesson11hw.prob3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books;
    Library(){
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("Book already exits");
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Book added successfully");
        }
    }

    public void borrowBook(String ISBN) {
        Book book = books.getOrDefault(ISBN, null);
        if (book == null)
            System.out.println("Book don't exists");
        else if (book.isBorrowed())
            System.out.println("Book is already borrowed");
        else{
            book.setBorrowed(true);
            books.put(ISBN, book);
            System.out.println("Book borrowed successfully");
        }
    }

    public void returnBook(String ISBN) {
        Book book = books.getOrDefault(ISBN, null);
        if (book == null || !book.isBorrowed())
            System.out.println("Book is not borrowed so it can't be return");
        else{
            book.setBorrowed(false);
            books.put(ISBN, book);
            System.out.println("Book borrowed successfully");
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = books.getOrDefault(ISBN, null);
        if (book != null && book.isBorrowed()) return true;
        return false;
    }

    public Book getBookDetails(String ISBN) {
        return books.getOrDefault(ISBN, null);
    }

    public void listAllBooks() {
        System.out.println("All books list: ");
        for (Book book: books.values()) {
            System.out.println(book);
        }
    }

    public void listBorrowedBooks() {
        System.out.println("Borrowed books list: ");
        for (Book book: books.values()) {
            if (book != null && book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
}
