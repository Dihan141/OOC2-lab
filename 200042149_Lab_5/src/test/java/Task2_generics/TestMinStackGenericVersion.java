package Task2_generics;

import Task2.MinStack;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestMinStackGenericVersion {
    @Test
    public void TestMinInt()
    {
        Integer expected = 1;
        MinStackG<Integer> minStack = new MinStackG<>();

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
    public void TestMinDouble()
    {
        Double expected = 1.5;
        MinStackG<Double> minStack = new MinStackG<>();

        minStack.push(3.1);
        minStack.push(2.2);
        minStack.push(5.3);
        minStack.push(1.5);

        assertEquals(expected, minStack.Min());

        expected = 2.2;
        minStack.pop();

        assertEquals(expected, minStack.Min());
    }

    @Test
    public void TestMinFloat()
    {
        Float expected = 1.5f;
        MinStackG<Float> minStack = new MinStackG<>();

        minStack.push(3.1f);
        minStack.push(2.2f);
        minStack.push(5.3f);
        minStack.push(1.5f);

        assertEquals(expected, minStack.Min());

        expected = 2.2f;
        minStack.pop();

        assertEquals(expected, minStack.Min());
    }

}
