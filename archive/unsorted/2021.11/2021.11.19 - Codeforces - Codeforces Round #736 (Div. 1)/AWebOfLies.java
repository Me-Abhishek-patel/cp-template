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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class AWebOfLies {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        ArrayList<TreeSet<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new TreeSet<>());
        }
        for (int i = 0; i < m; i++) {
            addEdge(adj, in.readInt() - 1, in.readInt() - 1);
        }

        int q = in.readInt();
        int res = 0;
        for (int j = 0; j < n; j++) {
            boolean flag = false;
            Integer v = adj.get(j).floor(Integer.MAX_VALUE);
            if (v != null && v > j)
                flag = true;
            if (!flag) res++;

        }
        for (int i = 0; i < q; i++) {
            int x = in.readInt();
            if (x == 1) {
                int u = in.readInt() - 1, v = in.readInt() - 1;
                int min = min(u, v), max = max(u, v);
                Integer t = adj.get(min).floor(Integer.MAX_VALUE);
                adj.get(u).add(v);
                adj.get(v).add(u);

                if (t == null || t < min) {
                    res--;
                }

            } else if (x == 2) {
                int u = in.readInt() - 1, v = in.readInt() - 1;
                int min = min(u, v), max = max(u, v);

                adj.get(u).remove(v);
                adj.get(v).remove(u);
                Integer t = adj.get(min).floor(Integer.MAX_VALUE);
                if (t == null || t < min) {
                    res++;
                }
            } else {
                out.printLine(res);
//                int res = 0;
//                for (int j = 0; j < n; j++) {
//                    boolean flag = false;
//                    Integer v = adj.get(j).floor(Integer.MAX_VALUE);
//                    if (v != null && v > j)
//                        flag = true;
//                    if (!flag) res++;
//
//                }
//                out.printLine(res);
            }
        }
    }

    private void addEdge(ArrayList<TreeSet<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private void removeEdge(ArrayList<TreeSet<Integer>> adj, int u, int v) {
        adj.get(u).remove(v);
        adj.get(v).remove(u);
    }

}
