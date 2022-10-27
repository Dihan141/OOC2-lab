package Lab9;

import java.util.Comparator;

public class CompareByIdCgpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compareCg = Float.compare(o1.getCgpa(), o2.getCgpa());
        if(compareCg == 0)
            return o1.getId().compareTo(o2.getId());
        else
            return compareCg;
    }
}
