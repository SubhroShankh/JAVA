import java.util.*;

public class Heaps {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void insert(int data) {
            // add at last idx
            arr.add(data);

            // swap
            int childIdx = arr.size() - 1;
            int parentIdx = (childIdx - 1) / 2;

            while (arr.get(childIdx) < arr.get(parentIdx) && childIdx > 0) { // O(logn)
                // swap
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parentIdx));
                arr.set(parentIdx, temp);

                // update indices
                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;

            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minId = idx;

            if (left < arr.size() && arr.get(left) < arr.get(minId)) {
                minId = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minId)) {
                minId = right;
            }

            if (minId != idx) {
                // swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minId));
                arr.set(minId, temp);

                heapify(minId);
            }

        }

        public int remove() {
            int data = arr.get(0);

            // step1 -> swap first and last idx
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2 -> remove last idx
            arr.remove(arr.size() - 1);

            // step3 -> heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(3);
        h.insert(4);
        h.insert(1);
        h.insert(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

    }
}
