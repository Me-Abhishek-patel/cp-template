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
import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;

public class CColoredRooks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
//        MyGraph graph = new MyGraph(n);
        int[][] b = new int[n + 1][n + 1];
        ArrayList<ArrayList<IntIntPair>> al = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            al.add(new ArrayList<>());
            al.get(i).add(IntIntPair.makePair(i, i));
        }
        for (int i = 1; i <= m; i++) {
            int u = in.readInt(), v = in.readInt();
            al.get(v).add(new IntIntPair(n + i, v));
            al.get(u).add(new IntIntPair(n + i, u));

//            graph.addEdge(u, v);
        }



        for (int i = 1; i <= n; i++) {
            out.printLine(al.get(i).size());
            for (IntIntPair pair : al.get(i)) {
                out.printLine((pair.first) + " " + (pair.second));
            }
        }
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] vis, int[][] a, int row) {
        vis[i] = true;
        if (i >= row)
            a[row][i] = i + 1;
        for (int it : adj.get(i)) {
            if (!vis[it]) {
                dfs(adj, it, vis, a, row);
            }
        }
    }
}
