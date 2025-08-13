import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding greatest integer calculator.\n");
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();

        int greatestNum ;
        /*if (num1>num2) {
            greatestNum = num1;
        }else{
            greatestNum = num2;
        } */

        greatestNum = num1 > num2 ? num1 : num2;
        System.out.println("Your greatest number is :" + greatestNum);
        
    }
}
