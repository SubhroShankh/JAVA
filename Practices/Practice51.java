import java.util.Scanner;

public class Practice51 {
    public static void main(String[] args) {
        System.out.println("Welcome to grade calculatoe.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the percentage of student: ");
        int grade = input.nextInt();
        String score;
        
        score = (grade >= 80) ? "High" : (grade >= 50)? "Moderate" : "Low";
        System.out.println("You have got "+score+" grade.");
    }
}
