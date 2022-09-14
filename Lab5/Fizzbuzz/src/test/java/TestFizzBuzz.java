import org.junit.Test;

import static org.junit.Assert.*;

public class TestFizzBuzz {

    @Test
    public void TestFizz(){
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.getFizzyBuzz(6));
    }

    @Test
    public void TestBuzz(){
        String expected = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.getFizzyBuzz(10));
    }

    @Test
    public void TestFizzbuzz()
    {
        String expected = "Fizzbuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.getFizzyBuzz(15));
    }

    @Test
    public void TestBoom()
    {
        String expected = "Boom";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.getFizzyBuzz(13));
    }
}
