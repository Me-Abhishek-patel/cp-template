package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BananaBunches {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] b = in.readIntArray(n);
        long[][][][] dp = new long[n + 1][k + 1][3][2];
//        ArrayUtils.fill(dp, -1);
        long res = go(b, 0, k, 0, 0, dp);
        if (res >= Integer.MAX_VALUE) res = -1;
        out.printLine("Case #" + testNumber + ": " + res);
    }

    private long go(int[] b, int i, int k, int count, int bool, long[][][][] dp) {
        if (k == 0) return 0;
        if (i == b.length || k < 0) return Integer.MAX_VALUE;
        if (count >= 2) return Integer.MAX_VALUE;
        if (dp[i][k][count][bool] != 0) return dp[i][k][count][bool];

        long res = Integer.MAX_VALUE;
        if (bool == 0) {
            res = Math.min(1 + go(b, i + 1, k - b[i], count, 1, dp), go(b, i + 1, k, count, 0, dp));
        } else if (bool == 1) {
            res = Math.min(1 + go(b, i + 1, k - b[i], count, 1, dp), go(b, i + 1, k, count + 1, 0, dp));
        } else {
            res = go(b, i + 1, k, 0, 0, dp);
        }
        return dp[i][k][count][bool] = res;
    }
}
