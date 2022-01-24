package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class SubstringMinimumFunction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int zero = n - m;
        if (zero <= m) {
            out.printLine(zero);
            return;
        }

        int d = (m + 1);
        int q = zero / d;
        int r = zero % d;
        long sum = (long) ((long) q * (q + 1L) / 2) * (d - r);
        sum += ((long) (q + 1) * (q + 2) / 2L)*r;
        out.printLine(sum);


    }
}
