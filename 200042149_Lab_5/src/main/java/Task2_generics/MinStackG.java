package Task2_generics;

import javafx.util.Pair;

import java.util.Stack;

public class MinStackG<T extends Comparable> {
    private Stack<Pair<T, T>> stack = new Stack<>();

    public void push(T val)
    {
        if(stack.empty())
        {
            stack.push(new Pair<>(val, val));
        }
        else
        {
            if(val.compareTo(stack.peek().getValue()) < 0)
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

    public T Min()
    {
        return stack.peek().getValue();
    }
}