package helpers;

import net.cplibrary.generated.collections.pair.IntIntPair;

import java.util.*;

public class MyWeightedGraph {
    public ArrayList<ArrayList<Edge>> adj;
    public int[] cost;
    public HashSet<Integer> hs = new HashSet<>();
    int n;
    long edges, vertices;
    boolean[] vis;
    public HashMap<IntIntPair, Integer> hm;


    public MyWeightedGraph(int n) {
        this.n = n;
        edges = vertices = 0;
        vis = new boolean[n];
        adj = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    }

    int min = 0;

    public void addEdge(int from, int to, int weight) {
        adj.get(from).add(new Edge(to, weight));
        adj.get(to).add(new Edge(from, weight));
    }

    public PriorityQueue<Edge> go() {
        PriorityQueue<Edge> pq = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.getFrom() - o2.getFrom();
            }
        });
        int[] indegre = new int[n];
        for (ArrayList<Edge> edgeArrayList : adj) {
            for (Edge edge : edgeArrayList) {
                indegre[edge.getTo()]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i] && indegre[i] == 0 && adj.get(i).size() == 1) {
                min = Integer.MAX_VALUE;
                int to = dfs2(i);
                pq.add(new Edge(i + 1, to + 1, min));
            }
        }
        return pq;
    }

    private int dfs2(int i) {
        if (adj.get(i).size() == 1) {
            min = Math.min(min, adj.get(i).get(0).getWeight());
            return dfs2(adj.get(i).get(0).getTo());
        } else return i;
    }


    private void dfs(int i) {
        vis[i] = true;
        for (Edge edge : adj.get(i)) {
            if (!vis[edge.getTo()]) {
                dfs(edge.getTo());
            }
        }

    }

    public void printAdjacency() {
        for (int i = 0; i < adj.size(); i++) {
            ArrayList<Edge> edgeArrayList = adj.get(i);
            System.out.print(i + " : ");
            for (Edge edge : edgeArrayList) {
                System.out.print("(" + edge.getTo() + "," + edge.getWeight() + ")  ");
            }
            System.out.println();
        }
    }

    public void assignw(int i, int w) {
        vis[i] = true;
        for (Edge edge : adj.get(i)) {
            if (!vis[edge.getTo()]) {
                if (w == 5) {
                    hm.put(IntIntPair.makePair(i, edge.getTo()), 2);
                    hm.put(IntIntPair.makePair(edge.getTo(), i), 2);
                    assignw(edge.getTo(), 2);
                } else {
                    hm.put(IntIntPair.makePair(i, edge.getTo()), 5);
                    hm.put(IntIntPair.makePair(edge.getTo(), i), 5);

                    assignw(edge.getTo(), 5);
                }
            }
        }
    }

    public static class Edge {
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
