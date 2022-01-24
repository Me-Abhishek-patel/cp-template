package codes;

import static java.lang.Math.*;

import net.cplibrary.generated.collections.pair.LongIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class CMonstersAndSpells {
    long MAX_V = 3000000000000000000L;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashMap<LongIntPair, Long> hm = new HashMap<>();
        long[] k = in.readLongArray(n),
                h = in.readLongArray(n);
        long f = (h[0] * (h[0] + 1)) / 2;
        long res = f + go(k, h, h[0], 1, hm);
        out.printLine(res);


    }

    private long go(long[] k, long[] h, long prev, int i, HashMap<LongIntPair, Long> hm) {
        if (i == k.length) return 0;
        long dif = k[i] - k[i - 1];
        if (h[i] > prev + dif) return MAX_V;
        LongIntPair p = LongIntPair.makePair(prev, i);
        if (hm.containsKey(p)) return hm.get(p);
        long res = MAX_V;

        if (dif >= h[i]) {
            long temp1 = (h[i] * (h[i] + 1)) / 2;
            long n = prev + dif;
            long temp3 = (n * (n + 1)) / 2;
            long temp2 = (prev * (prev + 1)) / 2;
            temp2 = abs(temp3 - temp2);
            res = min(res, temp1 + go(k, h, h[i], i + 1, hm));
            res = min(res, temp2 + go(k, h, prev + dif, i + 1, hm));
        } else {
            long n = prev + dif;
            long temp3 = (n * (n + 1)) / 2;
            long temp2 = (prev * (prev + 1)) / 2;
            temp2 = abs(temp3 - temp2);
            res = min(res, temp2 + go(k, h, prev + dif, i + 1, hm));
        }
        hm.put(p, res);
        return res;


    }
}
