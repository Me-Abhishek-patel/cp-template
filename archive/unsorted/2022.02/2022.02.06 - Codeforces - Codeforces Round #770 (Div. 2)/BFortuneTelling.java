package codes;

import net.cplibrary.generated.collections.pair.IntLongPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class BFortuneTelling {
    long y;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong(), x = in.readLong();
        y = in.readLong();
        long[] a = in.readLongArray((int) n);
        HashMap<IntLongPair, Boolean> hm = new HashMap<>();
        boolean alice = go(a, 0, x, hm);
        if (alice) {
            out.printLine("Alice");
        } else {
            out.printLine("Bob");
        }
    }

    private boolean go(long[] a, int i, long x, HashMap<IntLongPair, Boolean> hm) {
        if (i == a.length) {
            return x == y;
        }
        IntLongPair p = IntLongPair.makePair(i, x);
        if (hm.containsKey(p)) return hm.get(p);
        boolean f = false;
        f = go(a, i + 1, x ^ a[i], hm);
        f = (f | go(a, i + 1, x + a[i], hm));
        hm.put(p, f);
        return f;
    }
}
