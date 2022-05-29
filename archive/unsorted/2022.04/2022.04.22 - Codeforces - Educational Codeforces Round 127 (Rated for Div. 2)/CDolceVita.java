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

public class CDolceVita {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long x = in.readLong();
        long[] a = in.readLongArray(n);
        Arrays.sort(a);
        long[] pref = prefixSumArray(a);
        long res = 0;
        for (int i = 0; i < a.length; i++) {
            long t = x + i + 1 - pref[i];
            long ans = (t / (i + 1));
            if (ans > 0) res += ans;

        }
        out.printLine(res);
    }
}
