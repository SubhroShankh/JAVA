import java.util.Scanner;

class primeOrNot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker.\n");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("Your given number is "+ (isPrime ? "a prime number.":"not a Prime number."));
        
    }

    static boolean isPrime(int num1){
        for(int i = 2 ; i<num1; i++){
           if(num1%i == 0){
            return false;
           }
        }
        return true;
    }
}
