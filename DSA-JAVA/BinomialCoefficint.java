import java.util.Scanner;

public class BinomialCoefficint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Binomial of the given number is: " + BinomialCalculator(a, b));

    }

    public static int BinomialCalculator(int a, int b) {
        int A = Factorial(a);
        int B = Factorial(b);
        int AB = Factorial((a - b));
        return A / (B * AB);

    }

    public static int Factorial(int a) {
        int n = 1;
        for (int i = 1; i <= a; i++) {
            n = n * i;
        }
        return n;
    }
}