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

public class DecompositionReaction {
    static long MOD7 = 1000000007;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        long[] q = in.readLongArray(n);
        for (int i = 0; i < m; i++) {
            int c = in.readInt() - 1, x = in.readInt();

            for (int j = 0; j < x; j++) {
                long w = in.readInt();
                int ci = in.readInt() - 1;
                long t = (w % MOD7 * q[c] % MOD7) % MOD7;
                q[ci] = (q[ci] % MOD7 + t % MOD7) % MOD7;
            }
            q[c] = 0;
        }
        for (long i : q) {
            out.printLine(i % MOD7);
        }
    }
}
