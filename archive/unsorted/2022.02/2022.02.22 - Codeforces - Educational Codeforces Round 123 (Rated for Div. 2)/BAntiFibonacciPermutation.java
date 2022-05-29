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

public class BAntiFibonacciPermutation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = new int[n];
        int k = 0;
        for (int i = n; i >= 1; i--) {
            a[k++] = i;
        }
        k = n - 1;
        for (int i = 0; i < n; i++) {
            out.printLine(a);
            if (i == n - 1) break;
            int t = a[k];
            a[k] = a[k - 1];
            a[k - 1] = t;
            k--;
        }
    }
}
