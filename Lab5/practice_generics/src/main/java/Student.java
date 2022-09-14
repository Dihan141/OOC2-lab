public class Student extends Person{
    String studentID;
    Student(String studentID, String name, int age, String address)
    {
        super(name, age, address);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return studentID + " " + name + " " + age + " " + address;
    }
}
