import java.util.Scanner;

class FibonacciRecursion{
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Series.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of terms you want to print: ");
        int num = input.nextInt();
        for(int i = 0; i<num;i++){
            System.out.print(FibonacciSeries(i)+" ");
        }
        
    }

    static int FibonacciSeries(int num1){
        
        if (num1 <= 1) {
            return num1;
        }
        return FibonacciSeries(num1-1)+FibonacciSeries(num1-2);
    }
}