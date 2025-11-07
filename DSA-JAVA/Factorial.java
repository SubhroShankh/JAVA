import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the the number you want the Factorial of: ");
        int num = input.nextInt();
        int mul = 1;
        for (int i = num; i > 0; i--) {
            mul *= i;
        }
        System.out.println(mul);
    }
}
