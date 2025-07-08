import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        System.out.println("welcome to  Multiplication Table.\n");       
        userInput(); 
        
    }
    
    public static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number which you want to Multiplication Table: ");
        int num = input.nextInt();
        System.out.println("Till how much nmber you want to print: ");
        int x = input.nextInt();
        int i = 0;

        while (i<=x) {
            int M = num * i ;
            System.out.println(num + " * " + i + " = " + M );
            i++;
        }
    }
    
    

}



