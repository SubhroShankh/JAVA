import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        System.out.println("Welcome to arae of triangle calculator:\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the height length of triangle in cms: ");
        Double a = input.nextDouble();
        System.out.println("Please enter the base length of triangle in cms: ");
        Double b = input.nextDouble();

        Double c = (0.5*(a*b));

        System.out.println(" Arae of triangle calculator :" + c);

    }
}
