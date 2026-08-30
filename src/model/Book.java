package model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private int year;
    private double price;
    private boolean available;


    public Book (int bookId , String title , String author , int year , double price , boolean available){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.available = available;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    @Override
    public String toString() {
        return "model.Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

    public double getFinalPrice() {
        return price;
    }
}


