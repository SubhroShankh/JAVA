public class StringTest {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello!");
        str.append(" user: ");
        str.append(45).append("\n");
        str.append("Good morning");
        System.out.println(str);
    }
}
