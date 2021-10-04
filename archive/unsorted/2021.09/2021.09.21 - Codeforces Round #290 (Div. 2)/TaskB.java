package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] a = in.readTable(n, m);
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j])
                    if (dfs(a, n, m, i, j, 1, a[i][j], 'l', vis)) {
                        out.printLine("Yes");
                        return;
                    }
            }
        }
        out.printLine("No");
    }

    private boolean dfs(char[][] a, int n, int m, int i, int j, int count, char par, char prev, boolean[][] vis) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        if (!vis[i][j] && a[i][j] != par) return false;
        if (vis[i][j] && a[i][j] != par) return false;
            if (vis[i][j] && (par) == a[i][j] && count >= 4) return true;
        vis[i][j] = true;
        boolean l = false, r = false, u = false, d = false;
        if (prev != 'l') {
            l = dfs(a, n, m, i, j - 1, count + 1, par, 'r', vis);
        }
        if (prev != 'r') {
            r = dfs(a, n, m, i, j + 1, count + 1, par, 'l', vis);
        }
        if (prev != 'u') {
            u = dfs(a, n, m, i - 1, j, count + 1, par, 'd', vis);
        }
        if (prev != 'd') {
            d = dfs(a, n, m, i + 1, j, count + 1, par, 'u', vis);
        }
        return l || r || u || d;


    }
}
