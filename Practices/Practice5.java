import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println("welcone to basic maths\n");

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value: ");
        int a = input.nextInt();
        System.out.println("please enter another value: ");
        int b = input.nextInt();

        System.out.println("Adding: " + (a+b));
        System.out.println("Substracting: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modlus: " + (a%b));

    }
}
