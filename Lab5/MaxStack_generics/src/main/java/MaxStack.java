import java.util.*;
import  javafx.util.*;

public class MaxStack<T extends Comparable> {
    private Stack<Pair<T, T>> stack = new Stack<>();

    public void push(T val){
        if(stack.empty())
        {
            stack.push(new Pair<>(val, val));
        }
        else
        {
            if(val.compareTo(stack.peek().getValue()) > 0)
            {
                stack.push(new Pair<>(val, val));
            }
            else
            {
                T tmp = stack.peek().getValue();
                stack.push(new Pair<>(val, tmp));
            }
        }
    }

    public void pop(){
        stack.pop();
    }

    public T max()
    {
        return stack.peek().getValue();
    }
}