package SwitchStatement;
import java.util.Scanner;

public class EnhanceSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter day number : ");
        int dayNumber = s.nextInt();
        s.close();

        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number! ");
        }
    }
}
