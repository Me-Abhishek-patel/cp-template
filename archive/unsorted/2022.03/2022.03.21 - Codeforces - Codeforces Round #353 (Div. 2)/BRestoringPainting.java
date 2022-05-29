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

public class BRestoringPainting {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[][] mat = new int[3][3];
        long n = in.readInt();
        long a = in.readInt(), b = in.readInt(), c = in.readInt(), d = in.readInt();
        long[] sums = {a + b, a + c, c + d, b + d};
        long diff = 0;
        for (long sum : sums) {
            for (long i : sums) {
                diff = max(abs(sum - i), diff);
            }
        }
//        out.printLine(diff);
        if (diff >= n) {
            out.printLine(0);
            return;
        }
        out.printLine(n * (n - diff));
    }
}
