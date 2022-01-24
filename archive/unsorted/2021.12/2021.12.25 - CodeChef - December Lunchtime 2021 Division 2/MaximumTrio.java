package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class MaximumTrio {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Integer[] a = toIntegerArray(in.readIntArray(n));
        Arrays.sort(a);


        long x = ((long) (a[n - 1] - a[0]) * a[n - 2]);
        long y = ((long) (a[n - 2] - a[0]) * a[n - 1]);
        long z = ((long) (a[n - 1] - a[n - 2]) * a[n - 3]);
        out.printLine(max(max(x, y), z));


    }
}
