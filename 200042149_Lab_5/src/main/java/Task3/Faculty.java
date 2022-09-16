package Task3;

public class Faculty extends Person{
    private String designation;

    public Faculty(String designation, String name, String address, int age)
    {
        super(name, address, age);
        this.designation = designation;
    }

    @Override
    public String toString() {
        return designation + "," + super.toString();
    }
}
