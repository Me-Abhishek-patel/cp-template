package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), d = in.readInt();
        String s = in.readLine();
        int[] dp = new int[n];
        Arrays.fill(dp, 10000);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                for (int j = i; j <= i + d && j < n; j++) {
                    if (s.charAt(j) == '1')
                        dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
        }
        if (dp[n - 1] == 10000) out.printLine(-1);
        else out.printLine(dp[n - 1]);
    }

}
