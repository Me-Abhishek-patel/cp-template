package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

public class CVacations {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[][] dp = new int[n + 1][4];
        ArrayUtils.fill(dp, -1);
        int x = go(a, 0, 0, dp);
        out.printLine(x);
    }

    private int go(int[] a, int i, int prev, int[][] dp) {
        if (i == a.length) return 0;
        if (dp[i][prev] != -1) return dp[i][prev];
        if (a[i] == 0) {
            return dp[i][prev] = 1 + go(a, i + 1, 0, dp);
        } else if (a[i] == 1 || a[i] == 2) {
            if (prev == a[i]) {
                return dp[i][prev] = 1 + go(a, i + 1, 0, dp);
            } else {
                return dp[i][prev] = Math.min(go(a, i + 1, a[i], dp), 1 + go(a, i + 1, 0, dp));
            }
        } else if (a[i] == 3) {
            int min = Integer.MAX_VALUE;
            min = Math.min(min, 1 + go(a, i + 1, 0, dp));
            if (prev != 1)
                min = Math.min(min, go(a, i + 1, 1, dp));
            if (prev != 2)
                min = Math.min(min, go(a, i + 1, 2, dp));
            return dp[i][prev] = min;

        }
        return 0;
    }
}
