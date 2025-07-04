import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        System.out.println("Bitwise And \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int a = input.nextInt();
        System.out.print("Please enter another value: ");
        int b = input.nextInt();

        int c = a & b ;
        System.out.println("Result is: " + c);

    }
}
