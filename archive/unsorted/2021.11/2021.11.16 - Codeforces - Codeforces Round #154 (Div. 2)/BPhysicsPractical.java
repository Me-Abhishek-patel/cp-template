package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.HashMap;

public class BPhysicsPractical {
    boolean x = true;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        int count = n;
        int r = 1;
        for (int i = 0; i < n - 1; i++) {
            while (r < n && a[i] * 2 >= a[r]) r++;
            count = Math.min(count, i + (n - r));
        }
        out.printLine(count);

    }

    private int go(int[] a, int i, int n, HashMap<IntIntPair, Integer> dp) {
        if (i >= n) return 0;
        if (dp.containsKey(new IntIntPair(i, n)))
            return dp.get(new IntIntPair(i, n));
        if (a[n] <= 2 * a[i]) return 0;
        dp.put(new IntIntPair(i, n), min(1 + go(a, i + 1, n, dp), 1 + go(a, i, n - 1, dp)));
        return dp.get(new IntIntPair(i, n));

    }
}
