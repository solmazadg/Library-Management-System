import javax.management.InstanceNotFoundException;

public class Library {

    private static Book[] books = new Book[100];
    private static Member[] members = new Member[100];
    private static int numberofBooks = 0;
    private static int numberofMembers = 0;


    public static void addBook(Book book) {
        books[numberofBooks++] = book;
    }

    public static void addMember(Member member) {
        members[numberofMembers++] = member;
    }

    public static Book searchBook(String title) throws InstanceNotFoundException {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new InstanceNotFoundException("Book not found");
    }

    public static Book searchBook(String title, String author) throws InstanceNotFoundException {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        throw new InstanceNotFoundException("Book not found");
    }

    public static Member findMember(String name) throws InstanceNotFoundException {
        for (Member member : members) {
            if (member != null && member.getName().equals(name)) {
                return member;
            }
        }
        throw new InstanceNotFoundException("Member not found");
    }

    public static Member findMember(int memberId) throws InstanceNotFoundException {
        for (Member member : members) {
            if (member != null && member.getMemberId() == memberId) {
                return member;
            }
        }

        throw new InstanceNotFoundException("Member not found");
    }

    public static void borrowBook(String title) throws InstanceNotFoundException {
        Book bookByTitle = searchBook(title);
        bookByTitle.setAvailable(false);
        System.out.println("Book is borrowed");
    }

    public static void returnBook(String title) throws InstanceNotFoundException {
        Book bookByTitle = searchBook(title);
        bookByTitle.setAvailable(true);
        System.out.println("Book is returned.");
    }

    public static void displayInformation() {
        System.out.println("These are available books: ");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("These are available books: ");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void countAvailableBooks() {
        int count = 0;
        for (Book book : books) {
            if (book != null && book.isAvailable()) {
                count++;
            }
        }
        System.out.println("Number of books is : " + count);
    }

    public static void countActiveMembers() {
        int count = 0;
        for (Member member : members) {
            if (member != null && member.isActive()) {
                count++;
            }
        }
        System.out.println("Number of active members: " + count);
    }
    public static void findMostExpensiveBook() {
        Book mostExpensive = books[0];

        for (Book book : books) {
            if (book != null && book.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = book;
            }
        }

        System.out.println("Most expensive book: " + mostExpensive);
    }

    public static void findOldestBook() {
        Book oldestBook = books[0];

        for (Book book : books) {
            if (book != null && book.getYear() < oldestBook.getYear()) {
                oldestBook = book;
            }
        }
        System.out.println("Oldest book: " + oldestBook);
    }

    public static void findBookByPrice(double price)  {
        for (Book book : books) {
            if (book != null && book.getPrice() == price) {
                System.out.println("Book found: " + book);
            }
        }
    }

    public static void showAllBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static void showAllMembers() {
        for (Member member : members) {
            if (member != null) {
                System.out.println(member);
            }
        }
    }

    public static void showBorrowedBooks() {
        for (Book book : books) {
            if (book != null && !book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
    public static void libraryReport() {

        StringBuilder report = new StringBuilder();
        report.append("===== LIBRARY REPORT =====\n");
        report.append("Number of books: ").append(numberofBooks).append("\n");
        report.append("Number of members: ").append(numberofMembers).append("\n");
        System.out.println(report);
    }
}


