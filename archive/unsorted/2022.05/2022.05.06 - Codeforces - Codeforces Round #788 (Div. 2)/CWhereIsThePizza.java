package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;
import java.util.TreeSet;

public class CWhereIsThePizza {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] b = in.readIntArray(n);
        int[] d = in.readIntArray(n);
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < n; i++) {
            int u = a[i] - 1, v = b[i] - 1;
            graph.addEdge(u, v);
        }
        boolean[] vis = graph.vis;
        for (int i = 0; i < n; i++) {
            if (d[i] != 0) {
                graph.dfs(d[i] - 1);
            } else if (a[i] == b[i]) {
                graph.dfs(a[i] - 1);
            }
        }
        int c = graph.countConnectedComponents();
        out.printLine(power(2, c, MOD7));

    }
}
