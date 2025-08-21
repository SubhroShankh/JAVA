import java.util.Scanner;

class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number gussing game.\n");
        int userNum;
        
        do{
            System.out.print("Please enter a number: ");
            userNum = input.nextInt();
        }while(!isRight(userNum));
        System.out.println("Congrats! the enter number was the correct number.");
    }

    public static boolean isRight(int Num1){
        int Number = 7;
        return Num1 == Number ;
    }
}