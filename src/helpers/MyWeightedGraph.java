package helpers;

import java.util.ArrayList;
import java.util.HashSet;

public class MyWeightedGraph {
    public ArrayList<ArrayList<Edge>> adj;
    public int[] cost;
    public HashSet<Integer> hs = new HashSet<>();
    int n;
    long edges, vertices;
    boolean[] vis;

    public MyWeightedGraph(int n) {
        this.n = n;
        edges = vertices = 0;
        vis = new boolean[n];
        adj = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to, int weight) {
        adj.get(from).add(new Edge(to, weight));
        adj.get(to).add(new Edge(from, weight));
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (!hs.contains(i) && !vis[i]) {
                min = Math.min(dfs(i), min);
            }
        }
        return min;
    }

    private int dfs(int i) {
        int min = Integer.MAX_VALUE;
        vis[i] = true;
        for (Edge edge : adj.get(i)) {
            if (!vis[edge.getTo()]) {
                if (hs.contains(edge.getTo())) {
                    min = Math.min(min, edge.getWeight());
                } else {
                    min = Math.min(min, dfs(edge.getTo()));
                }
            }
        }
        return min;
    }

    static class Edge {
        int from = -1, to, weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        public Edge(int to, int weight) {
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

}
