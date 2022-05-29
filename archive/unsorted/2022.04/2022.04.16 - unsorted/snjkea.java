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

public class snjkea {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String[] s = in.readLine().split(" ");
        int val = Integer.parseInt(s[0]);
        int[] a = in.readIntArray(n);
        if (go(a, val, 0)) out.printLine("Possible");
        else out.printLine("Not Possible");
    }

    private boolean go(int[] a, int val, int i) {
        if (i == a.length || val < 0) {
            return false;
        }
        if (val == 0) return true;
        return go(a, val, i + 1) || go(a, val - a[i], i + 1);
    }
}
