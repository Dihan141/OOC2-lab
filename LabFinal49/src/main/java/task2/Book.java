package task2;

public abstract class Book {
    public String author;
    public String title;

    public Book(String author, String title)
    {
        this.author = author;
        this.title = title;
    }

    public abstract double CalculateRent(double base);
}
