import java.util.Scanner;

public class Practice30 {
    public static void main(String[] args) {
        System.out.println("Welcome to prime checking programme.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a vale for which you want to check: ");
        int num = input.nextInt();
        Boolean isTrue = Prime(num);
        if (isTrue) {
            System.out.println("The given number is Prime.");
        }else{
            System.out.println("The given number is not a Prime.");
        }
    }

public static boolean Prime(int num1) {
    for (int i = 2 ; i < num1 ; i++ ) {
        if (num1 % i == 0) {
            return false;
        }
    }
    return true;
}

}
