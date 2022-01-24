package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;
import org.h2.util.MathUtils;

public class BKolyaAndTanya {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();

        final int MOD = (int) 1000000007;
        long total = power(3, 3L * n, MOD);
        long p = power(7, n, MOD);
        long res = total - p;
        if (res < 0)
            res += MOD;
        out.printLine(res);

    }

    public static long power(long base, long exponent, long mod) {
        if (base >= mod) {
            base %= mod;
        }
        if (exponent == 0) {
            return 1 % mod;
        }
        long result = power(base, exponent >> 1, mod);
        result = result * result % mod;
        if ((exponent & 1) != 0) {
            result = result * base % mod;
        }
        return result;
    }
}
