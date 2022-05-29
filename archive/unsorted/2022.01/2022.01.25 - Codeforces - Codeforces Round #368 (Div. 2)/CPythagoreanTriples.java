package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CPythagoreanTriples {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        if (n < 3) out.printLine(-1);
        else if (n % 2 == 1) out.printLine((n * n) / 2 + " " + ((n * n) / 2 + 1));
        else out.printLine((n * n / 4 - 1) + " " + (n * n / 4 + 1));

    }
}
