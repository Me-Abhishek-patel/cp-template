package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CNPHardProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
//        graph.countConnectedComponents();
        if(!graph.countBipertite()){
            out.printLine(-1);
            return;
        }
        out.printLine(graph.set1.size());
        for (Integer integer : graph.set1) {
            out.print(integer+1 + " ");
        }
        out.printLine();
        out.printLine(graph.set2.size());
        for (Integer integer : graph.set2) {
            out.printLine(integer+1 + " ");
        }
        out.printLine();

    }
}
