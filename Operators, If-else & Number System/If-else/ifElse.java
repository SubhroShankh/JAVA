import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Boolean isMale = true;
        String name = "Subhro";

        if(isMale) {
            System.out.println("Hello Mr. " + name);
        } else {
            System.out.println("Hello Ms. " + name);
        }

        Scanner input = new Scanner(System.in);
        System.out.println( "Please enter your age: ");
        int age  = input.nextInt();

        if (age>60) {
            System.out.println("Hello Grandpa");
        } else {
            System.out.println("Hello Uncle");
        }

        
     }
}
