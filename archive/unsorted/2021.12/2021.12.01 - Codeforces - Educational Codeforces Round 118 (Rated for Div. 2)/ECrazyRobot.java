package codes;

import static net.cplibrary.misc.MiscUtils.*;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


public class ECrazyRobot {
    int n, m;
    int[] row = {1, -1, 0, 0}, col = {0, 0, -1, 1};

    class triplet {
        int a, b, c;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof triplet)) return false;
            triplet triplet = (triplet) o;
            return a == triplet.a && b == triplet.b && c == triplet.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        m = in.readInt();
        char[][] a = in.readTable(n, m);
        boolean[][] vis = new boolean[n][m];
        HashSet<Integer> hs = new HashSet<>();

        Queue<IntIntPair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'L') {
                    q.add(new IntIntPair(i, j));
                    break;
                }
            }
        }
        triplet tr = new triplet();
        tr.hashCode();

        while (!q.isEmpty()) {
            IntIntPair pair = q.poll();
            vis[pair.first][pair.second] = true;
            int c = 0;
            for (int d = 0; d < col.length; d++) {
                int x = pair.first + row[d], y = pair.second + col[d];
                if (go2(a, vis, x, y)) c++;
            }
            int plus = 0;
            for (int d = 0; d < col.length; d++) {
                int x = pair.first + row[d], y = pair.second + col[d];
                if (plcheck(a, vis, x, y)) plus++;
            }
            if (c == 2 && a[pair.first][pair.second] != 'L')
                a[pair.first][pair.second] = '+';


            for (int d = 0; d < col.length; d++) {
                int x = pair.first + row[d], y = pair.second + col[d];
                if (valid(a, vis, x, y)) {
                    vis[x][y] = true;
                    q.add(IntIntPair.makePair(x, y));
                }
            }


        }

        out.printTable(a);
    }

    private boolean plcheck(char[][] a, boolean[][] vis, int i, int j) {
        if (isValidCell(i, j, n, m) && a[i][j] == '+') return true;
        return false;
    }

    private boolean go2(char[][] a, boolean[][] vis, int i, int j) {
        if (!isValidCell(i, j, n, m) || a[i][j] == '#') return false;
        return true;
    }

    private boolean valid(char[][] a, boolean[][] vis, int i, int j) {
        if (!isValidCell(i, j, n, m) || a[i][j] == '#' || vis[i][j]) return false;
        return true;
    }

    private boolean go(char[][] a, boolean[][] vis, int i, int j) {
        if (!isValidCell(i, j, n, m) || a[i][j] == '#') return false;
        if (vis[i][j]) return a[i][j] == '+';
        if (a[i][j] != 'L') a[i][j] = '+';
        vis[i][j] = true;
        boolean flag = false;
        for (int d = 0; d < col.length; d++) {
            flag = (flag | go(a, vis, i + row[d], j + col[d]));
        }

        return flag;
    }
}
