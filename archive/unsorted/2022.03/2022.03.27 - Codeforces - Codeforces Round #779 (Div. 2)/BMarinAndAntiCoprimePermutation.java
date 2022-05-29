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

public class BMarinAndAntiCoprimePermutation {
    int MOD = 998244353;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        if (n % 2 != 0) {
            out.printLine(0);
        } else {
            n /= 2;
            long count = 1;
            for (long i = 1; i <= n; i++) {
                count = (count % MOD * i % MOD) % MOD;
            }
            out.printLine(power(count, 2, MOD));

        }
    }
}
