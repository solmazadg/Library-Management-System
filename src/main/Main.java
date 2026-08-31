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
                        addBook(scan);
                        break;

                case 2:
                        showAllBooks();
                        break;

                case 3:
                        searchBook(scan);
                        break;

                case 4:
                        addMember(scan);
                        break;

                case 5:
                        showAllMembers();
                        break;

                case 6:
                        borrowBook(scan);
                        break;

                case 7:
                        returnBook(scan);
                        break;

                case 8:
                        showBorrowedBooks();
                        break;

                case 9:
                        showLibraryStatistics();
                        break;

                case 0:
                        exitProgram();
                        break;

                default:
                        System.out.println("Invalid choice!");
                }

            } while (pressedButton != 0);
        }


        public static void addBook(Scanner scan) {

            System.out.println("Add Book.");

            System.out.println("""
                Choose book type:
                1. Novel
                2. TextBook
                """);

            int bookType = scan.nextInt();
            scan.nextLine();

            System.out.println("BookId:");
            int bookId = scan.nextInt();
            scan.nextLine();

            System.out.println("Title:");
            String title = scan.nextLine();

            System.out.println("Author:");
            String author = scan.nextLine();

            System.out.println("Year:");
            int year = scan.nextInt();

            while (year < 2000 || year > 2026) {
                System.out.println("Invalid year. " +
                        "Please enter a valid year:");
                year = scan.nextInt();
            }

            System.out.println("Price:");
            double price = scan.nextDouble();

            while (price <= 0) {
                System.out.println("Price must be greater than 0. " +
                        "Please enter a valid price:");
                price = scan.nextDouble();
            }

            System.out.println("Available:");
            boolean available = scan.nextBoolean();

            switch (bookType) {
                case 1:
                    scan.nextLine();
                    System.out.println("Genre:");
                    String genre = scan.nextLine();

                    System.out.println("Number of pages:");
                    int numberOfPages = scan.nextInt();

                    Book book1 = new Novel(bookId, title, author,
                            year, price, available, genre, numberOfPages);
                    Library.addBook(book1);
                    break;

                case 2:
                    scan.nextLine();
                    System.out.println("Subject:");
                    String subject = scan.nextLine();

                    System.out.println("Education level:");
                    String educationLevel = scan.nextLine();

                    Book book2 = new TextBook(bookId, title, author, year,
                            price, available, subject, educationLevel);
                    Library.addBook(book2);
                    break;

                default:
                    System.out.println("Invalid book type!");
                    break;
            }
        }


        public static void showAllBooks() {
            System.out.println("Show All Books.");
            Library.showAllBooks();
        }


        public static void searchBook(Scanner scan) throws InstanceNotFoundException {
            System.out.println("Please provide title:");

            scan.nextLine();
            String searchTitle = scan.nextLine();

            Book foundBook = Library.searchBook(searchTitle);

            System.out.println(foundBook);
        }


        public static void addMember(Scanner scan) {
            System.out.println("Add Member.");

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

            Member member = new Member(memberId, name,
                    mail, age, active);

            Library.addMember(member);
        }


        public static void showAllMembers() {
            System.out.println("Show All Members.");
            Library.showAllMembers();
        }


        public static void borrowBook(Scanner scan) throws InstanceNotFoundException {
            System.out.println("Borrow Book.");
            System.out.println("Please provide book title:");

            scan.nextLine();

            String borrowTitle = scan.nextLine();

            Library.borrowBook(borrowTitle);
        }


        public static void returnBook(Scanner scan) throws InstanceNotFoundException {
            System.out.println("Return Book.");
            System.out.println("Please provide book title:");

            scan.nextLine();

            String returnTitle = scan.nextLine();

            Library.returnBook(returnTitle);
        }


        public static void showBorrowedBooks() {
            System.out.println("Show Borrowed Books.");
            Library.showBorrowedBooks();
        }


        public static void showLibraryStatistics() {
            System.out.println("Show Library Statistics.");

            Library.countActiveMembers();
            Library.countAvailableBooks();
            Library.libraryReport();
        }


        public static void exitProgram() {
            System.out.println("Xos istirahetler. Novbeti defe gorusmek uzre!");
        }
    }