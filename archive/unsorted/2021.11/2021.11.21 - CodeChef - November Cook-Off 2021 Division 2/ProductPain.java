package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ProductPain {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long sum = 0;
        for (int len = 2; len < n; len++) {
            for (int i = 0; i + len < n; i++) {
                long max = 0;
                int k = lowerBound(a, (a[i] + a[i + len]) / 2, i, i + len - 1);
                if (k < i + len && k > i) {
                    long t = abs((long) abs(a[i] - a[k]) * abs(a[k] - a[i + len]));
                    max = Math.max(max, t);
                }
                k = upperBound(a, (a[i] + a[i + len]) / 2, i, i + len - 1);
                if (k < i + len && k > i)
                    max = Math.max(max, abs((long) abs(a[i] - a[k]) * abs(a[k] - a[i + len])));

                sum += max;
            }

        }
        out.printLine(sum);
    }
}
