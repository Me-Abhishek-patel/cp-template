package codes;

import static java.lang.Math.*;
import static java.lang.Math.max;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BVikaAndSquares {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int min = minElement(a);
        int first = indexOf(a, min);
        int last = lastIndexOf(a, min);
        int max = first + n - 1 - last;


        int p = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                max = max(max, i - p - 1);
                p = i;
            }
        }
        max = max(max, n - p - 1);

        out.printLine((long) min * (long) n  + max);

    }


}
