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

public class MangoMarket {
    int[] a;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        a = in.readIntArray(n);
        MyGraph graph = new MyGraph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1);
        }
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            String[] query = in.readLine().split(" ");
            if(query[0].equals("+")){
                graph.addEdge(Integer.parseInt(query[1])-1,Integer.parseInt(query[2]));
            }else if(query[0].equals("-")){
                graph.removeEdge(Integer.parseInt(query[1])-1,Integer.parseInt(query[2]));
            }else {
                calc(graph.adj);
            }
        }

    }

    private void calc(ArrayList<ArrayList<Integer>> adj) {

    }
}
