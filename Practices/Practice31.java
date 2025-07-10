import java.util.Scanner;

public class Practice31 {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse the digit programme.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit: ");
        int num = input.nextInt();
        int a  = reverseInt(num);
        System.out.println("Your reverse value is: " + a);

    }

    public static int reverseInt(int num1) {
        
        int x = 0;
        while (num1>0) {
            int digit = num1 % 10;
            x = x *10 +digit;  
            num1 = num1/10;
        }
        return x;
    }
}
