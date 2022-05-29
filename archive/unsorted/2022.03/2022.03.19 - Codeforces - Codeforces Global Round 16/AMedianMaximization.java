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

public class AMedianMaximization {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), s = in.readInt();
        int ans = 0;
        int key = n / 2 + 1;
        int lo = 0, hi = s;
        while (lo <= hi) {
            int mid = lo + (hi - lo + 1) / 2;
            if (mid == 0) break;
            int v = s / mid;
            if (v < key) {
                hi = mid - 1;
            } else if (v > key) {
                ans = mid;
                lo = mid + 1;
            } else if (v == key) {
                ans = mid;
                lo = mid + 1;
            }
        }
        out.printLine(ans);
    }
}
