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

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class CAlyonaAndMex {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] res = new int[n];
        Arrays.fill(res, -1);
        PriorityQueue<IntIntPair> pq = new PriorityQueue<>((x, y) -> {
            int val = (x.second - x.first) - (y.second - y.first);
            if (val != 0) return val;
            return x.first - y.first;
        });
        for (int k = 0; k < m; k++) {
            pq.add(IntIntPair.makePair(in.readInt() - 1, in.readInt() - 1));
        }
        int minmex = pq.peek().second - pq.peek().first + 1;
        int c = 0;
        for (int i = pq.peek().first; i < n; i++) {
            res[i] = c;
            c = (c + 1) % minmex;
        }
        c = minmex - 1;
        for (int i = pq.peek().first - 1; i >= 0; i--) {
            res[i] = c;
            c = (c - 1);
            if (c < 0) c = minmex - 1;
        }

        out.printLine(minmex);
        out.printLine(res);

    }
}
