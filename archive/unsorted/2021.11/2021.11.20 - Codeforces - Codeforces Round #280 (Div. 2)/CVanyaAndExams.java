package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CVanyaAndExams {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), r = in.readInt(), avg = in.readInt();
        int[][] a = in.readIntTable(n, 2);
        long sum = 0;
        Arrays.sort(a, (x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);
        for (int i = 0; i < a.length; i++) {
            sum += a[i][0];
        }
        sum = (long) avg * n - sum;
        if (sum <= 0) {
            out.printLine(0);
            return;
        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            long k = min(r - a[i][0], sum);
            sum -= k;
            count += a[i][1] * k;
        }
        out.printLine(count);
    }
}
