package Lab7.Task1;

public class RegularThesis implements IMastersProgram{
    String major;
    public RegularThesis(String major)
    {
        this.major = major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        return this.major.equals(major) && cgpa >= 3.8;
    }

    @Override
    public int getMarks(int theoryM, int thesisM, int pm) {
        return theoryM + pm/2;
    }
}
