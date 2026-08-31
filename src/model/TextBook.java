package model;

public class TextBook extends Book {

    private String subject;
    private String educationLevel;

    public TextBook (int bookId , String title , String author , int year , double price ,
                     boolean available, String subject, String educationLevel){

        super(bookId, title, author, year, price, available);
        this.subject = subject;
        this.educationLevel = educationLevel;
        }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getEducationLevel() {
        return educationLevel;
    }

    public void displayDetails() {
        System.out.println("This is a model.TextBook.\n" +
                           "Title: " + getTitle() + "\n" +
                           "Subject: " + subject + "\n" +
                           "Education level: " + educationLevel);
    }

    @Override
    public double getFinalPrice() {
        return getPrice() * 0.50;
    }

    @Override
    public String toString() {
        return super.toString() + " model.TextBook{" +
                "subject='" + subject + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                '}';
    }
}
