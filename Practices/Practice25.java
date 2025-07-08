import java.util.Scanner;

public class Practice25 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of all odd numbers programme.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number till which you want to add (has to be a odd number): ");
        int num = input.nextInt();
        int a = SumOdd(num);
        System.out.println("your sum is: " + a);
         
    }

    public static  int SumOdd(int num) {
        int sum = 0;
        int i = 1;
        while (i<=num) {
            sum = sum+i;
            i += 2;
        }
        return sum;
    }
    }


