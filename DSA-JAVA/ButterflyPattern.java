public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= 2 * (n - line); spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int line = n; line >= 1; line--) {
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= 2 * (n - line); spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}