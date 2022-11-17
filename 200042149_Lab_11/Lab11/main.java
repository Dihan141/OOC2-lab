package Lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class main {
    public static void main(String[] args){

        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.Load();
        employeeDB.getList();
    }
}
