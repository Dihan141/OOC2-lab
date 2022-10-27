package Lab9;

import java.util.Comparator;

public class CompareByCgpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getCgpa(), o2.getCgpa());
    }
}
