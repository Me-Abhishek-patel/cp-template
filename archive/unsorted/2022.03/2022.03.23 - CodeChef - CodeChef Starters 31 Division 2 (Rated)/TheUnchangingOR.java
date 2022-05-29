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

public class TheUnchangingOR {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int x = 1;
        int count = 0;
        while (x <= n) {
            count++;
            x = (x << 1);
        }
        out.printLine(n - count);
    }
}
