package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.collections.Pair;
import net.cplibrary.collections.Quadruple;
import net.cplibrary.collections.Triplet;
import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import org.apache.commons.lang3.tuple.Triple;

import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WanderingQueen {
    static int[] row = {1, -1, 0, 0, 1, -1, 1, -1}, col = {0, 0, 1, -1, 1, -1, -1, 1};

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] a = in.readTable(n, m);
        int[][] dir = new int[n][m];
        Queue<Triplet<Integer, Integer, Integer>> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                dir[i][j] = new BitSet(8);
                if (a[i][j] == 'S') {
                    Triplet<Integer, Integer, Integer> t = Triplet.makeTriplet(i, j, 1);
                    q.add(t);
                    for (int k = 0; k < 8; k++) {
                        dir[i][j] |= (1 << k);
                    }
                    break;
                }
            }
        }

        while (!q.isEmpty()) {
            Triplet<Integer, Integer, Integer> u = q.poll();

            int y = u.first, x = u.second, cost = u.third;
            //right 0
            for (int i = y, j = x + 1; isValidCell(i, j, n, m); j++) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 0)) != 0) break;
                dir[i][j] |= (0);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }
            //right down 1
            for (int i = y + 1, j = x + 1; isValidCell(i, j, n, m); j++, i++) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 1)) != 0) break;
                dir[i][j] |= (1 << 1);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }
            // down 2
            for (int i = y + 1, j = x; isValidCell(i, j, n, m); i++) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 2)) != 0) break;
                dir[i][j] |= (1 << 2);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }
            //left down 3
            for (int i = y + 1, j = x - 1; isValidCell(i, j, n, m); j--, i++) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 3)) != 0) break;
                dir[i][j] |= (1 << 3);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }

            //left 4
            for (int i = y, j = x - 1; isValidCell(i, j, n, m); j--) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 4)) != 0) break;
                dir[i][j] |= (1 << 4);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }
            //left up 5
            for (int i = y - 1, j = x - 1; isValidCell(i, j, n, m); j--, i--) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 5)) != 0) break;
                dir[i][j] |= (1 << 5);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }
            //up 6
            for (int i = y - 1, j = x; isValidCell(i, j, n, m); i--) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 6)) != 0) break;
                dir[i][j] |= (1 << 6);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }
            //right up 7
            for (int i = y - 1, j = x + 1; isValidCell(i, j, n, m); j++, i--) {
                if (a[i][j] == 'X' || (dir[i][j] & (1 << 7)) != 0) break;
                dir[i][j] |= (1 << 7);
                if (a[i][j] == 'F') {
                    out.printLine(cost);
                    return;
                }
                q.add(Triplet.makeTriplet(i, j, cost + 1));

            }


        }
        out.printLine(-1);

    }
}
