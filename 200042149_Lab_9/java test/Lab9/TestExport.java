package Lab9;

import org.junit.Test;

import java.io.IOException;

public class TestExport {
    @Test
    public void TestCsvExport() throws InvalidStudentIDException, IOException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042119", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        Exporter exporter = new Exporter();
        exporter.Export(studentEnrollment.getAll(), new ExportToCSV());
    }

    @Test
    public void TestXmlExport() throws InvalidStudentIDException, IOException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042119", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        Exporter exporter = new Exporter();
        exporter.Export(studentEnrollment.getAll(), new ExportToXML());
    }
}
