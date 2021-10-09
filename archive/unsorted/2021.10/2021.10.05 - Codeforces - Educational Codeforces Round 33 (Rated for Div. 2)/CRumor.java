package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CRumor {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] cost = in.readIntArray(n);
        MyGraph graph = new MyGraph(n);
        graph.cost = cost;
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        out.printLine(graph.countConnectedComponents());


    }
}
