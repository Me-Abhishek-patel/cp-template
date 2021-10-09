package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CNewsDistribution {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            int k = in.readInt();
            int[] a = new int[k];
            for (int j = 0; j < k; j++) {
                a[j] = in.readInt() - 1;
                if (j > 0)
                    graph.addEdge(a[0], a[j]);
            }
        }
        graph.countConnectedComponents();
        out.printLine(graph.cost);


    }
}
