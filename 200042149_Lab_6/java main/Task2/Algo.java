package Lab6.Task2;

import java.util.List;

public class Algo {
    int count = 0;
    public<T> int Countlf(List<T> list, Iproperties<T> properties)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(properties.Check(list.get(i)) == true) count++;
        }
        return count;
    }
}
