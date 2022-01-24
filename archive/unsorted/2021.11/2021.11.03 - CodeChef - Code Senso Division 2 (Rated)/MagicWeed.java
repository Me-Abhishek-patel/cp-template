package codes;

import net.cplibrary.generated.collections.pair.LongLongPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class MagicWeed {
    final long MOD = (long) 10e9 + 7;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong(), m = in.readLong();
        HashMap<LongLongPair, HashMap<Boolean, Long>> hm = new HashMap<>();

        long res = go(n, m, true, hm);
        out.printLine(res);
    }

    private long go(long n, long m, boolean s, HashMap<LongLongPair, HashMap<Boolean, Long>> hm) {
        if (m <= -1 || n <= -1) {
            return 1;
        }
//        LongLongPair pair = LongLongPair.makePair(n, m);
//        if (hm.containsKey(pair)) {
//            HashMap<Boolean, Long> hm2 = hm.get(pair);
//            if (hm2.containsKey(s))
//                return hm2.get(s);
//        }

        long res = 0;

        res = (0 + (go(n, m - 1, true, hm) % MOD)) % MOD +  ((go(n - 1, m, false, hm) % MOD)) % MOD;;

//        HashMap<Boolean, Long> hm2 = new HashMap();
//        hm2.put(s, res % MOD);
//        hm.put(pair, hm2);
        return res % MOD;

    }
}
