package codes;

import net.cplibrary.io.OutputWriter;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class webpages {
    int[] seen;
    ArrayList<ArrayList<Integer>> adjacency;
    PrintWriter out;

    public void solve(int testNumber, BufferedReader in, PrintWriter o) throws IOException {
        out = o;
        int n = Integer.parseInt(in.readLine());
        seen = new int[n];
        adjacency = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            adjacency.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            for (String s1 : s) {
                adjacency.get(i).add(Integer.parseInt(s1) - 1);
            }

        }


        String[] s = in.readLine().split(" ");
        int start = Integer.parseInt(s[0]) - 1, end = Integer.parseInt(s[1]) - 1;
        bfs(n, adjacency, start, end);
    }

    private void bfs(int n, ArrayList<ArrayList<Integer>> graph, int start, int end) {
        Deque<int[]> dq = new LinkedList<>();
        dq.add(new int[]{start, 0});

        while (!dq.isEmpty()) {
            int[] p = dq.poll();
            seen[p[0]] = -1;
            if (p[0] == end) {
                out.print(p[1]);
                return;
            }
            for (Integer adjacent : graph.get(p[0])) {
                if (1 != seen[adjacent]) {
                    dq.add(new int[]{adjacent, p[1] + 1});
                }
            }
        }
        out.print(-1);
    }
}
