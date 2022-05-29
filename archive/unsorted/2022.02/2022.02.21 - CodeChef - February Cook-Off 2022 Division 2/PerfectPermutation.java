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

public class PerfectPermutation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (k == n - 1) {
            out.print(2+" "+1+" ");
            for (int i = 3; i <= n; i++) {
                out.print(i + " ");
            }
            out.printLine();
            return;
        }
        for (int i = 1; i <= k; i++) {
            out.print(i + " ");
        }
        for (int i = k + 2; i <= n; i++) {
            out.print(i + " ");
        }
        if (k + 1 <= n) out.print((k + 1) + " ");
        out.printLine();


    }
}
