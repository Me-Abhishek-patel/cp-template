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

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MergingBinaryStrings {
    int res = 0;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String a = in.readLine(), b = in.readLine();
        IntIntPair res = go(a, b, 0, 0, 0);
        out.printLine(res.second);
    }

    private IntIntPair go(String a, String b, int i, int j, int one) {
        if (i == a.length() && j == b.length()) {
            return new IntIntPair(0, 0);
        }

        int zero = MAX_VALUE;

        IntIntPair p1 = new IntIntPair(MAX_VALUE, MAX_VALUE);
        if (i != a.length()-1)
            p1 = go(a, b, i + 1, j, one + a.charAt(i) - '0');
        IntIntPair p2 = new IntIntPair(MAX_VALUE, MAX_VALUE);
        if (j != b.length()-1)
            p2 = go(a, b, i, j + 1, one + b.charAt(j) - '0');

        if (p1.second < p2.second) {
            if (a.charAt(i) == '1') {
                return new IntIntPair(p1.first, p1.second + p1.first);
            } else {
                return new IntIntPair(p1.first + 1, p1.second);
            }
        } else {
            if (a.charAt(i) == '1') {
                return new IntIntPair(p2.first, p2.second + p2.first);
            } else {
                return new IntIntPair(p2.first + 1, p2.second);
            }
        }

    }
}
