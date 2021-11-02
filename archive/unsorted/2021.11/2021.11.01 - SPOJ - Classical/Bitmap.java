package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bitmap {
    int[] row = {-1, 1, 0, 0}, col = {0, 0, -1, 1};
    boolean[][] vis;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] a = in.readTable(n, m);
        int[][] res = new int[n][m];
        vis = new boolean[n][m];
        for (int i = 0; i < res.length; i++) {
            Arrays.fill(res[i], Integer.MAX_VALUE);
        }
        Queue<IntIntPair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '1') {
                    q.add(new IntIntPair(i, j));
                    res[i][j] = 0;
                    vis[i][j] = true;
                }
            }
        }
        dfs(a, res, q);
        for (int i = 0; i < n; i++) {
            out.printLine(res[i]);
        }
    }

    private void dfs(char[][] a, int[][] res, Queue<IntIntPair> q) {
        while (!q.isEmpty()) {
            IntIntPair p = q.poll();
            for (int i = 0; i < row.length; i++) {
                int x = p.first + row[i], y = p.second + col[i];
                if (x >= 0 && x < a.length && y >= 0 && y < a[0].length && !vis[x][y]) {
                    res[x][y] = res[p.first][p.second] + 1;
                    q.add(new IntIntPair(x, y));
                    vis[x][y] = true;
                }
            }
        }
    }


}
