package task2;

public class KidsBook extends Book{
    public KidsBook(String author, String title)
    {
        super(author, title);
    }

    @Override
    public double CalculateRent(double base) {
        return base - 0.1 * base;
    }
}
