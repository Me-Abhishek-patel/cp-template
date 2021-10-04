package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int m = in.readInt();
        MyGraph graph = new MyGraph(5);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        boolean x = false, y = false;
        for (int i = 0; i < 5; i++) {
            if (graph.adj.get(i).size() != 2)
                x = true;

        }
        if (x) out.printLine("WIN");
        else out.printLine("FAIL");

    }
}
