import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to store.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Price of pencil: ");
        Float pencil = input.nextFloat();
        System.out.print("Price of pen: ");
        Float pen = input.nextFloat();
        System.out.print("Price of eraser: ");
        Float eraser = input.nextFloat();
        System.out.println("Total cost of your items including 18% GST is "
                + (((pen + pencil + eraser) * 0.18) + (pen + pencil + eraser)));
    }
}
