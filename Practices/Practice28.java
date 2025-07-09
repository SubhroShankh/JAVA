import java.util.Scanner;

public class Practice28 {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM Calculator.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value which you want to find LCM: ");
        int one = input.nextInt();
        System.out.println("Please enter another value which you want to find LCM: ");
        int sec = input.nextInt();
        int a = LCM(one, sec);
        System.out.println("your LCM value is: " + a);

    }

    public static int LCM(int one , int sec) {
        int i = 1 ;
        while (i<=one*sec) {
            if (i%one == 0 && i%sec == 0) {
                return i ;
            }i++;
        }
    return (one*sec);
    }
}
