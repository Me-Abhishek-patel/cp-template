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

public class AverageGift {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long x = in.readLong();
        long[] a = in.readLongArray(n);
        long max = maxElement(a);
        long min = minElement(a);
        if ((a.length == 1 && a[0] != x) || max < x || min > x) {
            out.printLine("NO");
            return;
        }
        out.printLine("YES");
    }
}
