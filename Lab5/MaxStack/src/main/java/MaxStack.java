import java.util.*;
import  javafx.util.*;

public class MaxStack {
    private Stack<Pair<Integer, Integer>> stack = new Stack<>();

    public void push(int val){
        if(stack.empty())
        {
            stack.push(new Pair<>(val, val));
        }
        else
        {
            if(val > stack.peek().getValue())
            {
                stack.push(new Pair<>(val, val));
            }
            else
            {
                int tmp = stack.peek().getValue();
                stack.push(new Pair<>(val, tmp));
            }
        }
    }

    public void pop(){
        stack.pop();
    }

    public int max()
    {
        return stack.peek().getValue();
    }
}
