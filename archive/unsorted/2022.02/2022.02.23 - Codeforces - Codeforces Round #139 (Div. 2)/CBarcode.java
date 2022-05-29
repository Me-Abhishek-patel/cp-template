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

import net.cplibrary.collections.Triplet;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.HashMap;

public class CBarcode {
    char[][] a;
    int[] cost;
    int n, m, x, y;
    HashMap<Triplet<Integer, Integer, Integer>, Long> hm;
    int[][][] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        m = in.readInt();
        x = in.readInt();
        y = in.readInt();
        a = in.readTable(n, m);
        cost = new int[m];
        hm = new HashMap<>();
        dp = new int[1001][1001][3];
        for (int[][] ints : dp) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, -1);
            }
        }
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (a[j][i] == '#') ? 1 : 0;
            }
            cost[i] = sum;
        }
        long ans = go2(0, 0, 0);
        out.printLine(min(ans, go2(0, 0, 1)));
    }

//    private int go(int i, int b, int w) {
//        if (i == m) {
//            if ((b < x && b != 0) || (w < x && w != 0)) return 1001000;
//            else return 0;
//        }
//        if( dp[i][b][w]!=-1) return dp[i][b][w];
////        Triplet<Integer, Integer, Integer> t = Triplet.makeTriplet(i, b, w);
////        if (hm.containsKey(t)) return hm.get(t);
//        int min = 1010000;
//        if (b < x && b != 0 && m - i >= x - b) {
//            min = go(i + 1, b + 1, 0) + n - cost[i];
//        } else if (w < x && w != 0 && m - i >= x - w) {
//            min = go(i + 1, 0, w + 1) + cost[i];
//        } else if (b == y && m - i >= x - w) {
//            min = go(i + 1, 0, 1) + cost[i];
//        } else if (w == y && m - i >= x - b) {
//            min = go(i + 1, 1, 0) + n - cost[i];
//        } else {
//            if (m - i >= x - b)
//                min = min(min, go(i + 1, b + 1, 0) + n - cost[i]);
//            if (m - i >= x - w)
//                min = min(min, go(i + 1, 0, w + 1) + cost[i]);
//
//        }
////        hm.put(t, min);
//        return dp[i][b][w] = min;
//
//    }

    private int go2(int i, int count, int c) {
        if (i == m) {
            if (count < x) return 1001000;
            else return 0;
        }
//        Triplet<Integer, Integer, Integer> t = Triplet.makeTriplet(i, count, c);
//        if (hm.containsKey(t)) return hm.get(t);
        if (dp[i][count][c] != -1) return dp[i][count][c];

        int min = Integer.MAX_VALUE;
        if (count < x) {
            min = go2(i + 1, count + 1, c) + (c == 1 ? n - cost[i] : cost[i]);
        } else if (count == y) {
            min = go2(i + 1, 1, 1 - c) + (c == 0 ? n - cost[i] : cost[i]);
        }
        if (count >= x && count < y) {
            min = min(min, go2(i + 1, count + 1, c) + (c == 1 ? n - cost[i] : cost[i]));
            min = min(min, go2(i + 1, 1, 1 - c) + (c == 0 ? n - cost[i] : cost[i]));

        }
//        hm.put(t,min);
        return dp[i][count][c] = min;

    }

}
