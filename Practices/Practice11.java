import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        System.out.println("Welcome to temperature conversion!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;

        System.out.print("Temperature in Celsius: " + c);
}
}
