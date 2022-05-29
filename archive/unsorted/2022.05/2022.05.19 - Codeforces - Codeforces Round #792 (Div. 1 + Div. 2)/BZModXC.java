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

public class BZModXC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readLong(), b = in.readLong(), c = in.readLong();
        long x = a + b + c;
        long y = c + b;
        long z = c;
        out.printLine(x+" "+y+" "+z);
    }
}
