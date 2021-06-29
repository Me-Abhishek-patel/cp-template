package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < m; i++) {
            pq.add(in.readIntArray(2));
        }
        long sum = 0;
        int i = 0;
        for (;!pq.isEmpty() && n>0; ) {
            int[] arr = pq.poll();
            if(n>=arr[0]) {
                sum += ((long) arr[0] *arr[1]);
                n-=arr[0];
            }else {
                sum+=((long)n*arr[1]);
                n= 0;
            }

        }
        out.printLine(sum);
    }
}
