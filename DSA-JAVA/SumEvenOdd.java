import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of integers you want to enter: ");
        int NoOf = input.nextInt();
        int even = 0;
        int odd = 0;

        int[] myarr = new int[NoOf];
        for (var i = 0; i < myarr.length; i++) {
            System.out.print("Please enter a number: ");
            myarr[i] = input.nextInt();
            if (myarr[i] % 2 == 0) {
                even += myarr[i];
            } else {
                odd += myarr[i];
            }
        }
        System.out.println("Sum of odd number is: " + odd);
        System.out.println("Sum of even numbers is: " + even);

    }
}
