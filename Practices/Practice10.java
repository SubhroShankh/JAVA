import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        System.out.println("Compount intrest calculator\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter principle ammount: ");
        Double P = input.nextDouble();
        System.out.print("Please enter rate of intrest: ");
        Float r = input.nextFloat();
        System.out.print("Please enter years: ");
        Double t = input.nextDouble();

        Double compInt = P * Math.pow((1+r/100), t);

        System.out.println("your compount intrest is: " + compInt);


    }
}
