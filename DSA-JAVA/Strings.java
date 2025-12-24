import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = new String("xyz");
        String str2 = "abcd";

        // Strins are immutable in java
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next();
        // System.out.println(name);
        // name = sc.nextLine();
        // System.out.println(name);

        String fullName = "Tony stark";
        System.out.println(fullName.length());

        // concatination
        String firstName = "Subhro ";
        String lastName = "Shankh";
        String totalName;
        totalName = firstName + lastName;
        System.out.println(totalName);
        System.out.println(totalName.charAt(1));
        printLetters(totalName);
    }
}
