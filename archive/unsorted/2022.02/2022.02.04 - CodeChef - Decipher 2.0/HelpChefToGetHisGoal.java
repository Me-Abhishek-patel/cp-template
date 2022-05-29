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

import java.math.BigInteger;

public class HelpChefToGetHisGoal {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int sq = n * n;
        String s = String.valueOf(sq);
        String t = String.valueOf(n);
        if (s.contains(t)) {
            if (s.lastIndexOf(t) == s.length() - t.length()) {
                out.printLine(1);
            } else {
                out.printLine(0);
            }
        }else {
            out.printLine(0);
        }
    }
}
