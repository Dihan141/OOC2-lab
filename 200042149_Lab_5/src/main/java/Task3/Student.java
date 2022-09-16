package Task3;

public class Student extends Person{
    private String studentID;

    public Student(String studentID, String name, String address, int age)
    {
        super(name, address, age);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return studentID + "," + super.toString();
    }
}
