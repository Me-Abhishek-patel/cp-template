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
import java.util.Collections;
import java.util.PriorityQueue;

public class CTreeInfection {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyGraph graph = new MyGraph(n);
        for (int i = 1; i < n; i++) {
            int u = in.readInt() - 1;
            graph.addEdge(u, i);
        }
        ArrayList<Integer> al = new ArrayList<>(), al2 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (graph.adj.get(i).size() > 0) count++;
            al.add(graph.adj.get(i).size());
        }
//        al.add(1);
        count++;
        int t = count;
        al.sort(Collections.reverseOrder());
        for (Integer value : al) {
            if (value - t > 0) {
                al2.add(value - t);
            }
            if (t > 0) t--;
        }
        al.clear();
        al = al2;
        al.sort(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (al.size() > 0) {
            pq.clear();
            boolean isFirst = true;
            for (Integer integer : al) {
                if (isFirst) {
                    if (integer - 2 > 0)
                        pq.add(integer - 2);
                    isFirst = false;
                } else {
                    if (integer - 1 > 0)
                        pq.add(integer - 1);
                }
            }
            count++;
            al.clear();
            while (!pq.isEmpty()) al.add(pq.poll());
        }
        out.printLine(count);


    }
}
