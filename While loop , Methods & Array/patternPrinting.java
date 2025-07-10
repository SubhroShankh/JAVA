import java.util.Scanner;

public class patternPrinting {
    public static void main(String[] args) {
        System.out.println("Welcome to star printing programme.\n ");
        userInput();
    }
    public static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many column you want to print: ");
        int a = input.nextInt();
        int b = 0;
          

        while (b < a) {
            System.out.print("*");
            int i = 0;
            while (i < b) {
                System.out.print("*");
                i++;

            }
            System.out.println();
            b++;
        }
        System.out.println("Thank you for using the programme.");
    }
}
