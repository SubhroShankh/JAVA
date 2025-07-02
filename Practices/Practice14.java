import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        System.out.println("Greatest of three number determining Programe.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        Double num1 = input.nextDouble();
        System.out.print("Please enter another value: ");
        Double num2 = input.nextDouble();
        System.out.print("Please enter a third value: ");
        Double num3 = input.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.print("The greatest number is: " + num1);
        } else {
            if (num2>num1 && num2>num3){
                System.out.print("The greatest number is: " + num2);
            } else{
                System.out.print("The greatest number is: " + num3);
            }
        }
    }
}
