package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class ACutRibbon {
    int[] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), a = in.readInt(), b = in.readInt(), c = in.readInt();
        dp = new int[n + 1];
        Arrays.fill(dp, -2);
        out.printLine(go(n, a, b, c));
    }

    private int go(int n, int a, int b, int c) {

        if (n == 0) return 0;
        if (n < 0) return -1;
        if(dp[n]!=-2) return dp[n];
        int x = go(n - a, a, b, c);
        int y = go(n - b, a, b, c);
        int z = go(n - c, a, b, c);
        int max = x;
        if (y != -1) max = Math.max(max, y);
        if (z != -1) max = Math.max(max, z);
        if (max == -1) return dp[n]=max;
        return dp[n] =  1 + max;
    }
}
