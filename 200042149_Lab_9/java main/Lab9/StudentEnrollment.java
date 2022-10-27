package Lab9;

import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment {
    private List<Student> students = new ArrayList<>();

    public void removeStudent(String sid)
    {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).getId().equals(sid))
                students.remove(i);
        }
    }

    public Student getStudent(String sid) throws InvalidStudentIDException {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).getId().equals(sid))
                return students.get(i);
        }
        return new Student("null","null",Program.SWE,0);
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public  void removeStudent(Student student)
    {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).equals(student))
                students.remove(i);
        }
    }

    public Student getStudent(Student student) throws InvalidStudentIDException {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).equals(student))
                return students.get(i);
        }
        return new Student("null","null",Program.SWE,0);
    }

    public List<Student> getAll()
    {
        return students;
    }

    public String print()
    {
        String s = "";
        for(int i=0; i<students.size(); i++)
        {
            s += students.get(i).toString();
        }
        return s;
    }
}
