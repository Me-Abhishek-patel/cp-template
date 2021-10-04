package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        int count = 0;
        boolean[] vis = new boolean[n];
        vis[0] = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 ; i++) {
//            if (!vis[i]) {
                for (int j = i+1; j < n; j++) {
                    if(!vis[j] && !graph.adj.get(i).contains(j)){
                        vis[j] = true;
                        count++;
                        sb.append((i+1)+" "+(j+1)+"\n");
                    }
                }
//            }
        }
        out.printLine(count);
        out.printLine(sb);
    }
}
