package Task2;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TestMinStack {
    @Test
    public void TestMin()
    {
        int expected = 1;
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        assertEquals(expected, minStack.Min());

        expected = 2;
        minStack.pop();

        assertEquals(expected, minStack.Min());
    }

    @Test
    public void TestMin1()
    {
        int expected = 3;

        MinStack minStack = new MinStack();
        minStack.push(12);
        minStack.push(3);
        minStack.push(4);

        assertEquals(expected, minStack.Min());
    }
}
