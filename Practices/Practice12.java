import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        System.out.println("Positive and Negative determinig programe.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = input.nextInt();
        
        if (a>0) {
            System.out.println("The given number is a Positive number. ");
        }else  {
            if (a == 0)  {
                System.out.println("The given number is neither Positive nor Negative .");
            } else {
                System.out.println("The given number is Negative number.");
            }
        
    }
}
}
   