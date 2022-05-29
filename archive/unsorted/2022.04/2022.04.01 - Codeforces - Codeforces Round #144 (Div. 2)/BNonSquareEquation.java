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

import net.cplibrary.generated.collections.list.LongList;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BNonSquareEquation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        long res = Long.MAX_VALUE;
        for (long b = 0; b <= 90; b++) {
            long x = (long) ((-b + sqrt(b * b + 4 * n)) / 2);
            if (x < 0) {
                x = (long) ((-b - sqrt(b * b + 4 * n)) / 2);
            }
            if (x*x+sumDigits(x)*x == n) {
                res = min(res, x);
            }
        }

        out.printLine(res == Long.MAX_VALUE ? -1 : res);

    }

    private long sumDigits(long i) {
        long sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
