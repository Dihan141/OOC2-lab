package Lab6.TestTask3;

import Lab6.Task3.Calculate;
import Lab6.Task3.DayLabor;
import Lab6.Task3.MonthlyContract;
import Lab6.Task3.Permanent;

import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void TesTPermanentWorker()
    {
        Double expected = 20.75;
        Calculate calculate = new Calculate();
        Permanent permanent = new Permanent(200, 25);

        assertEquals(expected, calculate.CalculateYearlyVacation(permanent), 0.0001);

        expected = 7920.00;
        assertEquals(expected, calculate.CalculateYearlyWage(permanent), 0.0001);
    }

    @org.junit.Test
    public void TestDayLabor()
    {
        Double expected = 0.00;

        Calculate calculate = new Calculate();
        assertEquals(expected, calculate.CalculateYearlyVacation(new DayLabor(100, 30)), 0.0001);

        expected = 132.00;
        assertEquals(expected, calculate.CalculateYearlyWage(new DayLabor(100, 30)), 0.0001);
    }

    @org.junit.Test
    public void TestMonthlyContract()
    {
        Double expected = 21.00;

        Calculate calculate = new Calculate();
        MonthlyContract monthlyContract = new MonthlyContract(150);

        assertEquals(expected, calculate.CalculateYearlyVacation(monthlyContract), 0.0001);

        expected = 1800.00;
        assertEquals(expected, calculate.CalculateYearlyWage(monthlyContract), 0.0001);
    }

}
