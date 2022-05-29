package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.collections.Pair;
import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

public class GoodPairs {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(n);
        HashMap<Pair<Integer,Integer>, Integer> pairc = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            Pair<Integer,Integer> p = Pair.makePair(a[i], b[i]);
            pairc.put(p, pairc.getOrDefault(p, 0)+1);
        }
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            Pair<Integer,Integer> p = Pair.makePair(a[i], b[i]);
            Pair<Integer,Integer> rp = Pair.makePair(b[i], a[i]);
            if (pairc.containsKey(p)) {
                pairc.put(p, pairc.getOrDefault(p, 1) - 1);
            }
            if (pairc.containsKey(rp)) ans += pairc.get(rp);

        }
        out.printLine(ans);

    }
}
