package Lab9;

import java.security.PublicKey;

public class Student {
    private String id;
    public String name;
    public Program program;
    public float cgpa;

    public Student(String id, String name, Program program, float cgpa) throws InvalidStudentIDException {
        this.setId(id);
        this.name = name;
        this.program = program;
        this.cgpa = cgpa;
    }

    public void setId(String id) throws InvalidStudentIDException {
        if(id.length() == 9)
            this.id = id;
        else
            throw new InvalidStudentIDException("Invalid student ID");
    }

    public String getId()
    {
        return id;
    }

    public float getCgpa()
    {
        return cgpa;
    }

    public String Study()
    {
        return "Studying...";
    }

    public String Play()
    {
        return "Playing...";
    }

    @Override
    public String toString() {
        String s = id + " " + name + " " + program + " " + cgpa + "\n";
        return s;
    }
}
