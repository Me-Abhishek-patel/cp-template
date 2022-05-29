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

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

public class PalindromicCount {
    BitSet[] dp;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int m = in.readInt();
        int[] a = in.readIntArray(m);
        dp = new BitSet[n];
//        HashSet<IntIntPair> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dp[i] = new BitSet(n);
            dp[i].set(i);
        }
        int max = maxElement(a);


        for (int sz = 2; sz <= max + 1; sz++) {
            for (int i = 0; i + sz - 1 < n; i++) {
                int start = i, end = i + sz - 1;
                if (sz == 2) {
                    if (s.charAt(start) == s.charAt(end)) {
                        dp[start].set(end);
                    } else dp[start].clear(end);

                } else {
                    if (s.charAt(start) == s.charAt(end) && dp[start + 1].get(end - 1)) {
                        dp[start].set(end);
                    } else dp[start].clear(end);
                }
            }
        }


        long res = 0;
        int[] freq = new int[10006];
        Arrays.fill(freq, -1);
        for (int sz : a) {
            if (freq[sz] != -1) {
                res += freq[sz];
                continue;
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i + sz - 1 < n) {
                    if (dp[i].get(i + sz - 1)) {
                        count++;
                    }
                } else break;
            }
            freq[sz] = count;
            res+=count;
        }
        out.printLine(res);
    }
}

