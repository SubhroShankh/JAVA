import java.util.Scanner;

public class Practice49 {
    public static void main(String[] args) {
        System.out.println("Programme to find if the given number is odd or even by ternary.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        String evnOdd;
        evnOdd = num%2 == 0 ? "Even":"Odd";
        System.out.println("The given number is: " + evnOdd);
    }
}
