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
                                1. Add Book
                                2. Show All Books
                                3. Search Book
                                4. Add Member
                                5. Show All Members
                                6. Borrow Book
                                7. Return Book
                                8. Show Borrowed Books
                                9. Show Library Statistics
                                0. Exit
                              """);
            System.out.println("Salam. Zehmet olmasa, yuxaridaki menyudan etmek istediyiniz emeliyyatin nomresini secin:");
            pressedButton = scan.nextInt();
            switch (pressedButton) {

                case 1:
                    System.out.println("Add Book.");

                    System.out.println("Choose book type:");
                    System.out.println("1. Novel");
                    System.out.println("2. TextBook");
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
                    boolean available = scan.nextBoolean();

                    Book book = new Book(bookId, title, author, year, price, available);
                    Library.addBook(book);

                    break;

                case 2:
                    System.out.println("Show All Books.");
                    Library.showAllBooks();
                    break;

                case 3:
                    System.out.println("Please provide title:");
                    String searchTitle = scan.next();
                    Book foundBook = Library.searchBook(searchTitle);
                    System.out.println(foundBook);
                    break;

                case 4:
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
                    String borrowTitle = scan.next();
                    Library.borrowBook(borrowTitle);
                    break;

                case 7:
                    System.out.println("Return Book.");
                    System.out.println("Please provide book title:");
                    String returnTitle = scan.next();
                    Library.returnBook(returnTitle);
                    break;

                case 8:
                    System.out.println("Show Borrowed Books.");
                    Library.showBorrowedBooks();
                    break;

                case 9:
                    System.out.println("Show Library Statistics.");
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