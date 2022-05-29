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

public class AMinimumsAndMaximums {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int l1 = in.readInt(), r1 = in.readInt(), l2 = in.readInt(), r2 = in.readInt();
        if (l1 >= l2 && l1 <= r2) {
            out.printLine(l1);
        } else if (l2 >= l1 && l2 <= r1) {
            out.printLine(l2);
        } else if ((r1 >= l2 && r1 <= r2)) {
            out.printLine((l2));
        } else if (r2 >= l1 && r2 <= r1) {
            out.printLine(l1);
        } else {
            out.printLine(l1 + l2);
        }
    }
}
