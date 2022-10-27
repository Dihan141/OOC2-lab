package Lab9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestResultPublication {
    @Test
    public void TestSortByID() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042118", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        ResultPublication resultPublication = new ResultPublication();
        String expected = "200042118,Nazmul,3.0\n" +
                "200042149,Dihan,4.0\n" +
                "200042151,Sian,2.35\n" +
                "200042173,Anan,2.0\n";
        assertEquals(expected, resultPublication.Publish(studentEnrollment.getAll(),new CompareById()));
    }

    @Test
    public void TestSortByCgpa() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042118", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        ResultPublication resultPublication = new ResultPublication();
        String expected = "200042173,Anan,2.0\n" +
                "200042151,Sian,2.35\n" +
                "200042118,Nazmul,3.0\n" +
                "200042149,Dihan,4.0\n";
        assertEquals(expected, resultPublication.Publish(studentEnrollment.getAll(),new CompareByCgpa()));
    }

    @Test
    public void TestSortByName() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042118", "Nazmul", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);

        ResultPublication resultPublication = new ResultPublication();
        String expected = "200042173,Anan,2.0\n" +
                "200042149,Dihan,4.0\n" +
                "200042118,Nazmul,3.0\n" +
                "200042151,Sian,2.35\n";
        assertEquals(expected, resultPublication.Publish(studentEnrollment.getAll(),new CompareByName()));
    }

    @Test
    public void TestSortByCgpaID() throws InvalidStudentIDException {
        Student s1 = new Student("200042149", "Dihan", Program.SWE, 4.00f);
        Student s2 = new Student("200042173", "Anan", Program.SWE, 2.00f);
        Student s3 = new Student("200042151", "Sian", Program.SWE, 2.35f);
        Student s4 = new Student("200042118", "Nazmul", Program.CSE, 3.00f);
        Student s5 = new Student("200042115", "Akash", Program.CSE, 3.00f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);
        studentEnrollment.addStudent(s4);
        studentEnrollment.addStudent(s5);

        ResultPublication resultPublication = new ResultPublication();
        String expected = "200042173,Anan,2.0\n" +
                "200042151,Sian,2.35\n" +
                "200042115,Akash,3.0\n" +
                "200042118,Nazmul,3.0\n" +
                "200042149,Dihan,4.0\n";
        assertEquals(expected, resultPublication.Publish(studentEnrollment.getAll(),new CompareByIdCgpa()));
    }
}
