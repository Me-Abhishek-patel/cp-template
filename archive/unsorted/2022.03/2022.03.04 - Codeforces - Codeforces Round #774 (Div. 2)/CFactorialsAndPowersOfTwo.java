package codes;

import net.cplibrary.generated.collections.pair.LongLongPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;
import java.util.HashSet;

public class CFactorialsAndPowersOfTwo {
    HashMap<LongLongPair, Integer> dp;
    HashSet<Long> hs;
    long maxn = 1000000000000L;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        dp = new HashMap<>();
        hs = new HashSet<>();
        long res = 1;
        for (long i = 1; res <= maxn; i++) {
            res *= i;
            hs.add(res);
        }
        res = 1;
        while (res <= maxn) {
            hs.add(res);
            res = (res << 1);
        }
        long[] a = new long[hs.size()];

        int i = 0;
        for (Long h : hs) {
            a[i++] = h;
        }

        int k = sol(n, a, 0);
        out.printLine(k);
    }

    private int sol(long n, long[] a, int i) {
        System.out.println(n + " " + i);
        LongLongPair p = new LongLongPair(n, i);
        if (dp.containsKey(p)) return dp.get(p);
        if (n == 0) return 0;
        if (n < 0) return 1000;
        if (i >= a.length) return 1000;

        int res = Integer.MAX_VALUE;
        res = Math.min(sol(n, a, i + 1), res);
        res = Math.min(sol(n - a[i], a, i + 1) + 1, res);
        dp.put(p,res);
        return res;
    }

}
