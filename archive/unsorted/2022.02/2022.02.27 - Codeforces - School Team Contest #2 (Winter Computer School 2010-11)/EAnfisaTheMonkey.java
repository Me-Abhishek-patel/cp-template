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

import java.util.ArrayList;
import java.util.Arrays;

public class EAnfisaTheMonkey {
    int k, a, b;
    ArrayList<Integer> al;
    int[][] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        k = in.readInt();
        a = in.readInt();
        b = in.readInt();
        al = new ArrayList<>();
        dp = new int[205][205];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        String s = in.readLine();
        boolean res = go(s.length(), k);
        if (!res) {
            out.printLine("No solution");
        }
        int i = 0;
        for (Integer l : al) {
            for (int j = i; j < i + l; j++) {
                out.print(s.charAt(j));
            }
            i = i + l;
            out.printLine();
        }

    }

    private boolean go(int n, int k) {
        if (n < 0 || k < 0) return false;
        if (n == 0) {
            return k == 0;
        }
        if (dp[n][k] != -1) return dp[n][k] == 1;
        for (int i = a; i <= b; i++) {
            if (go(n - i, k - 1)) {
                al.add(i);
                return true;
            }
        }
        dp[n][k] = 0;
        return false;
    }
}
