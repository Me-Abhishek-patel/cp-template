package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskC {
    int[] a;
    long[] dp ;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        a = in.readIntArray(n);
        dp = new long[n+5];
        long max = Long.MIN_VALUE;
        Arrays.fill(dp, -1);
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, go(i, n));
        }
        out.printLine(max);
    }

    private long go(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];
        return dp[i] = a[i - 1] + go(i + a[i - 1], n);
    }
}
