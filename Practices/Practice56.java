import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args) {
        System.out.println("Welcome to multipliction table calculator.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number that you want to print: ");
        int num = input.nextInt();
        System.out.print("Till which number do you want your table to be: ");
        int tillNum = input.nextInt();
        for(int i = 0 ; i <= tillNum; i++){
            System.out.println(num + " * "+i +" = " +(num*i));
        }
    }
}