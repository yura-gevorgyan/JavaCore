package classwork.library;

import java.util.Scanner;

public class LibraryMain {
    static Scanner scanner = new Scanner(System.in);
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addBook();
                    break;
                case "2":
                    searchBook();
                    break;
                case "3":
                    bookStorage.print();
                    break;
            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD BOOK");
        System.out.println("Please input 2 for SEARCH BOOK");
        System.out.println("Please input 3 for PRINT ALL BOOK");
    }

    private static void addBook() {
        System.out.println("Please input TITLE");
        String title = scanner.nextLine();
        System.out.println("Please input AUTHOR NAME");
        String authorName = scanner.nextLine();
        System.out.println("Please input PRICE");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input COUNT");
        int count = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title, authorName, price, count);
        bookStorage.add(book);
        System.out.println("Book created !!!");
    }

    private static void searchBook() {
        String keyword = scanner.nextLine();
        bookStorage.search(keyword);
    }
}
