import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial generator.\n");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        long fact = factorialitrative(num);
        long factorial = factorial(num);
        System.out.println("Factorial of your number is: "+ fact);
        System.out.println("Factorial of your number is: "+ factorial);
    }


    public static long factorial(int num1){
        if (num1 == 1) {
            return 1;
        }

        return num1*factorial(num1-1);
    }

    
    
    public static long factorialitrative(int num1){
        long mul = 1;
        for(int i = num1 ; i>=1 ; i-- ){
            
            mul *= i;
        }
        return mul;
    }
}
