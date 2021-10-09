package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CTheChildAndToy {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] a = in.readIntArray(n);
//        MyGraph graph = new MyGraph(n);
//        graph.cost = cost;
//        int[] rem = new int[n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int x = in.readInt() ;
            int y = in.readInt() ;
//            graph.addEdge(x, y);
//            rem[x] += cost[y];
//            rem[y] += cost[x];
            ans+=Math.min(a[x-1],a[y-1]);
        }
        out.printLine(ans);
//        graph.rem = rem;
//        PriorityQueue<IntIntPair> pq = new PriorityQueue<>(new Comparator<IntIntPair>() {
//            @Override
//            public int compare(IntIntPair o1, IntIntPair o2) {
//                return o1.second-o2.second;
//            }
//        });
//        for (int i = 0; i < rem.length; i++) {
//            pq.add(IntIntPair.makePair(i,rem[i]));
//        }
//        graph.pq = pq;


    }

}
