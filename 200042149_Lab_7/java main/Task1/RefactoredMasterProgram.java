package Lab7.Task1;

public class RefactoredMasterProgram {
    private IMastersProgram type;

    public RefactoredMasterProgram(DegreeType type, String major) {
        this.type = new MastersFactory().chooseMasterprogram (type,major);
    }

    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }
}
