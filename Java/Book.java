public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {   //constructor
        this.title = title;
        this.author = author;
    }

    public Book(String title) {  //constructor
        this.title = title;
        this.author = "Unknown";
    }

    public void displayInfo() {                // method
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
}

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Mystery Novel");

        book1.displayInfo();
        book2.displayInfo();
    }
}
