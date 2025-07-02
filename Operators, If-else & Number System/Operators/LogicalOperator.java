import java.util.Scanner;

public class LogicalOperator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator!");
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you a female ? (true/false): ");
        Boolean isFemale = input.nextBoolean();

            if (age <5) {
            System.out.println("you have got 75% discount on your ticket.");
        } else {
            if (isFemale) {
                System.out.println("you have got 50% discount on your ticket.");
            }else  if (age>=60 && !isFemale) {
                System.out.println("you have got 25% discount");
            }else{
                System.out.println("you have got no discount ");
            }
        }

     }
}
