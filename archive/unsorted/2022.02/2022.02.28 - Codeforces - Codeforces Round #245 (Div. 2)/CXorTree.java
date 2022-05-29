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

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;

public class CXorTree {
    ArrayList<ArrayList<Integer>> adj;
    boolean[] vis;
    int[] a, b;
    ArrayList<Integer> res;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        vis = new boolean[n];
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < n - 1; i++) {
            int u = in.readInt()-1, v = in.readInt()-1;
            graph.addEdge(u, v);
        }
        res = new ArrayList<>();
        adj = graph.adj;
        a = in.readIntArray(n);
        b = in.readIntArray(n);
        int count = dfs(0, 0, 0, 0);
        out.printLine(count);
        for (Integer re : res) {
            out.printLine(re);
        }


    }

    private int dfs(int i, int l, int e, int o) {
        vis[i] = true;
        int cur = a[i];
        if (l % 2 == 0 && e % 2 != 0) {
            cur = 1 - cur;
        } else if (l % 2 != 0 && o % 2 != 0) {
            cur = 1 - cur;
        }
        int count = 0;
        if (cur != b[i]) {
            count++;
            res.add(i+1);
            if (l % 2 == 0) e++;
            else o++;
        }
        for (Integer it : adj.get(i)) {
            if (!vis[it]) {
                count += dfs(it, l + 1, e, o);
            }
        }
        return count;

    }
}
