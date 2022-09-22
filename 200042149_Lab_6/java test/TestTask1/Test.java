package Lab6.TestTask1;

import Lab6.Task1.GenricMaxStack;

import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void TestMaxInt()
    {
        Integer expected = 5;
        GenricMaxStack<Integer> maxStack = new GenricMaxStack<>();

        maxStack.push(3);
        maxStack.push(2);
        maxStack.push(5);

        assertEquals(expected, maxStack.Max());
    }

    @org.junit.Test
    public void TestMaxInt1()
    {
        Integer expected = 2;
        GenricMaxStack<Integer> maxStack = new GenricMaxStack<>();

        maxStack.push(2);
        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.pop();

        assertEquals(expected, maxStack.Max());
        maxStack.pop();
        assertEquals(expected, maxStack.Max());
    }

    @org.junit.Test
    public void TestMaxDouble()
    {
        Double expected = 100.00;
        GenricMaxStack<Double> maxStack = new GenricMaxStack<>();

        maxStack.push(49.75);
        maxStack.push(23.54);
        maxStack.push(100.00);

        assertEquals(expected, maxStack.Max());

        expected = 49.75;
        maxStack.pop();
        assertEquals(expected, maxStack.Max());
    }

    @org.junit.Test
    public void TestMaxString()
    {
        GenricMaxStack<String> maxStack = new GenricMaxStack<>();

        maxStack.push("OOC is bad");
        maxStack.push("Nothing to understand");
        maxStack.push("Try hard");

        String expected = "Try hard";
        assertEquals(expected, maxStack.Max());

        expected = "OOC is bad";
        maxStack.pop();
        assertEquals(expected, maxStack.Max());
    }

}
