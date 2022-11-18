package assignment_2.Control_Coupling;


public class SalaryCalculator {
    public int CalculateSalary(String designation)
    {
        if(designation == "Manager") return 50000;
        if(designation == "Developer") return 30000;
        if(designation == "Tester") return 40000;
        else return 20000;
    }
}
