package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BTwoButtons {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        if (m <= n) {
            out.printLine(n - m);
            return;
        }
        Queue<IntIntPair> q = new LinkedList<>();
        q.add(IntIntPair.makePair(n, 0));
        HashSet<Integer> vis = new HashSet<>();
        while (!q.isEmpty()) {
            IntIntPair p = q.poll();
            if (p.first == m) {
                out.printLine(p.second);
                return;
            }

            if (p.first - 1 > 0 && !vis.contains(p.first - 1)) {
                vis.add(p.first);
                q.add(IntIntPair.makePair(p.first - 1, p.second + 1));
            }
            if (p.first < m && !vis.contains(p.first * 2)) {
                vis.add(p.first*2);
                q.add(IntIntPair.makePair(p.first * 2, p.second + 1));
            }

        }
    }
}
