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

import java.util.Arrays;
import java.util.Collections;

public class CIlyaAndMatrix {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Integer[] a = toIntegerArray(in.readIntArray(n));
        Arrays.sort(a, Collections.reverseOrder());
        long[] pref = prefixSumArray(toIntArray(a));

        int i = 1;
        long sum = 0L;

        while (i <= n) {
            sum += pref[i - 1];
            i *= 4;
        }
        out.printLine(sum);

    }
}
