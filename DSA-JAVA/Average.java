import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Average Calulator.\n");
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter a second number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter a third number: ");
        int num3 = input.nextInt();

        System.out.println("your Average of all three numbers are " + (num1 + num2 + num3) / 3);
    }
}
