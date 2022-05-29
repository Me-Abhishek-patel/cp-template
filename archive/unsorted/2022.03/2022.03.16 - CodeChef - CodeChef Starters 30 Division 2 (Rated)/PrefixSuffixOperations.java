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

public class PrefixSuffixOperations {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[] a = in.readLongArray(n), b = in.readLongArray(n);
        long[] c = new long[n];
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (b[i] >= a[i]) {
                c[i] = b[i] - a[i];
                min = Math.min(min, c[i]);
            } else {
                out.printLine(-1);
                return;
            }
        }
        int p = n, q = -1;
        for (int i = 1; i < n; i++) {
            if (c[i] > c[i - 1]) {
                p = i;
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (c[i - 1] > c[i]) {
                q = i;
                break;
            }
        }
        if (p >= q) {
            out.printLine(c[0] + c[n - 1] - min);
        } else {
            boolean flag1 = true, flag2 = true;
            for (int i = p + 1; i < q; i++) {
                if (c[i - 1] > c[i]) {
                    flag1 = false;
                }
            }
            long max = c[p];
            for (int i = p + 1; i < q; i++) {
                if (c[i] > c[i - 1]) {
                    flag2 = false;
                }
                max = Math.max(c[i], max);
            }
            if ((flag1 || flag2) && c[p - 1] + c[q] >= max) {
                out.printLine(c[0] + c[n - 1]);
            } else {
                out.printLine(-1);
                return;
            }
        }

    }
}
