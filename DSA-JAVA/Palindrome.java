import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int reverse = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (originalNum == reverse) {
            System.out.println("Yes it is Palindrome");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}
