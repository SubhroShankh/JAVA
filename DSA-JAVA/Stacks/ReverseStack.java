import java.util.*;

public class ReverseStack {

    public static void PushAtBottom(Stack<Integer> s, int num) {
        if (s.isEmpty()) {
            s.push(num);
            return;
        }

        int top = s.pop();
        PushAtBottom(s, num);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> st) {
        // base
        if (st.isEmpty()) {
            return;
        }
        // kaam
        int top = st.pop();
        reverseStack(st);
        PushAtBottom(st, top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}