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

import java.util.ArrayList;
import java.util.Arrays;

public class GraphColoring {
    ArrayList<Integer> currBlack, bestBlack;
    ArrayList<ArrayList<Integer>> adjList;
    int[] currColor;
    int n, m;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        m = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        adjList = graph.adj;
        bestBlack = new ArrayList<>();
        currBlack = new ArrayList<>();
        currColor = new int[n];
//        Arrays.fill(currColor, -1);
        backtrack1(0);
        out.printLine(bestBlack.size());
        boolean first = true;
        for (Integer integer : bestBlack) {
            if (first) {
                out.print((integer + 1));
                first = false;
            } else
                out.print(" " + (integer + 1));
        }
        out.printLine();

    }

    private void backtrack1(int curr) {
        if (curr >= n) {
            if (currBlack.size() > bestBlack.size()) {
                bestBlack = new ArrayList<>(currBlack);
            }
            return;
        }
        backtrack1(curr + 1);
        if (canBeBlack(curr)) {
            currColor[curr] = 1;
            currBlack.add(curr);
            backtrack1(curr + 1);
            currBlack.remove(currBlack.size() - 1);
            currColor[curr] = 0;
        }
    }

    boolean canBeBlack(int cur) {
        for (int nei : adjList.get(cur)) {
            if (nei == cur || currColor[nei] == 1)
                return false;
        }
        return true;
    }
}
