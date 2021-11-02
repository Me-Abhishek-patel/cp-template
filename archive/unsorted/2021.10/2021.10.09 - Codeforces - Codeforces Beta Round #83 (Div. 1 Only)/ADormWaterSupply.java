package codes;

import helpers.MyWeightedGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.PriorityQueue;

public class ADormWaterSupply {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), p = in.readInt();
        MyWeightedGraph graph = new MyWeightedGraph(n);
        for (int i = 0; i < p; i++) {
            graph.addEdge(in.readInt() - 1, in.readInt() - 1, in.readInt());
        }
//        graph.printAdjacency();
        PriorityQueue<MyWeightedGraph.Edge> pq = graph.go();
        out.printLine(pq.size());
        while (!pq.isEmpty()){
            MyWeightedGraph.Edge ed = pq.poll();
            out.printLine(ed.getFrom()+" "+ed.getTo()+" "+ed.getWeight());
        }
    }
}
