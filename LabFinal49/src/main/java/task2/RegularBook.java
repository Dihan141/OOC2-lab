package task2;

public class RegularBook extends Book{
    public RegularBook(String author, String title)
    {
        super(author, title);
    }

    @Override
    public double CalculateRent(double base) {
        return base - 0.2 * base;
    }
}
