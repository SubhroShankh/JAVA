import java.util.Scanner;

public class Practice27 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of digits Calculator.\n");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        int a = digitSum(num);
        System.out.println("your sum of given number is: " + a);
    }

public static int digitSum(int num) {
    /*  int b = (num%10);
    int c = (num/10);
    int d = (c%10);
    int e = (c/10);
    int z = b+d;
    System.out.println(z); */

    int i = 10;
    int sum = 0 ;
    while (num > 0) {
        sum += num %10;
        num = num /10;
    }
        
    
    return sum;
}

}
