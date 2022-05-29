package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CConstanzesMachine {
    int[] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        if (s.contains("m") || s.contains("w")) {
            out.printLine(0);
            return;
        }
        dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        int res = go(0, s);

        out.printLine(res % MOD7);
    }

    private int go(int i, String s) {
        if (i == s.length()) return 1;
        if (dp[i] != -1) return dp[i] % MOD7;
        int res = go(i + 1, s);
        if (i != s.length() - 1 && s.charAt(i) == 'u' && s.charAt(i + 1) == 'u') {
            res = (res % MOD7 + go(i + 2, s) % MOD7) % MOD7;
        }
        if (i != s.length() - 1 && s.charAt(i) == 'n' && s.charAt(i + 1) == 'n') {
            res = (res % MOD7 + go(i + 2, s) % MOD7) % MOD7;
        }
        return dp[i] = res % MOD7;
    }
}
