package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BBadge {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < n; i++) {
            graph.addEdge(i, in.readInt() - 1);
        }
        int[] x = graph.get();
        out.printLine(x);
    }
}
