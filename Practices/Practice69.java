import java.util.Scanner;
class NumberGuessing{
    
    int random;
    
    NumberGuessing(){
        random = (int) Math.ceil(Math.random()*100);
        
    }
    
    int guess(int guessNumber){
        return guessNumber - random;
    }
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        NumberGuessing game = new NumberGuessing();
        System.out.println("Welcome to number guessing game.\n");
        int result;
        int userNum;
        do{
            System.out.println("Please enter a number to be checked: ");
            userNum = input.nextInt();
            result = game.guess(userNum);
        }while(result != 0);
        
    }
    
}