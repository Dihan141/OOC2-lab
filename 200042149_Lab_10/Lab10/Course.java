package Lab10;

import java.util.SplittableRandom;
@DevelopmentHistory
public class Course {
    String courseCode, name, type;
    Float credit;

    @DevelopmentHistoryWithReviewer
    public Course(String name, String courseCode, String type, Float credit)
    {
        this.name = name;
        this.courseCode = courseCode;
        this.type = type;
        this.credit = credit;
    }
}
