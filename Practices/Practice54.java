import java.util.Scanner;

class passwordInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password input programme.\n");
        String password ;
        do{
            System.out.print("Please enter a password: ");
            password = input.nextLine();
        } while(!isValid(password));
        System.out.println("Your password was successfully accepted by the System.");
    }

    public static boolean isValid(String password){
        return password.length() > 5;
    }
}