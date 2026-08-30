package main;

import model.Book;
import model.Member;
import model.Novel;
import model.TextBook;
import service.Library;

import javax.management.InstanceNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InstanceNotFoundException {
       Scanner scan = new Scanner(System.in);

       int amount = 0;

       System.out.println("========== LIBRARY MANAGEMENT SYSTEM ==========");
        ;
        int pressedButton;
        do{
            System.out.println("""
                                1. Add model.Book
                                2. Show All Books
                                3. Search model.Book
                                4. Add model.Member
                                5. Show All Members
                                6. Borrow model.Book
                                7. Return model.Book
                                8. Show Borrowed Books
                                9. Show service.Library Statistics
                                0. Exit
                              """);
            System.out.println("Salam. Zehmet olmasa, yuxaridaki menyudan etmek istediyiniz emeliyyatin nomresini secin:");
            pressedButton = scan.nextInt();
            switch (pressedButton) {

                case 1:
                    System.out.println("Add model.Book.");

                    System.out.println("Choose book type:");
                    System.out.println("1. model.Novel");
                    System.out.println("2. model.TextBook");
                    int bookType = scan.nextInt();
                    scan.nextLine();


                    System.out.println("BookId:");
                    Integer bookId = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Title:");
                    String title = scan.nextLine();

                    System.out.println("Author:");
                    String author = scan.nextLine();

                    System.out.println("Year:");
                    int year = scan.nextInt();
                    while (year < 2000 || year > 2026) {
                        System.out.println("Invalid year. Please enter a valid year:");
                        year = scan.nextInt();
                    }

                    System.out.println("Price:");
                    double price = scan.nextDouble();
                    while (price <= 0) {
                        System.out.println("Price must be greater than 0. Please enter a valid price:");
                        price = scan.nextDouble();
                    }

                    System.out.println("Available:");
                    Boolean available = scan.nextBoolean();

                    if (bookType == 1) {

                        scan.nextLine();

                        System.out.println("Genre:");
                        String genre = scan.nextLine();

                        System.out.println("Number of pages:");
                        int numberOfPages = scan.nextInt();

                        Book book = new Novel(bookId, title, author, year, price, available, genre, numberOfPages);

                        Library.addBook(book);

                    } else if (bookType == 2) {

                        scan.nextLine();

                        System.out.println("Subject:");
                        String subject = scan.nextLine();

                        System.out.println("Education level:");
                        String educationLevel = scan.nextLine();

                        Book book = new TextBook(bookId, title, author, year, price, available, subject, educationLevel);

                        Library.addBook(book);
                    }

                    break;

                case 2:
                    System.out.println("Show All Books.");
                    Library.showAllBooks();
                    break;


                    case 3:
                    System.out.println("Please provide title:");
                    scan.nextLine();
                    String searchTitle = scan.nextLine();
                    Book foundBook = Library.searchBook(searchTitle);
                    System.out.println(foundBook);
                    break;

                case 4:
                    System.out.println("Add model.Member.");

                    System.out.println("MemberId:");
                    int memberId = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Name:");
                    String name = scan.nextLine();

                    System.out.println("Mail:");
                    String mail = scan.nextLine();
                    while (!mail.contains("@")) {
                        System.out.println("Invalid mail. Please enter a valid mail:");
                        mail = scan.nextLine();
                    }

                    System.out.println("Age:");
                    int age = scan.nextInt();
                    while (age < 18) {
                        System.out.println("Age must be at least 18. Please enter age:");
                        age = scan.nextInt();
                    }

                    System.out.println("Active:");
                    boolean active = scan.nextBoolean();

                    Member member = new Member(memberId, name, mail, age, active);
                    Library.addMember(member);
                    break;

                case 5:
                    System.out.println("Show All Members.");
                    Library.showAllMembers();
                    break;

                case 6:
                    System.out.println("Borrow Book.");
                    System.out.println("Please provide book title:");
                    scan.nextLine();
                    String borrowTitle = scan.nextLine();
                    Library.borrowBook(borrowTitle);
                    break;

                case 7:
                    System.out.println("Return Book.");
                    System.out.println("Please provide book title:");
                    scan.nextLine();
                    String returnTitle = scan.nextLine();
                    Library.returnBook(returnTitle);
                    break;

                case 8:
                    System.out.println("Show Borrowed Books.");
                    Library.showBorrowedBooks();
                    break;

                case 9:
                    System.out.println("Show service.Library Statistics.");
                    Library.countActiveMembers();
                    Library.countAvailableBooks();
                    Library.libraryReport();
                    break;

                case 0:
                    System.out.println("Xos istirahetler. Novbeti defe gorusmek uzre!");
                    break;

                default:
                    System.out.println("Yanlis secim etdiniz!");
            }

        } while (pressedButton != 0);

    }
}