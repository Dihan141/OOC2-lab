package Lab9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ResultPublication {

    public String Publish(List<Student> students, Comparator comparator)
    {
        String sortedList = "";
        students.sort(comparator);
        for(int i=0; i<students.size(); i++)
        {
            sortedList += students.get(i).getId() + "," + students.get(i).name + "," + students.get(i).cgpa + "\n";
        }
        return sortedList;
    }
}
