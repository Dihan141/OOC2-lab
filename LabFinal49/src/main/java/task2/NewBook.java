package task2;

public class NewBook extends Book{
    public NewBook(String author, String title)
    {
        super(author, title);
    }

    @Override
    public double CalculateRent(double base) {
        return base + 0.3*base;
    }
}
