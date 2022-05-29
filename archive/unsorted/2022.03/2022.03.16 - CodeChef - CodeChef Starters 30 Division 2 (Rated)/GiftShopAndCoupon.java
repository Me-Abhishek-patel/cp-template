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

import java.util.Arrays;

public class GiftShopAndCoupon {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long k = in.readLong();
        long[] a = in.readLongArray(n);
        long count = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] <= k) {
                count++;
                k -= a[i];
            } else {
                if (ceil(a[i] / 2.0) <= k) count++;
                break;
            }
        }
        out.printLine(count);
    }
}
