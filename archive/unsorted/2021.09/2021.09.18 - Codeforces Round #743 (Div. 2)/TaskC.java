package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < n; i++) {
            int k = in.readInt();
            for (int j = 0; j < k; j++) {
                graph.addEdge(in.readInt() - 1, i);
            }
        }
        boolean cycle = false;
        boolean[] rec = new boolean[n], vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (graph.detectCycleDirected(vis, rec, i)) {
                    out.printLine(-1);
                    return;
                }
            }
        }
        int maxIndegree = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int v : graph.adj.get(i)) {
                if (i)
            }

        }
    }
}
