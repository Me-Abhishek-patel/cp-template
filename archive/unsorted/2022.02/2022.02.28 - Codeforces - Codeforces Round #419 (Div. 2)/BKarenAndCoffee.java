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

public class BKarenAndCoffee {
    int maxn = 200002;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt(), q = in.readInt();
        int[] a = new int[maxn];
        for (int i = 0; i < n; i++) {
            int l = in.readInt(), r = in.readInt();
            a[l] += 1;
            a[r+1] -= 1;
        }
        for (int i = 1; i < maxn; i++) {
            a[i] += a[i - 1];
        }
        int[] b = new int[maxn];
        for (int i = 1; i < maxn; i++) {
            b[i] = b[i - 1];
            if (a[i] >= k) {
                b[i]++;
            }
        }

        for (int i = 0; i < q; i++) {
            int l = in.readInt(), r = in.readInt();
            out.printLine(b[r] - b[l - 1]);
        }

    }
}
