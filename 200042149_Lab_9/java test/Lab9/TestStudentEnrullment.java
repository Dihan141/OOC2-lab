package Lab9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestStudentEnrullment {
    @Test
    public void TestGetStudent() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042119", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        String expected = "Dihan";
        assertEquals(expected, studentEnrollment.getStudent("200042149").name);
        assertEquals(expected, studentEnrollment.getStudent(s1).name);
    }

    @Test
    public void TestPrint() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042119", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        String expected = "200042149 Dihan SWE 4.0\n" +
                "200042173 Anan SWE 2.0\n" +
                "200042151 Sian SWE 2.35\n" +
                "200042119 Nazmul CSE 3.0\n";
        assertEquals(expected, studentEnrollment.print());
    }

    @Test
    public void TestRemove() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042119", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        studentEnrollment.removeStudent(s4);

        String expected = "200042149 Dihan SWE 4.0\n" +
                "200042173 Anan SWE 2.0\n" +
                "200042151 Sian SWE 2.35\n";
        assertEquals(expected, studentEnrollment.print());
        expected = "200042149 Dihan SWE 4.0\n" +
                "200042173 Anan SWE 2.0\n";

        studentEnrollment.removeStudent("200042119");
    }
}
