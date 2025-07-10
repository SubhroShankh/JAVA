import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of " + first + " and " + second + " is: " + sum);
    } 

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int Number = input.nextInt();
       return Number;
    }

    public static void  greet(){
        System.out.println("Welcome to calculator.\n");
    }


}