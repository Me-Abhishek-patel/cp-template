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
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;

public class CToAddOrNotToAdd {
    int[] a;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int k = in.readInt();
        a = in.readIntArray(n);
        Arrays.sort(a);
        long[] b = new long[a.length];
        b[0] = a[0];
        for (int i = 1; i < n; i++) {
            b[i] = b[i - 1] + a[i];
        }
        int res = 1, num = a[0];
        for (int i = n - 1; i > 0; i--) {
            int lo = 0, hi = i;
            int ans = 1, len = 0;

            while (lo <= hi) {
                int mid = lo + (hi - lo + 1) / 2;
                long val = (long) (i - mid) * a[i] - (b[i ]-a[i] - ((mid != 0) ? b[mid - 1] :0 ));
                if (val <= k) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            len = i - ans + 1;
            if (len >= res) {
                res = len;
                num = a[i];
            }

        }
        out.printLine(res + " " + num);
    }
}
