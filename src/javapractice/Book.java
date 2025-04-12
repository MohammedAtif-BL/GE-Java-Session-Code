package javapractice;

public class Book {
    String title;
    double price;

    // this used to call another constructor
    public Book() {
        this("Unknown", 0.0);
    }

    //this is used to refer to current object
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // this is passed as parameter
    void printDetails(Book book){
        System.out.println("Title: " + book.title);
        System.out.println("Price: " + book.price);
    }

    //this used to return the current object
    Book displayDetails(){
        printDetails(this); // passing the current object
        return this;
    }

    public static void main(String[] args) {
        Book obj = new Book("Java Basic", 299.99);
        obj.displayDetails();

        Book obj1 = new Book("Spring Boot", 299.99);
        obj1.displayDetails();

    }

}
