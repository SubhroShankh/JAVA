public class HollowRectangle {
    public static void main(String[] args) {
        int breadth = 5, length = 4;
        for (int line = 1; line <= length; line++) {
            for (int j = 1; j <= breadth; j++) {
                if (line == 1 || j == 1 || j == breadth || line == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
