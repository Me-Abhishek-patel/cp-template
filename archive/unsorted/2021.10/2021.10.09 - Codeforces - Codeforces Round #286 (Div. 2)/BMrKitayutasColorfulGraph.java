package codes;

import helpers.MyWeightedGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BMrKitayutasColorfulGraph {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyWeightedGraph graph = new MyWeightedGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1, in.readInt());
        }
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            out.printLine(graph.count(in.readInt() - 1, in.readInt() - 1));
        }


    }
}
