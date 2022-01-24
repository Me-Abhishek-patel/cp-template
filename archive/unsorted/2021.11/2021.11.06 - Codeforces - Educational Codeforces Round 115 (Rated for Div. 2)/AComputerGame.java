package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AComputerGame {
    final int[] c = {1, -1, 0, 0, 1, 1, -1, -1}, r = {0, 0, 1, -1, 1, -1, 1, -1};

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[][] a = in.readTable(2, n);
        out.printLine(dfs(0, 0, a) ? "YES" : "NO");

    }

    private boolean dfs(int i, int j, char[][] a) {
        if (i < 0 || i >= 2 || j < 0 || j >= a[0].length || a[i][j] == '1') return false;
        a[i][j] = '1';
        if (i == 1 && j == a[0].length - 1) return true;
        boolean x = false;
        for (int k = 0; k < r.length; k++) {
            if (dfs(i + r[k], j + c[k], a))
                x = true;
        }
        return x;
    }
}
