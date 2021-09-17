package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            int a = in.readInt() - 1, b = in.readInt() - 1;
            graph.addEdge(a, b);
        }
        if (graph.go())
            out.printLine("YES");
        else out.printLine("NO");

    }
}
