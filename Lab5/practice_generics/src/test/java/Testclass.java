import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Testclass {
    @Test
    public void TestPerson()
    {
        String expected = "Dihan Mym 21";
        Person person = new Person("Dihan", 21, "Mym");

        assertEquals(expected, person.toString());
    }

    @Test
    public void TestStudent()
    {
        String expected = "200042149 Dihan 21 Mym";
        Student student = new Student("200042149", "Dihan", 21, "Mym");

        assertEquals(expected, student.toString());
    }

    @Test
    public void TestFaculty()
    {
        String expected = "CSE Dihan 21 Mym";
        Faculty faculty = new Faculty("CSE", "Dihan", 21, "Mym");

        assertEquals(expected, faculty.toString());
    }

    @Test
    public void TestPrint()
    {
        String expected = "[Dihan Mym 21, Naz Dhk 21, Sian Dhk 21]";

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Dihan", 21, "Mym"));
        people.add(new Person("Naz", 21, "Dhk"));
        people.add(new Person("Sian", 21, "Dhk"));

        PrintList<Person> printList = new PrintList<>();

        assertEquals(expected, printList.PrintList(people));
    }
}
