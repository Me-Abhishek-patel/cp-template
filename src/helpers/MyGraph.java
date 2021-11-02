package helpers;

import java.util.*;

public class MyGraph {
    int n;
    long edges, vertices;
    public ArrayList<ArrayList<Integer>> adj;
    boolean[] vis;
    public HashSet<Integer> set1, set2;

    public MyGraph(int n) {
        this.n = n;
        set1 = new HashSet<>();
        set2 = new HashSet<>();
        edges = vertices = 0;
        vis = new boolean[n];
        adj = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    }


    public void addEdge(int from, int to) {
        adj.get(from).add(to);
        adj.get(to).add(from);

    }

    public void removeEdge(int from, int to) {
        adj.get(from).remove(new Integer(to));
        adj.get(to).remove(new Integer(from));
    }

    public boolean detectCycleDirected(boolean[] vis, boolean[] rec, int s) {
        vis[s] = true;
        rec[s] = true;
        for (int v : adj.get(s)) {
            if (!vis[v]) {
                if (detectCycleDirected(vis, rec, v)) return true;
            } else if (rec[v]) return true;
        }
        rec[s] = false;
        return false;
    }

    public boolean countBipertite() {
        int[] clr = new int[n];
        Arrays.fill(clr, -1);

        for (int i = 0; i < n; i++) {
            if (clr[i] == -1) {
                if (bfsBiperCheck(clr, i))
                    return false;
            }
        }
        return true;
    }

    private boolean bfsBiperCheck(int[] clr, int i) {
        if (clr[i] == -1) {
            clr[i] = 1;
            set1.add(i);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                if (clr[v] == -1) {
                    clr[v] = 1 - clr[u];
                    if (1 - clr[u] == 1) set1.add(v);
                    else set2.add(v);
                    q.add(v);
                } else if (clr[u] == clr[v])
                    return false;
            }
        }
        return true;

    }

    public List<Integer> topologicalSort() {
        int[] indegree = new int[n];
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            for (int j : adj.get(i)) {
                indegree[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        boolean first = false;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);

            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            al.add(u);
            for (int i : adj.get(u)) {
                --indegree[i];
                if (indegree[i] == 0)
                    q.add(i);
            }
        }
        return al;
    }

    public int countConnectedComponents() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {


                if (count == 0)
                    dfs(i, set1);
                else dfs(i, set2);
                count++;
            }
        }
        return count;
    }

    private void dfs(int i, HashSet<Integer> set2) {
        vertices++;
        set2.add(i);
        edges += adj.get(i).size();
        vis[i] = true;
        for (int j : adj.get(i)) {
            if (!vis[j]) {
                dfs(j, set2);
            }
        }
    }


}