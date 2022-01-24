package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.generated.collections.list.LongArrayList;
import net.cplibrary.generated.collections.list.LongList;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ADivision {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long p = in.readLong(), q = in.readLong();
        LongList divisors = getDivisors(p);
//        LongList divisors = new LongArrayList();
        long res = 1;
        long x = q;
//        out.printLine(divisors);
        for (Long i : divisors) {
            if (i == 1) continue;
            long k = p;
            while (k % q == 0) {
                k = k / i;
            }
            x = max(k, x);
        }
        out.printLine(x);
    }
}
