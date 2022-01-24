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

public class AnInterestingSequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if (n == 1) {
            out.printLine(0);
            return;
        }
        if (n == 0) {
            out.printLine(1);
            return;
        }
        if ((n & (n - 1)) == 0) {
            int res = (int) (log(n) / log(2));
            out.printLine(res);
        } else {
            int count = 0;
            while (n % 2 == 0) {
                n /= 2;
                count++;
            }
            out.printLine(count);
        }

    }
}
