import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find whether your number is positive or negative number.\n");
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        if (num1 > 0) {
            System.out.println("your number is a positive number.\n");
        }
        if (num1 < 0) {
            System.out.println("your number is a negative number.\n");
        }
        if (num1 == 0) {
            System.out.println("Your given number is zero.");
        }
    }
}
