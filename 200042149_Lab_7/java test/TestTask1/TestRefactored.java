package Lab7.TestTask1;

import Lab7.Task1.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestRefactored {
    @Test
    public void isEligibleThesis(){
        RefactoredMasterProgram mp = new RefactoredMasterProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksThesis(){
        RefactoredMasterProgram mp = new RefactoredMasterProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(100, marks);
    }

    @Test
    public void isEligibleNonThesis(){
        RefactoredMasterProgram mp = new RefactoredMasterProgram(DegreeType.RegularNonThesis, "swe");
        boolean isEligible = mp.isEligible(4, "swe");
        assertTrue(isEligible);
        isEligible = mp.isEligible(4, "cse");
        assertFalse(isEligible);
    }

    @Test
    public void getMarksNonThesis(){
        RefactoredMasterProgram mp = new RefactoredMasterProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(60, 40, 0);
        assertEquals(100, marks);
    }

    @Test
    public void isEligibleThesisDifferentMajor(){
        RefactoredMasterProgram mp = new RefactoredMasterProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }

    @Test
    public void isEligibleExecutive(){
        RefactoredMasterProgram mp = new RefactoredMasterProgram(DegreeType.Executive, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.76f, "swe");
        assertTrue(isEligible);
    }
}
