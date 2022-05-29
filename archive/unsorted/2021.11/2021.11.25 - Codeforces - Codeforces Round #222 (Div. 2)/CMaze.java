package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CMaze {
    int k = 0;
    boolean[][] vis;
    int[] row = {0, 0, 1, -1}, col = {1, -1, 0, 0};

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        k = in.readInt();
        char[][] a = in.readTable(n, m);
        vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '.') {
                    go(a, i, j);
                }
            }
        }
        out.printTable(a);
    }

    private boolean go(char[][] a, int i, int j) {
        if (!isValidCell(i, j, a.length, a[0].length) || a[i][j] == '#' || a[i][j] == 'X')
            return false;
        if (vis[i][j]) return false;
        vis[i][j] = true;
        boolean x = false;
        for (int r = 0; r < row.length; r++) {
            x = (x | go(a, i + row[r], j + col[r]));
        }
        if (!x && k > 0) {
            a[i][j] = 'X';
            k--;
        }
        return false;

    }
}
