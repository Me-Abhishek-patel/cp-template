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

public class MergedLIS {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(m);


//        out.printLine(c);
        long res = lengthOfLIS(a) + lengthOfLIS(b);
        out.printLine(res);

    }

    long lengthOfLIS(int[] a) {
        long n = a.length;
        ArrayList<Long> len = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long lb = upperBound(a, a[i]);
            if (lb != len.size()) {
                lb = min(lb, a[i]);
            } else {
                len.add((long) a[i]);
            }
        }
        return len.size();
    }
}
