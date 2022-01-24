package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

public class ModularGCD {
    final int MOD = (int) (10e9 + 7);

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readLong(), b = in.readLong(), n = in.readLong();
        long A = a, B = b;
        for (int i = 0; i < n - 1; i++) {
            A = ((A % MOD) * (a % MOD)) % MOD;
            B = ((B % MOD) * (b % MOD)) % MOD;
        }
        out.printLine((IntegerUtils.gcd((A % MOD + B % MOD) % MOD, (Math.abs(A - B)) % MOD)) % MOD);

    }
}
