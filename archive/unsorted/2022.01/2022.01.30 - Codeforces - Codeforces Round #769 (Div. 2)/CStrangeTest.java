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

public class CStrangeTest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(), b = in.readInt();
        int diff = b - a;
        int diff2 = (a + Integer.highestOneBit(b)) - b + 1;
        int diff3 = (b - Integer.highestOneBit(b)) > a ? (b - Integer.highestOneBit(b)) - a + 1 : MAX_VALUE;
        int diff4 = ((a | b) == b) ? 1 : MAX_VALUE;
        int diff5 = (a | b);
        out.printLine(min(min(diff, diff4), min(diff2, diff3)));

    }
}
