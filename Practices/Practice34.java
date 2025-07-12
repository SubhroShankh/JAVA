import java.util.Scanner;

public class Practice34 {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checking program\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a digit for verification: ");
        int num = input.nextInt(); 
        
        boolean ispalindrome = palindromeCheck(num);
        if (ispalindrome) {
            System.out.println("The given number is palindrome Number.");
        } else {
            System.out.println("The given number is not a palindrome Number.");
        }
        
    }

    public static boolean palindromeCheck(int num1) {
        int reverseInt = reverseInt(num1);
        return reverseInt == num1;
    }

    public static int reverseInt(int num1) {
        int num = 0;
        while (num1>0) {
            int digit = num1 % 10;
            num = num * 10 + digit;
            num1 /= 10;
        }
        return num;
    }

}
