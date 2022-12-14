package task2;

public class Rent {
    public double baseRent;
    public int days;

    public Rent(double baseRent)
    {
        this.baseRent = baseRent;
    }

    public double CalculateRent(Book book)
    {
        if(isFineApplicable())
            return (days - 7) * 4 + book.CalculateRent(baseRent);

        return book.CalculateRent(baseRent);
    }

    public boolean isFineApplicable()
    {
        return days > 7;
    }
}
