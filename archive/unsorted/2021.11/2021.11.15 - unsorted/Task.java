package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    int ans = 0;
    int[] initials, finals;
    boolean[] vis;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyGraph graph = new MyGraph(n);
        int[] parent = new int[n];
        Arrays.fill(parent,-1);

        vis = new boolean[n];
        ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = in.readInt() - 1, v = in.readInt() - 1;
            parent[u] = v;
            graph.addEdge(v, u);
        }
        int root = ArrayUtils.find(parent, -1);
        initials = in.readIntArray(n);
        finals = in.readIntArray(n);
//
        dfs(graph.adj, 0, 0, 0, true);
        out.printLine(ans);

    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, int i, int maleC, int femaleC, boolean ismale) {
        if (ismale && maleC % 2 != 0)
            initials[i] = 1 - initials[i];
        if (!ismale && femaleC % 2 != 0)
            initials[i] = 1 - initials[i];
        vis[i]  = true;
        if (initials[i] != finals[i]) {
            ans++;
            if (ismale) maleC++;
            else femaleC++;
        }
        for (Integer integer : adj.get(i)) {
            if(!vis[integer]){
                dfs(adj, integer, maleC, femaleC, !ismale);
            }
        }

    }
}
