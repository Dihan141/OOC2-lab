package assignment1;

import assignment_1.Date;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDate {
    @Test
    public void TestNormalCase()
    {
        String expected = "8/8/2002";
        Date date = new Date(7, 8, 2002);

        assertEquals(expected, date.getNextDay());
    }

    @Test
    public void TestLastDayOfMonth()
    {
        String expected = "1/9/2002";
        Date date = new Date(31, 8, 2002);

        assertEquals(expected, date.getNextDay());
    }

    @Test
    public void TestLastMonthOfYear()
    {
        String expected = "1/1/2003";
        Date date = new Date(31, 12, 2002);

        assertEquals(expected, date.getNextDay());
    }

    @Test
    public void TestLastDayOfFebruaryWithLeapYear()
    {
        String expected = "29/2/2020";
        Date date = new Date(28, 2, 2020);

        assertEquals(expected, date.getNextDay());

        expected = "1/3/2020";
        Date date1 = new Date(29, 2, 2020);

        assertEquals(expected, date1.getNextDay());
    }

    @Test
    public void TestLastDayOfFebruaryWithoutLeapYear()
    {
        String expected = "28/2/2021";
        Date date = new Date(27, 2, 2021);

        assertEquals(expected, date.getNextDay());

        expected = "1/3/2021";
        Date date1 = new Date(28, 2, 2021);

        assertEquals(expected, date1.getNextDay());
    }
}
