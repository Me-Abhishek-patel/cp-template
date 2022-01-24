package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import helpers.MyGraph;
import helpers.MyWeightedGraph;
import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;

public class CNotAssigning {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyWeightedGraph graph = new MyWeightedGraph(n);
        HashMap<IntIntPair, Integer> hm = new HashMap<>();
        ArrayList<IntIntPair> al = new ArrayList<>();
        int start = 1;
        for (int i = 0; i < n - 1; i++) {
            int u = in.readInt() - 1, v = in.readInt() - 1;
            graph.addEdge(u, v, -1);
//            hm.put(IntIntPair.makePair(u, v), -1);
            al.add(IntIntPair.makePair(u, v));
        }
        graph.hm = hm;
        for (ArrayList<MyWeightedGraph.Edge> edges : graph.adj) {
            if (edges.size() > 2) {
                out.printLine(-1);
                return;
            }

        }

        ArrayList<ArrayList<MyWeightedGraph.Edge>> adj = graph.adj;
        for (int i = 0; i < n; i++) {
            if (adj.get(i).size() == 1) {
                start = i;
                break;
            }
        }
        graph.assignw(start, 5);
        for (IntIntPair pair : al) {
            out.print(hm.get(pair)+" ");
        }
        out.printLine();
    }
}
