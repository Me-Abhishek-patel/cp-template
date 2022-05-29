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

public class PermutationXORSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        long k = n;

        long res = 0;
        while (k > 1) {
            long hb = Long.highestOneBit(k);
            long nhb = (hb << 1);
            if (hb == k) {
                res += (((k - 2) * (k - 1)) + ((k - 1) ^ k) * 2);
                k = 0;
            } else if (nhb-1 == k ) {
                res += (((k - 1) * (nhb - 1)));
                k = 0;
            } else {

                long left = nhb - 2 - k;
                long t = (nhb - 1) * (k - left);
                res += t;
                k = left;

            }
        }
        out.printLine(res);


    }
}
