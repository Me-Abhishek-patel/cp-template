package codes;



import static java.lang.Math.*;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class AVacations {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        HashMap<IntIntPair, Integer> dp = new HashMap<>();
        int min = go(a, 0, 0, dp);
        out.printLine(min);
    }

    private int go(int[] a, int i, int type, HashMap<IntIntPair, Integer> dp) {
        if (i == a.length) return 0;
        IntIntPair p = new IntIntPair(i, type);
        if (dp.containsKey(p)) return dp.get(p);

        int min = 1 + go(a, i + 1, 0, dp);

        if (a[i] == 1) {
            if (type != 2) min = min(min, go(a, i + 1, 2, dp));

        } else if (a[i] == 2) {
            if (type != 1) min = min(min, go(a, i + 1, 1, dp));

        } else if (a[i] == 3) {
            if (type != 1) min = min(min, go(a, i + 1, 1, dp));
            if (type != 2) min = min(min, go(a, i + 1, 2, dp));
        }
        dp.put(p, min);
        return min;
    }
}
