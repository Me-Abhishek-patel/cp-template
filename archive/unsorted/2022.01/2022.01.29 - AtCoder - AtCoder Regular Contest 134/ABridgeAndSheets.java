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

public class ABridgeAndSheets {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long l = in.readLong(), w = in.readLong();
        long[] a = in.readLongArray(n);
        long res = a[0] == 0 ? 0 : (long) ceil((double) a[0] / (w + 1));
        for (int i = 1; i < n; i++) {
            long diff = (a[i] - a[i - 1] - w);
            if (diff > 0) {
                res += ceil((double) diff / (w + 1));
            }
        }
        if (l - w >= a[n - 1]) {
            long diff = l - (w + a[n - 1]);
            if (diff > 0) {
                res += ceil((double) diff / (w + 1));
            }
        }
        out.printLine(res);

    }
}
