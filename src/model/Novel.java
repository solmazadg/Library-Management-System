package model;

public class Novel extends Book {

    private String genre;
    private int numberOfPages;

    public Novel (int bookId , String title , String author , int year , double price ,
                  boolean available, String genre , int numberOfPages){
        super(bookId, title, author, year, price, available);
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void displayDetails() {
        System.out.println("This is a model.Novel.");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + genre);
        System.out.println("Number of pages: " + numberOfPages);
    }

    @Override
    public String toString() {
        return super.toString() + " model.Novel{" +
                "genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
    @Override
    public double getFinalPrice() {
        return getPrice() * 0.90;
    }
}
