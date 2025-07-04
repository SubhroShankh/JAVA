import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {
        System.out.println("Bitwise NOT \n"); // NOT is also known is compliment
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int a = input.nextInt();
        
        int c = ~a ;
        System.out.println("Result is: " + c);

    }
}
