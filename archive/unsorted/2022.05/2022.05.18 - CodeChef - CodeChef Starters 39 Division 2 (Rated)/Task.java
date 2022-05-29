package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Task {
    public static class Node {
        int from = -1, to, weight;

        public Node(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public List<List<Node>> adj;
    boolean[] seen;
    int[] ccount;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        ccount = new int[n];

        int i = 0;
        while (i < n - 1) {
            int u = in.readInt() - 1, v = in.readInt() - 1, x = in.readInt();
            adj.get(u).add(new Node(v, x));
            adj.get(v).add(new Node(u, x));
            i++;
        }
        if (k == n) {
            out.printLine(0);
            return;
        }
        seen = new boolean[n];

        go(0);
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> ccount[y.getTo()] - ccount[x.getTo()]);
        pq.add(new Node(0, 0));

        seen = new boolean[n];
        seen[0] = true;
        Integer ans = 0, left = n - k;
        while (!pq.isEmpty()) {
            Node u = pq.poll();
            if (u.getWeight() == 1) {
                ans++;
                left -= ccount[u.getTo()];
                if (left <= 0) {
                    out.printLine(ans);
                    return;
                }
                continue;
            }

            for (Node v : adj.get(u.getTo())) {
                if (!seen[v.getTo()]) {
                    pq.add(new Node(v.getTo(), v.getWeight()));
                    seen[v.getTo()] = true;
                }

            }
        }
        out.printLine(-1);
    }

    private void go(int i) {
        seen[i] = true;
        for (Node edge : adj.get(i)) {
            if (!seen[edge.getTo()]) {
                go(edge.getTo());
                ccount[i] += (ccount[edge.getTo()]);
            }
        }
        ccount[i] += 1;
    }
}
