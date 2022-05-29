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

public class CBallsAndBoxes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), x = in.readInt();
        long[] a = in.readLongArray(n);
        long min = minElement(a);
        for (int i = 0; i < a.length; i++) {
            a[i] -= min;
        }
        int j = x - 1;
        long count = 0;
        while (a[j] != 0) {
            a[j--]--;
            count++;
            if (j == -1) j = n - 1;
        }
        a[j] = count + min * n;
        out.printLine(a);
    }
}
