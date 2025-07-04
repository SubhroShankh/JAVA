import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {
        System.out.println("Bitwise Left shift \n"); 
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int a = input.nextInt();
        
        int c = a<<1 ;
        System.out.println("Result is: " + c);

    }
}
