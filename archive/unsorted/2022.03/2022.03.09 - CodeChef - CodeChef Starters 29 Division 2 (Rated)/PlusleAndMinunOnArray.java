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

public class PlusleAndMinunOnArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int max = 1, min = 0;
//        out.printLine(a);
        for (int i = 0; i < a.length; i++) {
            a[i] = abs(a[i]);
            if (i % 2 == 0) {
                if (a[min] > a[i]) {
                    min = i;
                }
            } else {
                if (a[max] < a[i]) {
                    max = i;
                }
            }
        }
        if (a[max] > a[min]) {
            int t = a[max];
            a[max] = a[min];
            a[min] = t;
        }
        long sum = 0;
//        out.printLine(a);
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) sum += a[i];
            else sum -= a[i];
        }
        out.printLine(sum);
    }
}
