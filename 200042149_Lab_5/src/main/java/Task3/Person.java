package Task3;

import java.security.PublicKey;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + address + "," + age;
    }
}
