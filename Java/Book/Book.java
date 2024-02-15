package Book;

import java.util.Scanner;

class Book implements Comparable<Book> {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;

    public Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
        this.ISBN = 0;
        this.bookTitle = " ";
        this.numberOfPages = 0;
    }

    public int getCount() {
        return count;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{ISBN=" + ISBN + ", bookTitle='" + bookTitle + "', numberOfPages=" + numberOfPages + '}';
    }

    @Override
    public int compareTo(Book other) {
        if (this.numberOfPages > other.numberOfPages) {
            return 1;
        } else if (this.numberOfPages < other.numberOfPages) {
            return -1;
        } else {
            return 0;
        }
    }
}

