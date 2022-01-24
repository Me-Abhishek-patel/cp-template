package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CGuessYourWayOut {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int h = in.readInt();
        long n = in.readLong();
        long res = go(h, n, false, 1L, 1L << (h));
        out.printLine(res);
    }

    private long go(int h, long n, boolean tr, long left, long right) {
        if (h == 0 || left == right) return 0;
        long mid = left + (right - left) / 2;
        if (tr) {
            if (n > mid) {
                return 1L + go(h - 1, n, false, mid + 1, right);
            } else {
                return right - left + 1L + go(h - 1, n, true, left, mid);
            }
        } else {
            if (n > mid) {
                return right - left + 1L + go(h - 1, n, false, mid + 1, right);
            } else
                return 1L + go(h - 1, n, true, left, mid);
        }
    }
}
