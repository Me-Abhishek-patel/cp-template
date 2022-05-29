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

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[][] a = in.readIntTable(n, m);
        if ((n == 1 && m == 1)) {
            out.printLine("YES");
            return;
        }
        if (a[0][0] != a[n - 1][m - 1]) {
            out.printLine("NO");
            return;
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int k = n - i - 1, l = n - 1;
            for (int j = 0; j < n - i; j++, l--) {
                if (a[i][j] != a[l][k]) {
                    out.printLine("NO");
                    return;
                }
            }
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        sum -= (a[0][0] * 2L);
        if (sum != a[0][0])
            out.printLine("NO");
        else
            out.printLine("YES");

    }
}
