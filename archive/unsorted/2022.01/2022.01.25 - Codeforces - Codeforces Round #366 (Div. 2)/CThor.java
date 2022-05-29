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
import java.util.LinkedList;
import java.util.Queue;

public class CThor {
    static final int maxn = 300005;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        Queue<Integer>[] e = new LinkedList[maxn];
        for (int i = 0; i < maxn; i++) {
            e[i] = new LinkedList<>();
        }
        boolean[] mark = new boolean[maxn];
        Queue<IntIntPair> q = new LinkedList<>();
        int order = 0, ans = 0;
        for (int i = 1; i <= m; i++) {
            int op = in.readInt(), idx = in.readInt();
            if (op == 1) {
                order++;
                ans++;
                q.add(IntIntPair.makePair(order, idx));
                e[idx].add(order);
            } else if (op == 2) {
                while (!e[idx].isEmpty()) {
                    int p = e[idx].poll();
                    mark[p] = true;
                    ans--;
                }
            } else if (op == 3) {
                while (!q.isEmpty() && q.peek().first <= idx) {
                    IntIntPair t = q.poll();
                    if (!mark[t.first]) {
                        mark[t.first] = true;
                        ans--;
                        e[t.second].poll();
                    }
                }
            }
            out.printLine(ans);
        }
    }
}
