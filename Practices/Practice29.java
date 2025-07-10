import java.util.Scanner;

public class Practice29 {
    public static void main(String[] args) {
        System.out.println("Welcome to GCD Calculator.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find GCD: ");
        int first = input.nextInt();
        System.out.println("Please enter another number to find GCD: ");
        int sec = input.nextInt();
        int a = HCF(first, sec);
        System.out.println("your HCF value is: " + a);
    }

    public static int HCF(int first , int sec) {
        int num = 1 ;
        int least = least(first, sec);
        for ( int i = 2 ; i <= least; i++ ){
            if (first%i == 0 && sec%i == 0) {
                num = i;
            }
        }
        return num;
    }

    public static int least(int num1 , int num2) {
       return(num1 < num2) ? num1: num2 ;
    }

}
