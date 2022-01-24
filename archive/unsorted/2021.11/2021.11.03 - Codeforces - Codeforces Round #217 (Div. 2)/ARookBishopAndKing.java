package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.LinkedList;
import java.util.Queue;

public class ARookBishopAndKing {
    int[] col = {1, -1, 1, -1}, row = {1, -1, -1, 1};

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int r1 = in.readInt(), c1 = in.readInt(), r2 = in.readInt(), c2 = in.readInt();
        int rook = 0, bishop = 0, king = 0;
        if (r1 != r2) rook++;
        if (c1 != c2) rook++;
        king += Math.max(Math.abs(r1 - r2), Math.abs(c1 - c2));
        boolean[][] vis = new boolean[9][9];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r1, c1, 0});
        while (!q.isEmpty()) {
            int[] c = q.poll();
            if (c[0] == r2 && c[1] == c2) {
                bishop = c[2];
                break;
            }
            vis[c[0]][c[1]] = true;
            for (int i = 1; i <= 8; i++) {
                for (int j = 0; j < row.length; j++) {
                    int r3 = c[0] + i * row[j], c3 = c[1] + i * col[j];
                    if (isValid(r3, c3) && !vis[r3][c3]) {
                        vis[r3][c3] = true;
                        q.add(new int[]{r3, c3, c[2] + 1});
                    }
                }

            }

        }
        out.printLine(rook+" "+bishop+" "+king);
    }

    private boolean isValid(int r, int c) {
        return !(r <= 0 || r >= 9 || c <= 0 || c >= 9);
    }
}
