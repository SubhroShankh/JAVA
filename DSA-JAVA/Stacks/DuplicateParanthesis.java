import java.util.*;

public class DuplicateParanthesis { // O(n)

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            // closing
            if (str.charAt(i) == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    s.pop();
                }
            } else
            // opening
            {
                s.push(str.charAt(i));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";// true
        String str2 = "(a-b)";// false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
