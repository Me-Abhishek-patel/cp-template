package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
//        int[][] dp = new int[n + 1][180 * 16];
//        int[][] dp2 = new int[n + 1][180 * 16];
//        ArrayUtils.fill(dp, -1);
//        ArrayUtils.fill(dp, -1);
        if (go(0, a, 0, n))
            out.printLine("YES");
        else out.printLine("NO");
    }

    private boolean go(int sum, int[] a, int i, int n) {
//        int res = 0;
//
//        if (sum < 0)
//            res = dp2[i][Math.abs(sum)];
//        else res = dp[i][sum];
//
//        if (res != -1) return res == 1;

        if (i == n) {
//            System.out.println(sum);
            return sum == 0 || Math.abs(sum) % 360 == 0;
        }

        return (go(sum + a[i], a, i + 1, n) || go(sum - a[i], a, i + 1, n));
//            if (sum < 0)
//                dp2[i][Math.abs(sum)] = 1;
//            else
//                dp[i][sum] = 1;
//        } else {
//            if (sum < 0)
//                dp2[i][Math.abs(sum)] = 0;
//            else
//                dp[i][sum] = 0;
//        }
//
//        return sum < 0 ? dp2[i][Math.abs(sum)] == 1 : dp[i][sum] == 1;
    }
}
