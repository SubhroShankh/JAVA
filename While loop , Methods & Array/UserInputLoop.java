import java.util.Scanner;

public class UserInputLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value from which you want to print: ");
        int a = input.nextInt();
        System.out.println("Please enter the value to which you want to print: ");
        int b = input.nextInt();
        
        while (a <= b) {
            System.out.println("Your print value is: ");
            System.out.println(a);
            a++ ;
        }
    }
}
