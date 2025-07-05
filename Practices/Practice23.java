import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        System.out.println("Even and Odd determining Programme using Bitwise Operator. \n");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a vale: ");
        int Num = input.nextInt();

        int c = Num & 1 ;

        if (c == 0){
            System.out.println("The given value is Even number.");
        } else {
            System.out.println("The given number is Odd number.");
        }
    }
}