import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = new String("xyz");
        // String str2 = "abcd";

        // Strins are immutable in java
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.println(name);
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony stark";
        // System.out.println(fullName.length());

        // concatination
        /*
         * String firstName = "Subhro ";
         * String lastName = "Shankh";
         * String totalName;
         * totalName = firstName + lastName;
         * System.out.println(totalName);
         * System.out.println(totalName.charAt(1));
         * printLetters(totalName);
         */

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if (s1 == s2) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        if (s1 == s3) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Substring
        String str = "Hello world";
        System.out.println(subString(str, 0, 5));
        System.out.println(str.substring(0, 5));

        // String Builder
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }

    public static String subString(String str, int si, int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
}
