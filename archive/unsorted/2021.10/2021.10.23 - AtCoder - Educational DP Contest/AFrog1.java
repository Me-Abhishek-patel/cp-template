package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;


public class AFrog1 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] h = in.readIntArray(n);
        int[] dp = new int[n + 1];
//        Arrays.fill(dp, -1);
//        int x = go(h, 0, dp);
//        dp[0] = dp[1] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + Math.abs(h[i] - h[i-1]);
            if (i - 2 >= 0)
                dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i]-h[i-2]));
        }

        out.printLine(dp[n-1]);
    }

//    private int go(int[] h, int i, int[] dp) {
//        int res = Integer.MAX_VALUE;
//        if(dp[i]!=-1)return dp[i];
//        if (i >= h.length - 1) return 0;
//        if (i + 1 < h.length)
//            res = Math.abs(h[i] - h[i + 1]) + go(h, i + 1, dp);
//        if (i + 2 < h.length)
//            res = Math.min(res, Math.abs(h[i] - h[i + 2]) + go(h, i + 2, dp));
//        return dp[i] = res;
//    }
}
