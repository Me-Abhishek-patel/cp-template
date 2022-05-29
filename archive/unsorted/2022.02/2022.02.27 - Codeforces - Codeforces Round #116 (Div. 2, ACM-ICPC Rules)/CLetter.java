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

public class CLetter {
    String s;
    int[][] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        s = in.readLine();
        dp = new int[3][s.length() + 1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        int res = go(0, 1);

        out.printLine(res);
    }

    private int go(int i, int p) {
        if (i == s.length()) return 0;
        if (dp[p][i] != -1) return dp[p][i];
        char c = s.charAt(i);
        if (p == 1) {
            if (Character.isUpperCase(c))
                return dp[p][i] = go(i + 1, p);
            else {
                return dp[p][i] = min(go(i + 1, 2), 1 + go(i + 1, p));
            }
        } else {
            if (Character.isLowerCase(c))
                return dp[p][i] = go(i + 1, p);
            else {
                return dp[p][i] = 1 + go(i + 1, p);
            }
        }
    }
}
