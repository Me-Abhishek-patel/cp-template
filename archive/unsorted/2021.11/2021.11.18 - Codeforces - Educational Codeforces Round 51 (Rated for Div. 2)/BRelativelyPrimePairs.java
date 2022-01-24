package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BRelativelyPrimePairs {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long l = in.readLong(), r = in.readLong();
        out.printLine("YES");
        for (long i = l; i <= r; i+=2) {
            out.printLine(i+" "+(i+1));
        }
    }
}
