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

public class CMagicalBoxes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[][] a = in.readLongTable(n, 2);
        Arrays.sort(a, (x, y) -> (int) (x[0] - y[0]));
        long max = 0;
        for (int i = 0; i < n; i++) {
            double x = a[i][0] + 1;
            double y = a[i][0];
            while (x < y + log(a[i][1]) / log(4)) {
                x = x + 1;
            }
            max = (long) max(x, max);
        }
        out.printLine(max);
    }
}
