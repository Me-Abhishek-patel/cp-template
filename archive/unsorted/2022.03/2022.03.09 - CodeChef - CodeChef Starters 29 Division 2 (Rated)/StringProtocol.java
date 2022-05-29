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

public class StringProtocol {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {

        int n = sc.readInt();
        String s = sc.readString();
        int res = 0;
        res = getRes(s, res);
        out.printLine(n - res);
    }

    private int getRes(String s, int res) {
        for (int it = 0; it < s.length() - 1; it++) {

            if (s.charAt(it) == s.charAt(it + 1)) {
                it++;
                res++;
            }

        }
        return res;
    }
}