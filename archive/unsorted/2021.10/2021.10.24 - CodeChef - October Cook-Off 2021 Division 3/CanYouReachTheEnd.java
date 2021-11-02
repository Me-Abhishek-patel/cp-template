package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.BitSet;

public class CanYouReachTheEnd {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        ArrayList<IntIntPair> al = new ArrayList<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[in.readInt() - 1] = in.readInt() - 1;
//            al.add(new IntIntPair(in.readInt() - 1, in.readInt()-1));
        }
        boolean[] blocked = new boolean[n];
        int x = 0;
        boolean flag = true;
        IntIntPair cur = new IntIntPair(0,0);
        for (int i = 1; i < n; i++) {
            x = Math.max(x, a[i]);

            if (x + 1 == a[i - 1]) flag = false;
        }

    }

    private boolean dfs(BitSet[] a, int i, int j, int n) {
        if (i >= n || j >= n || a[i].get(j)) return false;
        a[i].set(j, true);
        if (i == n - 1 && j == n - 1) return true;
        return dfs(a, i + 1, j, n) || dfs(a, i, j + 1, n);
    }
}
