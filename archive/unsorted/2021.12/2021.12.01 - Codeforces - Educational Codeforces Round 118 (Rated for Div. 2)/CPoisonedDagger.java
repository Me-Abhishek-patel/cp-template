package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CPoisonedDagger {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long h = in.readLong();
        int[] a = in.readIntArray(n);
        long mid = 0;
        long res = -1;
        long lo = 0, hi = Long.MAX_VALUE;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            long d = calcDamage(a, mid);
            if (d >= h) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        out.printLine(res);


    }

    private long calcDamage(int[] a, long k) {
        long res = 0;
        for (int i = 1; i < a.length; i++) {
            res += min(k, a[i] - a[i - 1]);
        }
        return res + k;
    }
}
