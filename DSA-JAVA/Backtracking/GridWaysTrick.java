public class GridWaysTrick {

    public static int gridWays(int n, int m) {
        int N = n + m - 2;
        int r = n - 1;
        if (r > m - 1) {
            r = m - 1;
        }
        int res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(n, m));
    }
}
