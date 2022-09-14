import org.junit.Test;

import static org.junit.Assert.*;

public class TestMaxStack {
    @Test
    public void TestMax(){
        int expected = 5;
        MaxStack maxStack = new MaxStack();
        maxStack.push(3);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.push(1);

        assertEquals(expected, maxStack.max());

        maxStack.pop();
        assertEquals(expected, maxStack.max());
    }

    @Test
    public void TestMax1(){
        int expected = 4;
        MaxStack maxStack = new MaxStack();
        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(3);
        maxStack.push(4);

        assertEquals(expected, maxStack.max());

        maxStack.pop();
        expected = 3;
        assertEquals(expected, maxStack.max());
    }
}
