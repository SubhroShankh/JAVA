import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        System.out.println("Odd and Even determinig programe.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int a = input.nextInt();

        if ( a % 2 == 0) {
            System.out.print("The given number is Even");
        } else {
            System.out.println("The given number is odd. ");
        }
    }
}
