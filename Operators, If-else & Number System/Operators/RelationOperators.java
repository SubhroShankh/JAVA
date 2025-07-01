import java.util.Scanner;

public class RelationOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("num1 == num2: " + (num1 == num2)); // Check if num1 is equal to num2 = true if both numbers are equal
        System.out.println("num1 != num2: " + (num1 != num2)); // Check if num1 is not equal to num2 = true if both numbers are not equal
        System.out.println("num1 > num2: " + (num1 > num2)); // Check if num1 is greater than num2 = true if num1 is greater than num2
        System.out.println("num1 < num2: " + (num1 < num2)); // Check if num1 is less than num2 = true if num1 is less than num2
        System.out.println("num1 >= num2: " + (num1 >= num2)); // Check if num1 is greater than or equal to num2 = true if num1 is greater than or equal to num2
        System.out.println("num1 <= num2: " + (num1 <= num2)); // Check if num1 is less than or equal to num2 = true if num1 is less than or equal to num2
    }
}
  