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

public class AReverse {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        boolean f = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1 && f) {
                f = false;
                int idx = indexOf(a, i + 1);
                int k = idx;
                while (idx >= i) {
                    out.print(a[idx] + " ");
                    idx--;
                }
                i = k;
            } else {
                out.print(a[i] + " ");
            }
        }
        out.printLine();
    }
}
