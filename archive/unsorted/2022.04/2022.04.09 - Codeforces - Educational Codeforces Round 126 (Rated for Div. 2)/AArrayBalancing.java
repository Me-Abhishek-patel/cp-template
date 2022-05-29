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

public class AArrayBalancing {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] b = in.readIntArray(n);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int y = b[i];
            a[i] = min(x, y);
            b[i] = max(x, y);
        }
        for (int i = 1; i < n; i++) {
            ans += abs(a[i] - a[i - 1]);
            ans += abs(b[i] - b[i - 1]);
        }
        out.printLine(ans);
    }
}
