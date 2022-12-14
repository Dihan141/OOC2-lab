import org.junit.Test;
import task2.KidsBook;
import task2.NewBook;
import task2.RegularBook;
import task2.Rent;

import static org.junit.Assert.*;

public class TestTask2 {
    @Test
    public void TestRegularBookWithoutFine()
    {
        RegularBook regularBook = new RegularBook("Dihan", "OOC");
        Rent rent = new Rent(100);
        rent.days = 6;

        double expected = 80;
        assertEquals(expected, rent.CalculateRent(regularBook), 0.001);
    }

    @Test
    public void TestRegularBookWithFine()
    {
        RegularBook regularBook = new RegularBook("Dihan", "OOC");
        Rent rent = new Rent(100);
        rent.days = 8;
        double expected = 84;
        assertEquals(expected, rent.CalculateRent(regularBook), 0.001);
    }

    @Test
    public void TestKidsBookWithoutFine()
    {
        KidsBook kidsBook = new KidsBook("Dihan", "OOC");
        Rent rent = new Rent(100);
        rent.days = 6;

        double expected = 90;
        assertEquals(expected, rent.CalculateRent(kidsBook), 0.001);
    }

    @Test
    public void TestKidsBookWithFine()
    {
        KidsBook kidsBook = new KidsBook("Dihan", "OOC");
        Rent rent = new Rent(100);
        rent.days = 8;
        double expected = 94;
        assertEquals(expected, rent.CalculateRent(kidsBook), 0.001);
    }

    @Test
    public void TestNewBookWithoutFine()
    {
        NewBook newBook = new NewBook("Dihan", "OOC");
        Rent rent = new Rent(100);
        rent.days = 6;

        double expected = 130;
        assertEquals(expected, rent.CalculateRent(newBook), 0.001);
    }

    @Test
    public void TestNewBookWithFine()
    {
        NewBook newBook = new NewBook("Dihan", "OOC");
        Rent rent = new Rent(100);
        rent.days = 8;
        double expected = 134;
        assertEquals(expected, rent.CalculateRent(newBook), 0.001);
    }
}
