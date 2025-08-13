import java.util.Scanner;

public class Practice50 {
    public static void main(String[] args) {
        System.out.println("Absolute value calculator through ternary.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
         
        int absoluteValue;
        absoluteValue =  num<0 ? -1*num:num;
        System.out.println("Your Absolute Value is: " + absoluteValue);

    }
}
