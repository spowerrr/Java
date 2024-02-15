package Book;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Book " + (i + 1) + " details:");
            System.out.print("ISBN: ");
            int ISBN = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Number of Pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            books[i] = new Book(ISBN, title, pages);
        }

        System.out.println("All Book objects:");
        displayAll(books);

        int comparisonResult = books[0].compareTo(books[1]);
        System.out.println("Comparison Result (Book 1 vs. Book 2): " + comparisonResult);

        boolean isHeavier = isHeavier(books[0]);
        System.out.println("Is Book 1 heavier (more than 500 pages)? " + isHeavier);

        scanner.close();
    }

    public static void displayAll(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static boolean isHeavier(Book book) {
        return book.getNumberOfPages() > 500;
    }
}