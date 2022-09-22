package Lab6.TestTask2;

import Lab6.Task2.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void TestDivisibleBy3()
    {
        Integer expected = 2;
        Algo algo = new Algo();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        assertEquals(expected, algo.Countlf(list, new DivisibleBy3()), 0);
    }

    @org.junit.Test
    public void TestOddCount()
    {
        Integer expected = 1;
        Algo algo = new Algo();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(16);
        list.add(6);

        assertEquals(expected, algo.Countlf(list, new countOdds()), 0);
    }

    @org.junit.Test
    public void TestStringLength()
    {
        Integer expected = 2;
        Algo algo = new Algo();

        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Beautiful");

        assertEquals(expected, algo.Countlf(list, new StringLength()), 0);
    }
}
