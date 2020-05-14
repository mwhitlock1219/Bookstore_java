import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the bookstore? ");
        String name = scanner.nextLine();

        System.out.println("What is the address? ");
        String address = scanner.nextLine();

        System.out.println("How many sqft is the bookstore? ");
        String sqFt = scanner.nextLine();

        System.out.println("What days is the bookstore open? ");
        String daysOpen = scanner.nextLine();

        System.out.println("Does your bookstore sell used books? ");
        String hasUsedBooks = scanner.nextLine();

        Bookstore bookStore = new Bookstore(name, address, sqFt, hasUsedBooks, daysOpen);

        System.out.println(bookStore.getStoreName1());
        System.out.println(bookStore.getAddress1());
        System.out.println(bookStore.getSquareFeet1());
        System.out.println(bookStore.getDaysOpen1());
        System.out.println(bookStore.getHasUsedBooks1());

        System.out.println(bookStore.getTotalBooks());

        scanner.close();

        Bookstore books = new Bookstore("Billy Chimes", "123 Books, Store NC 27456", "3000", "new and used books",
                "10am", "11pm", "Monday-Sunday");

        books.getAddress();
        books.daysOpen();
        books.getClosingTime();
        books.getHoursOfOperation();
        books.getSquareFeet();
        books.hasUsedBooks();
        books.daysOpen();

    }
}