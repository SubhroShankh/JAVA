import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
       // System.out.println("Enter your name: ");
        //String name = input.nextLine();
        //System.out.println("Welcome " + name + " to my profile");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator: ");
        System.out.println("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("Please enter second name: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is: " + sum);
    }
}
