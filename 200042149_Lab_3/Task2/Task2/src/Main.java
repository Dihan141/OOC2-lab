import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

//        System.out.println(EnumDirection.Direction.valueOf(s).getCurrDir());
//        System.out.println(EnumDirection.Direction.valueOf(s).getDir());

        System.out.println(Direction.valueOf(s).getCurrDir());
        System.out.println(Direction.valueOf(s).getDir());
    }
}