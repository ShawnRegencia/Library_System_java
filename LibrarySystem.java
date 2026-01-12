import java.util.Scanner;

public class LibrarySystem {
    static Scanner sc = new Scanner(System.in);

    static int[] bookID = new int[25];
    static String[] BookTitle = new String[40];
    static String[] BookAuthor = new String[50];
    static String[] BookCategory = new String[50];
    static int[] Quantity = new int[50];
    static int bookCount = 0;

    static int[] BorrowerID = new int[25];
    static String[] Name = new String[50];
    static String[] Course = new String[50];
    static String[] Contact = new String[50];
    static int[] BorrowedBookID = new int[50];
    static int BorrowerCount = 0;

    static int[] TransactionID = new int[25];
    static int[] TransactionBookID = new int[25];
    static int[] TransactionBorrowerID = new int[25];
    static int[] DueDate = new int[25];
    static boolean[] returned = new boolean[25];
    static int[] fine = new int[25];
    static int TransactionCount = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== WELCOME TO COLLEGE LIBRARY MANAGEMENT ====");
            System.out.println("1. Book Management");
            System.out.println("2. Borrower Management");
            System.out.println("3. Borrow / Return");
            System.out.println("4. Fine Management");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: BookMenu(); break;
                case 2: borrowerMenu(); break;
                case 3: TransactionMenu(); break;
                case 4: fineMenu(); break;
                case 0: System.exit(0);
                default: System.out.println("Invalid Choice");
            }
        }
    }

    static void BookMenu() {
        System.out.println("\n==== BOOK MANAGEMENT =====");
        System.out.println("1. Add Books");
        System.out.println("2. View Books");
        System.out.println("3. Remove Books");
        System.out.println("0. Return");
        System.out.print("Choose your option: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            bookID[bookCount] = bookCount + 1;

            System.out.print("Input Book Title: ");
            BookTitle[bookCount] = sc.nextLine();

            System.out.print("Author of the Book: ");
            BookAuthor[bookCount] = sc.nextLine();

            System.out.print("Category of the Book: ");
            BookCategory[bookCount] = sc.nextLine();

            System.out.print("Quantity: ");
            Quantity[bookCount] = sc.nextInt();

            bookCount++;
            System.out.println("Book added successfully!");

        } else if (choice == 2) {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(bookID[i] + " | " + BookTitle[i] +
                        " | Qty: " + Quantity[i]);
            }

        } else if (choice == 3) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            for (int i = 0; i < bookCount; i++) {
                if (bookID[i] == id) {
                    Quantity[i] = 0;
                    System.out.println("Book Removed");
                }
            }
        }
    }

    static void borrowerMenu() {
        System.out.println("\n==== BORROWER MANAGEMENT ====");
        System.out.println("1. Register");
        System.out.println("2. View Borrowers");
        System.out.println("0. Return");
        System.out.print("Choose your option: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.print("Borrower ID: ");
            BorrowerID[BorrowerCount] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Name of Borrower: ");
            Name[BorrowerCount] = sc.nextLine();

            System.out.print("Course: ");
            Course[BorrowerCount] = sc.nextLine();

            System.out.print("Contact: ");
            Contact[BorrowerCount] = sc.nextLine();

            BorrowedBookID[BorrowerCount] = 0;
            BorrowerCount++;

            System.out.println("Borrower Registered!");

        } else if (choice == 2) {
            for (int i = 0; i < BorrowerCount; i++) {
                System.out.println(BorrowerID[i] + " | " + Name[i] +
                        " | Borrowed Book ID: " + BorrowedBookID[i]);
            }
        }
    } 

    static void TransactionMenu() {
       System.out.println("\n--- Borrow / Return ---");
        System.out.println("1. Borrow Book");
        System.out.println("2. Return Book");
        System.out.print("Choose: ");

        int choice = sc.nextInt();

        if (choice == 1){
            
        }
    }

    static void fineMenu() {
        System.out.println("Fine Menu (Not yet implemented)");
    }
}
