import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("welcome to swapping station\n\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        int a = input.nextInt();
        System.out.println("Please enter another value: ");
        int b = input.nextInt();

       int c =a;
       a=b;
       b=c;
       
       System.out.println("swapping done");
       
       System.out.println("value of a is: " +a);
       System.out.println("value of b is: " +b);
       

    }
}
