package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.fill;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.util.HashMap;

public class BDividingSubsequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.readInt();
        int[] p = in.readIntArray(n), q = in.readIntArray(n);
//        HashMap<IntIntPair, Integer> dp = new HashMap<>();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (q[i - 1] % p[j - 1] == 0) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
//        fill(dp,-1);
//        int len = go(p, q, n - 1, n - 1, dp);
        out.printLine(dp[n][n]);
    }
}
