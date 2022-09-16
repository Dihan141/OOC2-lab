package Task3;

import java.util.List;

public class Printer<T> {
    public String PrintList(List<T> list)
    {
        String lines = "";
        for(int i=0; i<list.size(); i++)
        {
            lines += list.get(i).toString() + "\n";
        }

        return lines;
    }
}
