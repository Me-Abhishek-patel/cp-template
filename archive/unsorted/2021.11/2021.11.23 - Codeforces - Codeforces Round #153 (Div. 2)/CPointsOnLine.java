package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CPointsOnLine {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), d = in.readInt();
        int[] arr = in.readIntArray(n);
        int j = 0;
        long res = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && (arr[j] - arr[i] <= d)) {
                j++;
            }
            res += Math.max(0, ((long) (j - i - 1) * (long) (j - i - 2)) / 2);
        }
        out.printLine(res);
    }
}
