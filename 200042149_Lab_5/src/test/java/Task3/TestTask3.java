package Task3;

import org.testng.annotations.Test;
import org.testng.internal.annotations.FactoryAnnotation;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.*;

public class TestTask3 {
    @Test
    public void TestPerson()
    {
        String expected = "Dihan,Mym,21";

        Person person = new Person("Dihan", "Mym", 21);
        assertEquals(expected, person.toString());
    }

    @Test
    public void TestStudent()
    {
        String expected = "200042149,Dihan,Mym,21";

        Student student = new Student("200042149", "Dihan", "Mym", 21);
        assertEquals(expected, student.toString());
    }

    @Test
    public void TestFaculty()
    {
        String expected = "Professor,Dihan,Mym,21";

        Faculty faculty = new Faculty("Professor","Dihan", "Mym", 21);
        assertEquals(expected, faculty.toString());
    }

    @Test
    public void TestPrinterForPerson()
    {
        String expected = "Dihan,Mym,21\n" +
                "Nazmul,Dhk,21\n" +
                "Sian,Dhk,21\n";

        Printer<Person> printer = new Printer<>();
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Dihan", "Mym", 21));
        persons.add(new Person("Nazmul", "Dhk", 21));
        persons.add(new Person("Sian","Dhk", 21));

        assertEquals(expected, printer.PrintList(persons));
    }

    @Test
    public void TestPrinterForStudent()
    {
        String expected = "200042149,Dihan,Mym,21\n" +
                "200042118,Nazmul,Dhk,21\n" +
                "200042151,Sian,Dhk,21\n";

        Printer<Student> printer = new Printer<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("200042149","Dihan", "Mym", 21));
        students.add(new Student("200042118","Nazmul", "Dhk", 21));
        students.add(new Student("200042151","Sian","Dhk", 21));

        assertEquals(expected, printer.PrintList(students));
    }

    @Test
    public void TestPrinterForFaculty()
    {
        String expected = "Professor,Dihan,Mym,21\n" +
                "Ass.Professor,Nazmul,Dhk,21\n" +
                "Lecturer,Sian,Dhk,21\n";

        Printer<Faculty> printer = new Printer<>();
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty("Professor","Dihan", "Mym", 21));
        faculties.add(new Faculty("Ass.Professor","Nazmul", "Dhk", 21));
        faculties.add(new Faculty("Lecturer","Sian","Dhk", 21));

        assertEquals(expected, printer.PrintList(faculties));
    }
}
