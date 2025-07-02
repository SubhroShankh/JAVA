import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        System.out.println("Welcome to grade calculator:\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter subject 1 marks: ");
        float subject1 = input.nextFloat();
        System.out.print("Please enter subject 2 marks: ");
        float subject2 = input.nextFloat();
        System.out.print("Please enter subject 3 marks: ");
        float subject3 = input.nextFloat();
        System.out.print("Please enter subject 4 marks: ");
        float subject4 = input.nextFloat();
        System.out.print("Please enter subject 5 marks: ");
        float subject5 = input.nextFloat();
        System.out.print("Please enter maximum number: ");
        float maxNum = input.nextFloat();

        float percentage = (((subject1 + subject2 + subject3 + subject4 + subject5)/maxNum)*100);
        System.out.println("your percentage is: " + percentage);

        if (percentage>90) {
            System.out.println("You have got A grade.");
        } else if (percentage>75) {
            System.out.println("You have got B grade.");
        } else if (percentage>60) {
            System.out.println("You have got C grade.");
        } else if (percentage>30) {
            System.out.println("You have got D grade.");
        } else if (percentage<30) {
            System.out.println("You have got F grade.");
        }
        
    
    
    }
}
