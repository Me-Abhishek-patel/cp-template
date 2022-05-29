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

public class AAvtoBus {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();

        long min = 0, max = 0;
        max += n / 4;
        long rem = n % 4;
        if (n % 2 != 0 || rem % 2 != 0 || n < 4) {
            out.printLine(-1);
            return;
        }
        rem = n % 6;
        min = n / 6;
        if (rem == 2 || rem == 4) min++;
        out.printLine(min + " " + max);

    }
}
