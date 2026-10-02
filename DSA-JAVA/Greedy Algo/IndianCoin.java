import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int ammt = 590;
        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= ammt) {
                while (coins[i] <= ammt) {
                    count++;
                    ans.add(coins[i]);
                    ammt = ammt - coins[i];
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
