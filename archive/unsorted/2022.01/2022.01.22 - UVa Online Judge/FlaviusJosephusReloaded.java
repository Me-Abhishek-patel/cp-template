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

public class FlaviusJosephusReloaded {
    long n, a, b;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        while (true) {
            n = in.readLong();
            if (n == 0) break;
            a = in.readLong();
            b = in.readLong();
            long slow = next(0), fast = next(next(0));
            while (slow != fast) {
                slow = next(slow);
                fast = next(next(fast));
            }
            fast = 0;
            while (slow != fast) {
                slow = next(slow);
                fast = next(fast);
            }
            int killed = 1;
            fast = next(fast);
            while (slow != fast) {
                killed++;
                fast = next(fast);
            }
            out.printLine(n-killed);
        }
    }

    private long next(long x) {
        return (((a * ((x * x) % n)) % n) + b) % n;
    }

}
