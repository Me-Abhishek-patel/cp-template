package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class CWoodcutters {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] a = in.readIntTable(n, 2);
        HashMap<IntIntPair, Integer> dp = new HashMap<>();
        int res = 1 + go(a, 1, a[0][0], dp);
        out.printLine(res);
    }

    private int go(int[][] a, int i, int max, HashMap<IntIntPair, Integer> dp) {
        if (i == a.length) return 0;
        if (dp.containsKey(IntIntPair.makePair(i, max)))
            return dp.get(IntIntPair.makePair(i, max));
        int res = 0;
        if (a[i][0] - a[i][1] > max) {
            res = 1 + go(a, i + 1, a[i][0], dp);
        } else {
            int t = go(a, i + 1, a[i][0], dp);
            if (i == a.length - 1 || a[i][0] + a[i][1] < a[i + 1][0])
                t = Math.max(1 + go(a, i + 1, a[i][0] + a[i][1], dp), t);
            res = t;
        }

        dp.put(IntIntPair.makePair(i, max), res);
        return res;
    }
}
