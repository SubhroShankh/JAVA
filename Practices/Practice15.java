import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        System.out.println("Leap year checking Programe.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        if ( (year % 400 ==0) || (year % 4 == 0 && year % 100 != 0) ) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
