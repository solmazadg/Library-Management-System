Library Management System

Project Name
Library Management System

Description
A console-based Java application for managing books and library members. Users can add, search, borrow, and return books and view library statistics.

Technologies
* Java
* IntelliJ IDEA
* Git
* GitHub

Features
* Add novel and textBook
* Show and search books
* Add and show members
* Borrow and return books
* Show borrowed books
* Library statistics
* Input validation

OOP Concepts Used
* Encapsulation: Private attributes with getters and setters.
* Inheritance: Novel and TextBook extend Book; Member and Librarian extend Person.
* Polymorphism / Overriding: Subclasses override displayDetails(), toString(), and getFinalPrice().
* Constructors: Used to initialize objects in all main classes.
* Method Overloading: searchBook() and findMember() have different parameter lists.
* Access Modifiers: private attributes and public methods are used to control access.
* Static and Instance Members: Library uses static arrays and methods,while Book, Member, and other classes use instance members.

How to Run
1. Clone the repository:
   Git clone https://github.com/solmazadg/Library-Management-System
2. Open the project in IntelliJ IDEA.
3. Run Main.java.
4. Follow the instructions in the console menu.

Example Usage
1. Add Book
   → Add a Novel or TextBook.

2. Show All Books
   → Display all books in the library.

3. Search Book
   → Search for a book by title.

4. Add Member
   → Add a new library member.

5. Show All Members
   → Display all library members.

6. Borrow Book
   → Borrow a book by entering its title.

7. Return Book
   → Return a borrowed book.

8. Show Borrowed Books
   → Display all currently borrowed books.

9. Show Library Statistics
   → Display library statistics and reports.

 0.Exit
   → Exit the application.

UML Diagram
 
The UML class diagram is included as UML_Diagram.pdf.
