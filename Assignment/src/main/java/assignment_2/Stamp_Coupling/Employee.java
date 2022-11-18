package assignment_2.Stamp_Coupling;

public class Employee {
    private String name;
    private int age;
    public String designation;
    private int salary;

    public Employee(String name, int age, String designation)
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public void SetSalary()
    {
        this.salary = new SalaryCalculator().CalculateSalary(this);
    }
}
