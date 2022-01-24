package codes;

import static java.lang.Math.*;

import net.cplibrary.collections.Pair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class CHardProblem {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        String[] s = in.readStringArray(n);
        HashMap<Pair<String, Integer>, Long> dp = new HashMap<>();

        long min = Long.MAX_VALUE - Integer.MAX_VALUE;
        min = min(min, go(a, s[0], s, 1, dp));
        String rev = (new StringBuilder(s[0])).reverse().toString();
        min = Math.min(min, go(a, rev, s, 1, dp) + a[0]);

        if (min == Long.MAX_VALUE - Integer.MAX_VALUE) min = -1;

        out.printLine(min);
    }

    private long go(int[] a, String prev, String[] s, int i, HashMap<Pair<String, Integer>, Long> dp) {
        if (i == a.length) return 0;
        Pair p = Pair.makePair(prev, i);
        if (dp.containsKey(p)) return dp.get(p);
        long min = Long.MAX_VALUE - Integer.MAX_VALUE;
        if (prev.compareTo(s[i]) <= 0) {
            min = Math.min(min, go(a, s[i], s, i + 1, dp));
        }
        String rev = (new StringBuilder(s[i])).reverse().toString();
        if (prev.compareTo(rev) <= 0) {
            min = Math.min(min, go(a, rev, s, i + 1, dp) + a[i]);
        }
        dp.put(p, min);
        return min;

    }

}
