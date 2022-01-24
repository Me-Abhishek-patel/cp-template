package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;

public class BNetworkTopology {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
//        graph.printAdjacency();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        int mincount = 0;
        for (ArrayList<Integer> al : graph.adj) {
            min = Math.min(min, al.size());
            max = Math.max(max, al.size());
            if (al.size() == 1) mincount++;
        }

        if (min == 1 && max == 2) {
            out.printLine("bus topology");
        } else if (min == 2 && max == min) {
            out.printLine("ring topology");
        } else if (min == 1 && max == n-1 && mincount==n-1){
            out.printLine("star topology");
        }else {
            out.printLine("unknown topology");
        }
    }
}
