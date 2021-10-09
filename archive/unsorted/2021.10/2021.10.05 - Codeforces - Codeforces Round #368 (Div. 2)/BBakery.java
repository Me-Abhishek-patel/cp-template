package codes;

import helpers.MyWeightedGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class BBakery {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        MyWeightedGraph graph = new MyWeightedGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1, in.readInt());
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < k; i++) {
            hs.add(in.readInt() - 1);
        }
        graph.hs = hs;
        int res = graph.getMin();
        if (res == Integer.MAX_VALUE) out.printLine(-1);
        else out.printLine(res);


    }
}
