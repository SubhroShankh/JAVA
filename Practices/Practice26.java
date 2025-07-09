import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Calculator.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        int num = input.nextInt();
        long a = factorialCalculator(num);
        System.out.println("Factorial is: " + a);



    }

    public static long factorialCalculator(int num) {
        if (num<2 ){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=num) {
            fact *= i;
            i++; 
        }
        return fact;
    }
} 