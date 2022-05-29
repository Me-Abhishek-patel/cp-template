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

public class ANewYearAndHurry {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int rem = 240 - k;
        int ans = 0;
        int lo = 0, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo + 1) / 2;
            int mVal = cal(mid);
            if (mVal <= rem) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }
        out.printLine(ans);
    }

    private int cal(int mid) {
        int ans = 0;
        for (int i = 1; i <= mid; i++) {
            ans += 5 * i;
        }
        return ans;
    }
}
