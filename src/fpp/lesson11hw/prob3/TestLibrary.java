package fpp.lesson11hw.prob3;

public class TestLibrary {
    void main(){
        Library library = new Library();
        library.addBook("1234", "slient patient", "me");
        library.addBook("1233", "slient patient1", "me1");
        library.addBook("1236", "slient patient2", "me2");
        library.addBook("1237", "slient patient3", "me3");
        library.addBook("1238", "slient patient4", "me4");

        library.listAllBooks();

        library.borrowBook("1234");
        library.borrowBook("1237");
        System.out.println(library.isBookBorrowed("1234"));
        library.returnBook("1234");
        library.returnBook("1234");
        System.out.println(library.isBookBorrowed("1234"));


        library.listBorrowedBooks();

        System.out.println(library.getBookDetails("1234"));

    }
}
