package Lab11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDB {
    public List<Employee> employees;

    public void getList()
    {
        for(int i=0; i<employees.size(); i++)
        {
            System.out.println(employees.get(i).toString());
        }
    }

    public List<Employee> ageFilter(int age)
    {
        return employees.stream()
                .filter(e -> e.getAge() == age)
                .collect(Collectors.toList());
    }

    public List<Employee> salaryFilter(int salary)
    {
        return employees.stream()
                .filter((e -> e.getSalary() > salary))
                .collect(Collectors.toList());
    }

    public List<Employee> incrementMapper(int amount)
    {
        employees.stream()
                .forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * amount)/100));
                return new ArrayList<>(employees);
    }

    public int totalSalaryOfFilteredEmployee(int salary)
    {
        List<Employee> filtered = employees.stream()
                .filter(e -> e.getSalary() > salary)
                .collect(Collectors.toList());
        return filtered.stream().mapToInt(e -> e.getSalary()).sum();
    }
    public EmployeeDB(){
        employees = new ArrayList<>();
    }
    public void save(Employee employee)
    {
        FileWriter fw = null;

        try{
            fw = new FileWriter("myfile.txt", true);
            fw.write(employee.toString() + "\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

        // this code will give error if there is no file
    public void anotherSave () {
        try {
            Files.write ( Paths.get (" myfile . txt ") , " the text ". getBytes () ,
                    StandardOpenOption.APPEND ) ;
            } catch ( IOException e ) {
                e . printStackTrace () ;
            }
    }

    public void Load(){
        FileReader fr = null;

        try {
            fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
            {
                String[] str = line.split(",");
                Employee employee = new Employee(Integer.parseInt(str[0]), str[1]);
                addEmployee(employee);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
}

