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

public class YetAnotherConstructiveProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x = in.readInt();
        int lb = Integer.lowestOneBit(x);
        int a = (x & (x - 1));
        if (x == 1) {
            out.printLine(0 + " " + x + " " + 3);
            return;
        }
        if ((x & (x - 1)) == 0) {
            out.printLine(0 + " " + x + " " + (x + 1));
            return;
        }
        out.printLine(a + " " + lb + " " + x);
    }
}
