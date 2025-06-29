import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("Simple intrest calculator\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a principle ammount: ");
        Double P = input.nextDouble();
        System.out.println("Please enter intrest rate: ");
        Double R = input.nextDouble();
        System.out.println("Please enter time period:");
        Double T = input.nextDouble();

        Double c = ((T*R*P)/100);

        System.out.println("Your Simple intrest is: " + c);
    }
}
