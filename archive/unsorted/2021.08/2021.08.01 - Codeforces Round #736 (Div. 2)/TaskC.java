package codes;


import FastIO.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskC {


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            int k = in.readInt();
            if (k == 1) {
                graph.addEdge(in.readInt() - 1, in.readInt() - 1);
            } else if (k == 2) {
                graph.removeEdge(in.readInt() - 1, in.readInt() - 1);
            } else {
                out.printLine(n - graph.bfs());
            }
        }
    }
}
