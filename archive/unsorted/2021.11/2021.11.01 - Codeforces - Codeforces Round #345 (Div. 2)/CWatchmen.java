package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class CWatchmen {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashMap<Integer, Integer> rows = new HashMap<>(), col = new HashMap<>();
        HashMap<IntIntPair, Integer> hm = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int r = in.readInt(), c = in.readInt();
            IntIntPair p = IntIntPair.makePair(r, c);
            sum -= hm.getOrDefault(p, 0);
            hm.put(p, hm.getOrDefault(p, 0) + 1);
            rows.put(r, rows.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);

        }
        for (Integer value : rows.values()) {
            sum+=  ((long)(value - 1) *value)/2;
        }
        for (Integer value : col.values()) {
            sum+=  ((long)(value - 1) *value)/2;
        }
        out.printLine(sum);
    }
}
