public class Faculty extends Person{
    String designation;

    Faculty(String designation, String name, int age, String address)
    {
        super(name, age, address);
        this.designation = designation;
    }

    @Override
    public String toString() {
        return designation + " " + name + " " + age + " " + address;
    }
}
