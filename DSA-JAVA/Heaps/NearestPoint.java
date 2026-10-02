
import java.util.*;

public class NearestPoint {

    static class point implements Comparable<point> {
        int x;
        int y;
        int distSq;

        public point(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(point p2) {
            return this.distSq - p2.distSq;
        }

    }

    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int distSq = (x * x) + (y * y);
            pq.add(new point(x, y, distSq));
        }

        System.out.println("The " + k + " nearest points to the origin are:");
        for (int i = 0; i < k; i++) {
            point p = pq.remove();
            System.out.println("(" + p.x + ", " + p.y + ")");
        }

    }
}
