import java.util.Scanner;

public class Practice52 {
    public static void main(String[] args) {
        System.out.println("Month printing calculator.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the month in number: ");
        int num = input.nextInt();
        
        String month;
        month = switch(num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Octobur";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Inpuut";
        };

        System.out.println("Your enter month is: " + month);
    }
}
