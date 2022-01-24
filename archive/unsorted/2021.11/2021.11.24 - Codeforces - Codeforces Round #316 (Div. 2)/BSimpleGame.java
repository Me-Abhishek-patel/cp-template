package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BSimpleGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int x = 0;
        if (m - 1 > n - m) {
            x = (m - 1);
        } else if (m - 1 == n - m)
            x = (m - 1);
        else x = (m + 1);
        if (x < 1 || x > n) x = n;
        out.printLine(x);

    }
}
