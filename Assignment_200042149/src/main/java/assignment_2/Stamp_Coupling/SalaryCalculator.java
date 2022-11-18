package assignment_2.Stamp_Coupling;

public class SalaryCalculator {
    public int CalculateSalary(Employee employee)
    {
        if(employee.designation == "Manager") return 50000;
        if(employee.designation == "Developer") return 30000;
        if(employee.designation == "Tester") return 40000;
        else return 20000;
    }
}
