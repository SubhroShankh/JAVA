public class OnOffTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                int sum = line + num;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
