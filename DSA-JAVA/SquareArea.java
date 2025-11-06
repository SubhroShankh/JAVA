import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        System.out.println("Area of a square.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the side of a square: ");
        int side = input.nextInt();
        System.out.println("Arae of square is: " + Math.pow(side, 2));
    }
}
