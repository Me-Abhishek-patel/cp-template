package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AParty {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < n; i++) {

            int x = in.readInt() - 1;
            if (x != -2)
                graph.addEdge(x, i);
        }

//        int c = graph.depth();
        graph.printAdjacency();
//        out.printLine(c);
    }
}
