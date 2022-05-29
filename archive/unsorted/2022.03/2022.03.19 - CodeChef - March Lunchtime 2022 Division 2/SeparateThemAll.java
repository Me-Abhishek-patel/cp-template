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

public class SeparateThemAll {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < n - 1; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }


    }
}
