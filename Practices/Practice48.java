import java.util.Scanner;

public class Practice48 {
    public static void main(String[] args) {
        System.out.println("Welcome to find minimum number by ternary operator.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();

        int minNum;
        minNum = num1<num2 ? num1:num2;
        System.out.println("Your minimum number is: "+minNum);
    }
}
