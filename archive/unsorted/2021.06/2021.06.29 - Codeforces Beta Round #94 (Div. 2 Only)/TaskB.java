package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.ArrayList;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int x = in.readInt(), y = in.readInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        int count = 0;

        while (true) {

            ArrayList<Integer> del = new ArrayList<>();
            for (int i = 0; i < graph.size(); i++) {
                if (graph.get(i).size() == 1) {
                    del.add(i);
                }
            }
            if (!del.isEmpty()) {
                for (int i : del) {
                    if(graph.get(i).size()>0) {
                        int k = graph.get(i).get(0);
                        for (int j = 0; j < graph.get(k).size(); j++) {
                            if (graph.get(k).get(j) == i) {
                                graph.get(k).remove(j);
                                break;
                            }
                        }
                        graph.get(i).remove(0);
                    }
                }

            } else break;

            count++;

        }
        out.printLine(count);

    }
}
