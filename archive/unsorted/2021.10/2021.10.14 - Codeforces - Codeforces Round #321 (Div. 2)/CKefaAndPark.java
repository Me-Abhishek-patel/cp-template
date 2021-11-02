package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class CKefaAndPark {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(in.readInt()==1)
                hs.add(i);
        }

        MyGraph graph = new MyGraph(n);
        graph.hs = hs;
        graph.m = m;
        for (int i = 0; i < n - 1; i++) {
            graph.addEdge(in.readInt()-1, in.readInt()-1);
        }
        graph.dfs2(0);
        out.print(graph.count);


    }
}
