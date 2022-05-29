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

public class CCrazyTown {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        double x1 = in.readDouble(), y1 = in.readDouble(), x2 = in.readDouble(), y2 = in.readDouble();
        long n = in.readInt(), count = 0;
        for (int i = 0; i < n; i++) {
            double a = in.readDouble(), b = in.readDouble(), c = in.readDouble();
            double v1 = a * x1 + b * y1 + c;
            double v2 = a * x2 + b * y2 + c;
            if (v1 * v2 < 0.0) {
                count++;
            }
        }
        out.printLine(count);
    }
}
