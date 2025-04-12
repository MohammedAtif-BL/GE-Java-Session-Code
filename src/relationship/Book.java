package relationship;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
}

class Library{
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
        books.add(new Book("Book 1"));
        books.add(new Book("Book 2"));
    }

    void show(){
        for(Book book:books){
            System.out.println(book.title);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.show();
    }
}