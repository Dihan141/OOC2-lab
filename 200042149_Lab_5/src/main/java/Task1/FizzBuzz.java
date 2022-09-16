package Task1;

public class FizzBuzz {
    public String getFizzyBuzz(int num)
    {
        if(num%3 == 0 && num%7 == 0) return "Fizzbuzz";
        else if(num%3 == 0) return "Fizz";
        else if(num%7 == 0) return "Buzz";
        else return "Gotcha";
    }
}
