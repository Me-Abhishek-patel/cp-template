package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        if (sum % 2 != 0) {
            out.printLine("No");
            return;
        }
        boolean[][] dp = new boolean[n + 1][sum / 2 + 1];
        for (int i = 1; i <= sum/2; i++) {
            dp[0][i] = false;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum / 2; j++) {
                if (a[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - a[i - 1]];
                }
            }
        }

        if (dp[n][sum / 2]) out.printLine("Yes");
        else out.printLine("No");

    }


}
