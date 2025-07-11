import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci series.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit which you want to print Fibonacci series: ");
        int num = input.nextInt();
        System.out.println("Here is the fibonacci Series");
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num1) {
        if (num1<0) return;
        System.out.print("0 ");
        if (num1 == 0) return;
        System.out.print("1 ");

        int first = 0  , second = 1;
        while (first + second <= num1) {
              int third = first + second;
              System.out.print(third + " ");
              first = second ;
              second = third ;

        }
}}
