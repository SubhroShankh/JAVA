import java.util.ArrayList;

public class PairSumOne {

    public static boolean IsPair(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    // public static boolean IsPair(ArrayList<Integer> list, int target) {

    // // brute force approach }=> O(n^2)
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        int target = 5;

        if (IsPair(list, target)) {
            System.out.println("Pair does exist.");
        } else {
            System.out.println("Pair does not exist.");
        }
    }
}
