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

public class BGCDArrays {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long l = in.readLong(), r = in.readLong(), k = in.readLong();
        if (l == r) {
            out.printLine(l != 1 ? "YES" : "NO");
            return;
        } else {
            long req = 0;
            if (l % 2 != 0 && r % 2 != 0) {
                req = (r - l) / 2 + 1;
            } else {
                req = (long) ceil(((double) (r - l) / 2.0));
            }
            out.printLine(req <= k ? "YES" : "NO");
        }
    }
}
