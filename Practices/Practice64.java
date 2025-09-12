import java.util.Scanner;

class PalindromeRecursion{
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to be checked: ");
        String str = input.nextLine();
        System.out.println("Your entered string is "+(isPalindrome(str)? "palindrome" :"not a palindrome" ));

    }

    public static boolean isPalindrome(String palindrome){
        if (palindrome.length() <= 1) {
            return true;
        }
        int lastPas = palindrome.length() -1; 
        
        // Check if the first and last characters are different — if so, it's not a palindrome
        if(palindrome.charAt(0) != palindrome.charAt(lastPas)){
            return false;
        }
        
        // Create a new string by removing the first and last characters of the original palindrome
        String newString = palindrome.substring(1, lastPas);
        return isPalindrome(newString);
    }
}