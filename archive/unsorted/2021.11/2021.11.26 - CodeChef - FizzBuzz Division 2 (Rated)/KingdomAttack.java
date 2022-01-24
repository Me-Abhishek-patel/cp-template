package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import helpers.MyGraph;
import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;

public class KingdomAttack {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        HashSet<IntIntPair> hs = new HashSet<>();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        int res = 0;
        ArrayList<ArrayList<Integer>> adj = graph.adj;
        for (int i = 0, adjSize = adj.size(); i < adjSize; i++) {
            ArrayList<Integer> u = adj.get(i);
            if (u.size() == 1 && graph.adj.get(u.get(0)).size() == 1 && graph.adj.get(u.get(0)).get(0) == i) {
                int v = u.get(0);
                int t = graph.adj.get(v).get(0);
                if(!hs.contains(IntIntPair.makePair(t, v)) && !hs.contains(IntIntPair.makePair(v, t))) {
                    hs.add(IntIntPair.makePair(t, v));
                    hs.add(IntIntPair.makePair(v, t));
                    res++;
                }
            }
        }
        out.printLine(res);
    }
}
