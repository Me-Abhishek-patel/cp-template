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

public class BAvoidLocalMaximums {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        boolean[] maxima = new boolean[n + 1];
        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                maxima[i] = true;
            }
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (maxima[i - 1]) {
                if (i == n - 1) {
                    a[i] = a[i - 1];
                    count++;
                } else {
                    a[i] = max(a[i - 1], a[i + 1]);
                    count++;
                    if (maxima[i + 1]) {
                        i+=2;
                    }
                }
            }
        }
        out.printLine(count);
        out.printLine(a);
    }
}
