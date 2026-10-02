import java.util.*;

public class StacksByQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            // case 1: elements are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    // If it's the last element, break before adding it to q2
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }
            // case 2: elements are in q2
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    // If it's the last element, break before adding it to q1
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            // case 1: elements are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top); // In peek, we must add ALL elements back, including the top
                }
            }
            // case 2: elements are in q2
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top); // In peek, we must add ALL elements back, including the top
                }
            }
            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}