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

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

public class F1ArrayShuffling {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] freq = new int[n + 1];
        PriorityQueue<IntIntPair> pq = new PriorityQueue<>(new Comparator<IntIntPair>() {
            @Override
            public int compare(IntIntPair o1, IntIntPair o2) {
                return o2.second - o1.second;
            }
        });
        for (int i : a) {
            freq[i]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] != 0) {
                pq.add(IntIntPair.makePair(i, freq[i]));
            }
        }
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            ts.add(i);
        }
        int[] res = new int[n];
        ArrayList<IntIntPair> last = new ArrayList<>();
        while (!ts.isEmpty() && !pq.isEmpty()) {
            IntIntPair p = pq.poll();
            int count = p.second;
            ArrayList<Integer> toDel = new ArrayList<>();
            for (Integer t : ts) {
                if (a[t] != p.first) {
                    toDel.add(t);
                    res[t] = p.first;
                    count--;
                }
                if (count == 0) break;
            }
            for (Integer i : toDel) {
                ts.remove(i);
            }
            if (count > 0) {
                last.add(IntIntPair.makePair(p.first, count));
            }

        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] == 0) {
                res[i] = last.get(j).first;
                last.set(j, IntIntPair.makePair(last.get(j).first, last.get(j).second - 1));
                if (last.get(j).second <= 0) j++;
            }
        }

        out.printLine(res);

    }
}
