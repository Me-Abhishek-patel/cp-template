package codes;

import static net.cplibrary.misc.MiscUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CBasketballExercise {
    long[][] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(n);
        dp = new long[3][n + 1];
        for (long[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        long res = go(0, a, b, 0);
        out.printLine(res);
    }

    private long go(int i, int[] a, int[] b, int row) {
        if (i == a.length) return 0;
        if (dp[row][i] != -1) return dp[row][i];
        long max = go(i + 1, a, b, 0);
        if (row != 1) {
            max = max(max, go(i + 1, a, b, 1) + a[i]);
        }
        if (row != 2) {
            max = max(max, go(i + 1, a, b, 2) + b[i]);
        }
        return dp[row][i] = max;

    }
}
