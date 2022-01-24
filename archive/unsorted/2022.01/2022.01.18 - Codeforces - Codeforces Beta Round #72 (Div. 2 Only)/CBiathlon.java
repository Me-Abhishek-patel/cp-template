package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import static java.lang.String.*;
import static java.lang.Character.*;


import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;

public class CBiathlon {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashSet<Integer> hs = new HashSet<>();
        int[][] target = new int[n][4];
        for (int i = 0; i < n; i++) {
            target[i][0] = i + 1;
            target[i][1] = in.readInt();
            target[i][2] = in.readInt();
            target[i][3] = Integer.MAX_VALUE;
        }
        Arrays.sort(target, (x, y) -> x[1] - y[1]);
        int m = in.readInt();
        int count = 0;
        int[][] arrows = new int[m][3];
        for (int i = 0; i < m; i++) {
            arrows[i][0] = i + 1;
            arrows[i][1] = in.readInt();
            arrows[i][2] = in.readInt();
            hitIdx(target, arrows[i][1], arrows[i][2], i, hs);

        }
        Arrays.sort(target, (x, y) -> x[0] - y[0]);
        out.printLine(hs.size());
        for (int i = 0; i < n; i++) {
            if (target[i][3] != MAX_VALUE)
                out.print(target[i][3] + " ");
            else out.print(-1 + " ");
        }
        out.printLine();


    }

    private void hitIdx(int[][] target, int x, int y, int i, HashSet<Integer> hs) {
        int lo = 0, hi = target.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (x >= target[mid][1] - target[mid][2] && x <= target[mid][1] + target[mid][2]) {

                if (mid != 0 && x == target[mid - 1][1] + target[mid - 1][2]) {
                    if (distance(target[mid - 1][1], 0, x, y) <= target[mid - 1][2]) {
                        target[mid - 1][3] = min(i + 1, target[mid - 1][3]);
                        hs.add(mid - 1);
                    }
                }
                if (mid != target.length - 1 && x == target[mid + 1][1] - target[mid + 1][2]) {
                    if (distance(target[mid + 1][1], 0, x, y) <= target[mid + 1][2]) {
                        target[mid + 1][3] = min(i + 1, target[mid + 1][3]);
                        hs.add(mid + 1);
                    }
                }
                if (distance(target[mid][1], 0, x, y) <= target[mid][2]) {
                    target[mid][3] = Integer.min(i + 1, target[mid][3]);
                    hs.add(mid);
                }
                return;
            } else if (x < target[mid][1] - target[mid][2]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
    }
}
