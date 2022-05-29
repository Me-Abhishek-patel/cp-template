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

public class CGeraldsHexagon {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[] a = in.readIntArray(6);
        int min = minElement(a), max = maxElement(a);
        if (min == max) {
            long res = calculate(min, 0);
            out.printLine(6 * res);
        } else {
            int maxCount = count(a, max), minCount = count(a, min);
//            long maxr = calculate(max, 0);
//            long minr = calculate(min, 0);
//            long difr = calculate(max - min, 0);
//            out.printLine((maxCount*maxr)+(minCount*minr)-((maxCount-1)*difr));
            out.printLine((int)pow(a[0] + a[1] + a[2], 2) - a[0] * a[0] - a[2] * a[2] - a[4] * a[4]);
        }
    }

    private long calculate(int i, int l) {
        if (i <= l) return 0;
        else
            return 2L * (i - 1) + 1 + calculate(i - 1, l);
    }
}
