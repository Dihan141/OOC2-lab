import org.junit.Test;
import task3.Calculator;

import static org.junit.Assert.*;

public class TestTask3 {
    @Test
    public void TestAdd()
    {
        Calculator calculator = new Calculator();
        double expected = 15.0;
        assertEquals(expected, calculator.add(8.0, 7.0), 0.001);
    }

    @Test
    public void TestSub()
    {
        Calculator calculator = new Calculator();
        double expected = 7.0;
        assertEquals(expected, calculator.subtract(15.0, 8.0), 0.001);
    }

    @Test
    public void TestMul()
    {
        Calculator calculator = new Calculator();
        double expected = 15.0;
        assertEquals(expected, calculator.multiply(3.0, 5.0), 0.001);
    }

    @Test
    public void Testdivide()
    {
        Calculator calculator = new Calculator();
        double expected = 15.0;
        assertEquals(expected, calculator.divide(30.0, 2.0), 0.001);
    }
}
