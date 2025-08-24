import java.util.Scanner;

class OccurencseNumber{
    public static void main(String[] args) {
        int[] array = ArrayUtility.InputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want to search: ");
        int num1 = input.nextInt();
        
        int OccurencseNumber = 0 ;
        for(int num: array){
            if(num1 == num){
                OccurencseNumber++;
            }
        }

        System.out.println("The given number has "+OccurencseNumber+" times Occurencses.");
    }
}