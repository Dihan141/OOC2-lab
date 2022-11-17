package Lab10;

import java.util.ArrayList;
import java.util.List;

@DevelopmentHistory(version = 2, developer = "Dihan", tester = "Dihan")
public class Faculty {
    private String name, designation;
    private int salary;
    private List<Course> courses;

    @DevelopmentHistoryWithReviewer(version = 4, developer = "Dihan", tester = "Dihan", reviewers = {"Rhidwan", "Rashid", "Dihan"})
    public Faculty(String name, String designation, int salary)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @DevelopmentHistoryWithReviewer(version = 4, developer = "Dihan", tester = "Dihan", reviewers = {"Rhidwan", "Rashid", "Dihan"})
    public Faculty(String name, String designation, int salary, List<Course> courses)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courses = courses;
    }

    @DevelopmentHistoryWithReviewer(version = 4, developer = "Dihan", tester = "Dihan", reviewers = {"Rhidwan", "Rashid", "Dihan"})
    public void Teach(Course course)
    {
        System.out.println("Teaching " + course.name);
    }

    @DevelopmentHistoryWithReviewer(version = 4, developer = "Dihan", tester = "Dihan", reviewers = {"Rhidwan", "Rashid", "Dihan"})
    public void Research(String topic)
    {
        System.out.println("researching " + topic);
    }
}
