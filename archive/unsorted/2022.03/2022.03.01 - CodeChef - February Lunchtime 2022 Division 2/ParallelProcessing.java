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

public class ParallelProcessing {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long[] b = prefixSumArray(a);
        long diff = Integer.MAX_VALUE;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long rest = b[n - 1] - b[i];
            if (abs(rest - b[i]) <= diff) {
                diff = abs(rest - b[i]);
                ans = max(rest, b[i]);
            }
        }
        out.printLine(ans);
    }
}
