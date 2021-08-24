package helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MyGraph {
    int n;
    ArrayList<HashSet<Long>> al = new ArrayList<>();
    long[] smaller, bigger;

    public MyGraph(int n) {
        this.n = n;
        smaller = new long[n];
        bigger = new long[n];
        for (long i = 0; i < n; i++) {
            al.add(new HashSet<>());
        }
    }

    public void addEdge(int from, int to) {
        al.get(from).add((long) to);
        al.get(to).add((long) from);
        if (from > to) {
            bigger[to]++;
            smaller[from]++;
        } else {
            bigger[from]++;
            smaller[to]++;
        }
    }

    public void removeEdge(int from, int to) {
        al.get(from).remove(new Long(to));
        al.get(to).remove(new Long(from));
        if (from > to) {
            bigger[to]--;
            smaller[from]--;
        } else {
            bigger[from]--;
            smaller[to]--;
        }
    }


    public long bfs() {
        long[] big = bigger.clone(), small = smaller.clone();
        long res = 0;
        Queue<Long> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (small[i] == 0 && big[i] != 0) {
                q.add((long) i);
            }
        }
        while (!q.isEmpty()) {
            long k = q.poll();
            int u = (int) k;
            res++;
            small[u] = 0;
            for (long v : al.get(u)) {
                small[(int) v]--;
                if (small[(int) v] == 0 && big[(int) v] != 0) {
                    q.add(v);
                }
            }

        }
        return res;

    }

}