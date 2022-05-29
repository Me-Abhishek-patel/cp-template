package codes;

import static net.cplibrary.misc.MiscUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MinimumColoring {
    int[][] res;
    int n, m;
    boolean[][] visited;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        m = in.readInt();
        int x1 = in.readInt() - 1, y1 = in.readInt() - 1, x2 = in.readInt() - 1, y2 = in.readInt() - 1;
        res = new int[n][m];
        res[x1][y1] = 1;
        res[x2][y2] = 2;
        visited = new boolean[n][m];
        dfs(x1, y1, 1, 0);
        visited = new boolean[n][m];
        dfs(x2, y2, 2, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(res[i][j]==0){
                    res[i][j] = 3;
                }
            }
        }
        out.printIntTable(res);

    }

    private void dfs(int x, int y, int c, int d) {
        if (!isValidCell(x, y, n, m) || visited[x][y]) return;
        visited[x][y] = true;
        if (res[x][y] == 0 && d % 2 == 0) {
            res[x][y] = c;
        }
        for (int i = 0; i < DX4.length; i++) {
            dfs(x + DX4[i], y + DY4[i], c, d + 1);
        }
    }
}
