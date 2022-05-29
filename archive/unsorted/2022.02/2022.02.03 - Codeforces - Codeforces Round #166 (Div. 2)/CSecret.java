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

public class CSecret {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (k * 3 > n) {
            out.printLine(-1);
            return;
        }
        int j = 0;
        int l = (n - k) % k;
        for (int i = 2; i <= k; i++) {
            out.print(i + " ");
        }
        out.print(1 + " ");
        n -= k;
        for (int i = 1; i <= n; i++) {
            out.print(++j + " ");
            j = (j) % k;
        }

    }
}
