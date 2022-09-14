import org.junit.Test;

import static org.junit.Assert.*;

public class TestMaxStack {
    @Test
    public void TestMax(){
        Integer expected = 5;
        MaxStack<Integer> maxStack = new MaxStack<Integer>();
        maxStack.push(3);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.push(1);

        assertEquals(expected, maxStack.max());

        maxStack.pop();
        assertEquals(expected, maxStack.max());
    }

    @Test
    public void TestMaxDouble(){
        Double expected = 4.5;
        MaxStack<Double> maxStack = new MaxStack<Double>();
        maxStack.push(1.2);
        maxStack.push(2.3);
        maxStack.push(3.4);
        maxStack.push(4.5);

        assertEquals(expected, maxStack.max());

        maxStack.pop();
        expected = 3.4;
        assertEquals(expected, maxStack.max());
    }

    @Test
    public void TestMaxFloat(){
        Float expected = 4.5f;
        MaxStack<Float> maxStack = new MaxStack<Float>();
        maxStack.push(1.2f);
        maxStack.push(2.3f);
        maxStack.push(3.4f);
        maxStack.push(4.5f);

        assertEquals(expected, maxStack.max());

        maxStack.pop();
        expected = 3.4f;
        assertEquals(expected, maxStack.max());
    }
}
