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

public class BeatTheSpread {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long sum = in.readLong(), diff = in.readLong();
        double x = (sum + diff) / 2.0;
        double y = sum - x;
        if (sum < diff || x < 0 || y < 0 || (sum + diff) % 2 != 0) {
            out.printLine("impossible");

        } else {
            out.printLine((long) max(x, y) + " " + (long) min(x, y));
        }
    }
}
