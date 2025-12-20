public class InvetedPyramid {
    public static void main(String[] args) {
        int n = 10;
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= n - line; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= line; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
