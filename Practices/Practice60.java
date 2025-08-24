import java.util.Scanner;

class ExitOnExit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Please enter your command: ");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("exit")) {  // ".equalsIgnoreCase" is used for comparing strings regardless of case sensitivity like capital words or not.
                                                                   // ".equals" is used to compare the actual content of two strings (case-sensitive) i.e, word by word

                break;
            }
        }
        System.out.println("you have successfully exited.");
    }
}         