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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BQualityVsQuantity {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }
        Collections.sort(al);
        for (int i = 0; i < a.length; i++) {
            a[i] = al.get(i);
        }
        long bsum = a[0], rsum = a[n - 1], bcount = 1, rcount = 1;
        int i = 1, j = n - 2;
        while (i <= j) {
            if (rsum <= bsum) {
                rsum += a[j--];
                rcount++;
            } else if (rcount >= bcount) {
                bsum += a[i++];
                bcount++;
            } else {
                out.printLine("YES");
                return;
            }
        }
        if (rsum > bsum && rcount < bcount) {
            out.printLine("YES");
            return;
        }
        out.printLine("NO");
    }
}
