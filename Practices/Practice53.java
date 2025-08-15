import java.util.Scanner;

public class Practice53 {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator made with switch.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter another number: ");
        int num2 = input.nextInt();
        System.out.print("Now, enter the operation: ");
        String operation = input.next();

        
        int result;
        result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            
            default -> -1;

        };
        System.out.println("Your result is: " + result);

    }
}
