import java.util.Scanner;

public class Practice33 {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number verifying Programme.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Number for verification: ");
        int num = input.nextInt();
        boolean isArmstrong = Armstrong(num);
        if (isArmstrong) {
            System.out.println("The given number is an Armstrong Number.");
        } else{ 
            System.out.println("The given number is not an Armstrong Number.");
        }

    }

    public static boolean Armstrong(int num1) {
        int noOfDigits = noOfDigits(num1);
        int numCopy = num1;
        int finalNumber = 0;
        while (num1>0) {
            int lastDigit = num1%10;
            num1 /= 10 ;
            finalNumber  += power(lastDigit, noOfDigits);
        }

        return finalNumber == numCopy;
    }

    public static int power(int num1 , int num2){
        
        int result = 1;
        int i  = 0;
        while (i< num2) {
            result *= num1;
            i++;
        }
        
        return result;
    }

    public static int noOfDigits(int num1) {
        int digits = 0;
        if (num1 == 0) return 1;
        while (num1> 0) {
            digits++;
            num1 /=10;
        }
        return digits;
    }

}
