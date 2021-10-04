package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.string.StringUtils;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int k = in.readInt();
        int[] freq = StringUtils.freqArray(s);
        PriorityQueue<IntIntPair> pq = new PriorityQueue<>(new Comparator<IntIntPair>() {
            @Override
            public int compare(IntIntPair o1, IntIntPair o2) {
                return o1.second - o2.second;
            }
        });
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                pq.add(new IntIntPair(i, freq[i]));
            }
        }
        while (!pq.isEmpty() && pq.peek().second <= k) {
            IntIntPair p = pq.poll();
            freq[p.first] = 0;
            k -= p.second;
        }
        out.printLine(pq.size());
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] != 0) sb.append(c);
        }
        out.printLine(sb);


    }
}
