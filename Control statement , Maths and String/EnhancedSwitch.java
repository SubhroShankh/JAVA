import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to day of the week detector.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day in number: ");
        int day = input.nextInt();

        String dayStr = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Saturday";
            
            default -> "Invalid";
        };
        System.out.println(dayStr);

    }
}
