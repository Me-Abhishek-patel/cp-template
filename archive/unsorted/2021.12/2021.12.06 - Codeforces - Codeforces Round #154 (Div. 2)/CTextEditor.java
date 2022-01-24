package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CTextEditor {
    class Pos {
        int r, c, dist;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pos)) return false;
            Pos pos = (Pos) o;
            return r == pos.r && c == pos.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(r, c);
        }

        public Pos(int l, int c, int dist) {
            this.r = l;
            this.c = c;
            this.dist = dist;
        }
    }

    int[] row = {1, -1, 0, 0}, col = {0, 0, 1, -1}, a;
    int n;
    int[][] dist;


    public void solve(int testNumber, InputReader in, OutputWriter out) {

        n = in.readInt();
        a = in.readIntArray(n);
        Queue<Pos> q = new LinkedList<>();
        HashSet<Pos> vis = new HashSet<>();
        int r1 = in.readInt() - 1, c1 = in.readInt() - 1, r2 = in.readInt() - 1, c2 = in.readInt() - 1;
        q.add(new Pos(r1, c1, 0));
        vis.add(new Pos(r1, c1, 0));
        while (!q.isEmpty()) {
            Pos p = q.poll();
            if (p.r == r2 && p.c == c2) {
                out.printLine(p.dist);
                return;
            }
            for (int i = 0; i < col.length; i++) {
                Pos newPos = new Pos(p.r + row[i], p.c + col[i], p.dist + 1);
                if (newPos.r != r2 && newPos.c != p.c) continue;
                if (isValid(newPos)) {
                    if (newPos.c > a[newPos.r])
                        newPos.c = a[newPos.r];
                    if (!vis.contains(newPos)) {
                        q.add(newPos);
                        vis.add(newPos);
                        if (newPos.r == r2 && newPos.c == c2) {
                            out.printLine(newPos.dist);
                            return;
                        }
                    }
                }


            }

        }

    }


    private boolean isValid(Pos p) {
        if (p.r >= n || p.r < 0 || p.c < 0)
            return false;
        return true;
    }
}
