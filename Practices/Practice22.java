import java.util.Scanner;

public class Practice22 {
    public static void main(String[] args) {
        System.out.println("Bitwise Right shift \n"); 
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int a = input.nextInt();
        
        int c = a>>1 ;
        System.out.println("Result is: " + c);

    }
}
