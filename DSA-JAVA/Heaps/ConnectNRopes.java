import java.util.PriorityQueue;

public class ConnectNRopes {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            totalCost += first + second;

            pq.add(first + second);
        }

        System.out.println(totalCost);
    }
}
