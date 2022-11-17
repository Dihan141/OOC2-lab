package assignment_1;

import java.util.Arrays;
import java.util.List;

public class Date {
    private List<Integer> month31days = Arrays.asList(1,3,5,7,8,10,12);
    private List<Integer> month30days = Arrays.asList(4,6,9,11);

    private int day;
    private int month;
    private int year;
    private int lastDayOfMonth;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        SetLastDay(month);
    }

    private void SetLastDay(int month)
    {
        if(month30days.contains(month))
            lastDayOfMonth = 30;
        else if(month31days.contains(month))
            lastDayOfMonth = 31;
        else if(isLeapYear())
            lastDayOfMonth = 29;
        else
            lastDayOfMonth = 28;
    }

    private boolean isLeapYear()
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private boolean isLastMonthOfYear()
    {
        return month == 12;
    }

    public String getNextDay()
    {
        if(day == lastDayOfMonth)
        {
            day = 0;
            if(isLastMonthOfYear())
            {
                month = 1;
                year++;
            }
            else
                month++;
        }
        day++;
        return day + "/" + month + "/" + year;
    }
}
