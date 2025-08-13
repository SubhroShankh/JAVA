import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Welcome to day of the weak detector.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your day in number: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: // fall through
            case 7:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
