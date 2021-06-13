package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximizeTheSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(in.readInt());
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
        out.printLine(sum);
    }
}
