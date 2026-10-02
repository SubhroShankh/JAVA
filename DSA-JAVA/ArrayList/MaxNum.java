import java.util.ArrayList;

public class MaxNum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        // Max no=> O(n)
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > maxNum) {
            // maxNum = list.get(i);
            // }
            maxNum = Math.max(maxNum, list.get(i));
        }
        System.out.println("Max no is: " + maxNum);
    }
}
