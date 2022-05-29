package codes;

import java.util.AbstractMap;

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

public class CMafia {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long count = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            int smin = min, minidx = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] < min) {
                    minidx = i;
                    smin = min;
                    min = a[i];
                } else if (a[i] < smin) {
                    smin = a[i];
                }
                max = max(max, a[i]);
            }
            if(max<=0) break;
            int diff = smin - min + 1;
            if (diff > max) {
                count += max;
            } else count += diff;
            if(diff<=0) break;


            for (int i = 0; i < n; i++) {
                if (i != minidx) {
                    a[i] -= diff;
                }
            }

        }
        out.printLine(count);

    }
}
