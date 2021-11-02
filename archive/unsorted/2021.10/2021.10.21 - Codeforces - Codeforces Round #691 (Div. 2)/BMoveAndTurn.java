package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class BMoveAndTurn {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashSet<IntIntPair> hs = new HashSet<>();
        go(n, 0, true, hs, 0, 0);
        go(n, 0, false, hs, 0, 0);
        out.printLine(hs.size());
    }

    private void go(int n, int i, boolean flag, HashSet<IntIntPair> hs, int x, int y) {
        if (i == n) {
            hs.add(IntIntPair.makePair(x, y));
            return;
        }
        if (flag) {
            go(n, i + 1, !flag, hs, x + 1, y);
            go(n, i + 1, !flag, hs, x - 1, y);
        } else {
            go(n, i + 1, !flag, hs, x, y + 1);
            go(n, i + 1, !flag, hs, x, y - 1);
        }
    }
}
