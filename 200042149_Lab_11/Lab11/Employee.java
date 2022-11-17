package Lab11;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int ID;
    private int age;
    private int salary;
    private String name;
    private int experience;

    public Employee(int ID, String name)
    {
        this.ID = ID;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public  void setSalary(int salary)
    {
        this.salary = salary;
    }
    public void setID(int newID)
    {
        this.ID = newID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setExperience ( Date joining ) {
        Calendar calendar = Calendar . getInstance ( Locale. US ) ;
        calendar . setTime ( joining ) ;
        LocalDateTime now = LocalDateTime . now () ;
        int years = now . getYear () - calendar . get ( Calendar . YEAR ) ;
        this . experience = years ;
    }

    @Override
    public String toString() {
        return ID + "," + name + "," + experience;
    }
}
