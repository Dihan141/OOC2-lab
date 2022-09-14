public class Person {
    String name, address;
    int age;

    Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " +address + " " + age;
    }
}
