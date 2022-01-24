package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CSearchingForGraph {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), p = in.readInt();
        MyGraph graph = new MyGraph(n);

        int j = 0;
        p = 2 * n + p;
        while (p > 0) {
            for (int i = j + 1; i < n && p > 0; i++) {
                graph.addEdge(j, i % n);
                p--;
            }
            j++;
        }
        for (int i = 0; i < n; i++) {
            for (Integer it : graph.adj.get(i)) {
                out.printLine((i + 1) + " " + (it + 1));
            }
        }
    }
}
