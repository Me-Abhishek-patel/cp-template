package codes;

import helpers.MyGraph;
import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Winter {
    boolean[] froz;
    boolean[] froz2;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), q = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            int u = in.readInt() - 1, v = in.readInt() - 1;
            graph.addEdge(u, v);
        }
        froz = graph.froz;
        for (int i = 0; i < q; i++) {
            int t = in.readInt(), x = in.readInt();
            ArrayList<Integer> newFrozen = new ArrayList<>();
            if (t == 1) {
                froz[x - 1] = true;
                newFrozen.add(x - 1);
            } else if (t == 2) {
                froz2 = Arrays.copyOf(froz, n);
                boolean[] vis = new boolean[n];
                Queue<IntIntPair> qu = new LinkedList<>();
//                out.printLine(Arrays.toString(froz2));
                for (int j = 0; j < froz.length; j++) {
                    if (froz2[j] && !vis[j]) {
                        dfs(vis, graph.adj, j, x, x);

//                        qu.add(IntIntPair.makePair(j, x));
//                        while (!qu.isEmpty()) {
//                            IntIntPair p = qu.poll();
//                            vis[p.first] = true;
//                            for (int k : graph.adj.get(j)) {
//                                if (!vis[j]) {
//
//                                }
//                            }
//
//                        }
                    }
                }
            } else {
                out.printLine(froz[x - 1] ? "YES" : "NO");
            }
        }
    }

    private void dfs(boolean[] vis, ArrayList<ArrayList<Integer>> adj, int i, int x, int x1) {
        if (x < 0) return;

        if (froz2[i]  && !vis[i] ) x = x1;
        vis[i] = true;
        froz[i] = true;
        for (int j : adj.get(i)) {
            if (!vis[j]) {
                dfs(vis, adj, j, x - 1, x);
            }
        }
    }
}
