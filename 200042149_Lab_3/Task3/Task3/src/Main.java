import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        try{
            TestInvalidFormatException.Validate(s);
        }
        catch (InvalidFormatException ex)
        {
            System.out.println(ex);
        }
    }
}