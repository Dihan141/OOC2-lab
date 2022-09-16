package Task1;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TestFizzBuzz {
    @Test
    public void TestFizz()
    {
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(6));
    }

    @Test
    public void TestBuzz()
    {
        String expected = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(14));
    }

    @Test
    public void TestFizzbuzz()
    {
        String expected ="Fizzbuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(21));
    }

    @Test
    public void TestGotcha()
    {
        String expected = "Gotcha";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(13));
    }
}
