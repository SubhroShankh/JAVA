public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
