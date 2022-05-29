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

public class EqualMEX {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arrr = in.readIntArray(2 * n);
        int[] f = new int[100005];
        for (int i : arrr) {
            f[i]++;
        }
        for (int gg = 0; gg < f.length; gg++) {
            if (f[gg] == 1) {
                out.printLine("NO");
                return;
            } else if (f[gg] == 0) {
                out.printLine("YES");
                return;
            }
        }
        out.printLine("YES");

    }

    public int arrangements(int input1) {
        int n = input1;
        if (n <= 1) return 1;
        int[] a = new int[n + 8];
        a[1] = 0;
        a[2] = 1;
        for (int i = 3; i < n; i++) {
            a[i] = (i - 1) * (a[i - 1] + a[i - 2]);
        }
        return a[n];

    }
}
