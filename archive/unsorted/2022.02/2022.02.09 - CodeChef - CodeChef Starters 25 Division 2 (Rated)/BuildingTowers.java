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

public class BuildingTowers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long x = in.readLong(), m = in.readLong();
        long hsb = Long.highestOneBit(x);
        int c = getCount(hsb);
        long result = 0;
        if (x == hsb) {
            result = c;
        } else result = c + 1;
        if (result > m) {
            out.printLine(0);
        } else {
            out.printLine((m - result) + 1);
        }
    }

    private int getCount(long msb) {
        int count = 0;
        while (msb != 0) {
            count++;
            msb = (msb >> 1);
        }
        return count;
    }
}
