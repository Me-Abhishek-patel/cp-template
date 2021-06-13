import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhishek Patel
 */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while ((tc-- > 0)) {
            int n = in.nextInt(), k = in.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                pq.add(in.nextInt());
            }

            long sum = 0;
            long prev = Long.MAX_VALUE;
            while (!pq.isEmpty()) {
                long t = pq.poll();
                if (t != prev) {
                    k--;
                    prev = t;
                }
                if (t > 0 && k >= 0) {
                    sum += t;
                }
            }
            System.out.println(sum);
        }
    }
}

