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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AntsOnAStick {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), x = in.readInt(), y = in.readInt();
        long z = ((n + 1) * n) / 2;
        for (int i = 1; true; i++) {
            if ((x * i + y * i) == z) {
                x = x * i;
                y = y * i;
                break;
            }
            if ((x * i + y * i) > z) {
                out.printLine("Case #" + testNumber + ": " + "IMPOSSIBLE");
                return;
            }
        }
        out.printLine("Case #" + testNumber + ": " + "POSSIBLE");
        HashSet<Long> hs = new HashSet<Long>();
        long f = max(x, y);
        for (long i = n; i > 0; i--) {
            f -= i;
            if (f < i) {
                if (f != 0) hs.add(f);
                for (long l = i; l <= n; l++) {
                    hs.add(l);
                }
                break;
            }
        }
        if (x >= y) {
        out.printLine(hs.size());
        for (Long h : hs) {
            out.print(h + " ");
        }
        } else {
            out.printLine(n - hs.size());
            for (long i = 1; i < n; i++) {
                if (!hs.contains(i)) out.print(i + " ");
            }
        }
        out.printLine();

    }
}
