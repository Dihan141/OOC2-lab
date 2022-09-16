package Task2;

import javafx.util.Pair;

import java.util.Stack;

public class MinStack {
    private Stack<Pair<Integer, Integer>> stack = new Stack<>();

    public void push(int val)
    {
        if(stack.empty())
        {
            stack.push(new Pair<>(val, val));
        }
        else
        {
            if(val < stack.peek().getValue())
            {
                stack.push(new Pair<>(val, val));
            }
            else
            {
                stack.push(new Pair<>(val, stack.peek().getValue()));
            }
        }
    }

    public void pop()
    {
        stack.pop();
    }

    public int Min()
    {
        return stack.peek().getValue();
    }
}
