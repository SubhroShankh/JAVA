import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        System.out.println("Perimeter of rectangle\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of a rectangle: ");
        int a = input.nextInt();
        System.out.println("Please enter breath of a rectangle: ");
        int b = input.nextInt();

        
        System.out.println("Perimeter of rectangle: " + (2*(a+b)));
        
    }
}
